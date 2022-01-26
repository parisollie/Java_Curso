import com.aliasi.tokenizer.IndoEuropeanTokenizerFactory;
import com.aliasi.tokenizer.TokenizerFactory;
import com.aliasi.lm.TokenizedLM;
import com.aliasi.util.Files;
import com.aliasi.util.ScoredObject;
import com.aliasi.util.AbstractExternalizable;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io. FileNotFoundException;

import java.util.SortedSet;
import java.util.Properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InterestingPhrasesDb_CAE100 {

    private static int NGRAM = 3;
    private static int MIN_COUNT = 3;
    private static int MAX_NGRAM_REPORTING_LENGTH = 4;
    private static int NGRAM_REPORTING_LENGTH = 3;
    private static int MAX_COUNT = 100;
    private static String GET_ABSTRACT_TEXT_SQL = "SELECT abstract FROM ";
    private static String GET_TITLE_TEXT_SQL = "SELECT title FROM ";


    private static Connection mCon;
    private static Properties mDbProperties;

    public static void main(String[] args) throws Exception {

// Parameters for this example:
// args[0] = "db.properties";
// args[1] = "hdlg";
// args[2] = "numb";
// args[3] = "apoptosis";

	openDb(args[0]);
        String trainingDataSQLTableName=args[1];
        String testDataSQLTableName=args[2];
        String textSource=args[3];


	TokenizerFactory tokenizerFactory = IndoEuropeanTokenizerFactory.INSTANCE;

	System.out.println("Training background model");
	TokenizedLM backgroundModel = buildModel(tokenizerFactory, NGRAM, trainingDataSQLTableName, textSource);
	
	backgroundModel.sequenceCounter().prune(3);

	System.out.println("\nAssembling collocations in Training");
	SortedSet<ScoredObject<String[]>> coll = backgroundModel.collocationSet(NGRAM_REPORTING_LENGTH, MIN_COUNT,MAX_COUNT);

	System.out.println("\nCollocations in Order of Significance:");
	report(coll);

        if(!testDataSQLTableName.equalsIgnoreCase("none"))
         {
	  System.out.println("Training foreground model");
	  TokenizedLM foregroundModel = buildModel(tokenizerFactory, NGRAM, testDataSQLTableName, textSource);
	  foregroundModel.sequenceCounter().prune(3);

	  System.out.println("\nAssembling New Terms in Test vs. Training");
	  SortedSet<ScoredObject<String[]>> newTerms = foregroundModel.newTermSet(NGRAM_REPORTING_LENGTH, MIN_COUNT, MAX_COUNT, backgroundModel);

	  System.out.println("\nNew Terms in Order of Signficance:");
	  report(newTerms);
	 }	
        closeDb();

	System.out.println("\nDone.");
    } 

    /* open database connection */
    public static void openDb(String filename) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, FileNotFoundException, IOException {

        // load database properties from file
        mDbProperties = new Properties();
        InputStream in = new FileInputStream(filename);
        mDbProperties.load(in); 

        // compose database url: jdbc:mysql://<hostname>:<port>/<database>
        String dbUrl = "jdbc:mysql://" 
            + mDbProperties.getProperty("hostname") 
            + ":" 
            + mDbProperties.getProperty("port")
            + "/CAE";
        String username = mDbProperties.getProperty("username");
        String password = mDbProperties.getProperty("password");

        // instantiate mysql driver manager, get database connection
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        mCon = DriverManager.getConnection(dbUrl,username,password);
    }

    /* close database connection */
    public static void closeDb() {
        try { 
            mCon.close(); 
        } catch (SQLException se) {
        } 
    }


    private static TokenizedLM buildModel(TokenizerFactory tokenizerFactory, int ngram, String SQLTableName, String textSource) throws Exception {

	TokenizedLM model = new TokenizedLM(tokenizerFactory, ngram);
	System.out.println("Training on "+ SQLTableName);
		   
        Statement stmt = mCon.createStatement();         
        ResultSet rs = null;
        if(textSource.equalsIgnoreCase("abstract")) rs = stmt.executeQuery(GET_ABSTRACT_TEXT_SQL+SQLTableName);
        if(textSource.equalsIgnoreCase("title")) rs = stmt.executeQuery(GET_TITLE_TEXT_SQL+SQLTableName);

System.err.println("textSource="+textSource);
        String text="";
        int i=0;
	while(rs.next()) {
	    text = rs.getString(1);
            i++;
	    model.handle(text);
	}
System.err.println("texts="+i);
	return model;
    }

    private static void report(SortedSet<ScoredObject<String[]>> nGrams) {
        for (ScoredObject<String[]> nGram : nGrams) {
	    double score = nGram.score();
	    String[] toks = nGram.getObject();
	    report_filter(score,toks);
	}
    }
    
    private static void report_filter(double score, String[] toks) {
	String accum = "";
	for (int j=0; j<toks.length()); ++j) {
//	    if (nonCapWord(toks[j])) return;
            if (accum.length()>=9) return;
{
 //           if (accum.indexOf ("HDLG"))
 //           if (accum.indexOf(" ");
	    accum += " "+toks[j];
	}
	System.out.println("Score: "+score+" with :"+accum);
    }}

    private static boolean nonCapWord(String tok) {
	if (!Character.isUpperCase(tok.charAt(0)))
	    return true;
	for (int i = 1; i < tok.length(); ++i) 
	    if (!Character.isLowerCase(tok.charAt(i))) 
		return true;
	return false;
   }

}
