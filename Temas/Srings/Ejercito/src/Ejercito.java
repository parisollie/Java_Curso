import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ejercito {
	FileInputStream input;
	
	public static void main(String[] args){
		int week;
		int men = 1000;
		Army army = new Army();
		try {
			Scanner scan = new Scanner(new File("regiments.txt"));
			while(scan.hasNextLine()){
				String line[] = scan.nextLine().split(" ");
				Regiment r = new Regiment(Integer.valueOf(line[0]),line[1],men);
				army.addRegiment(r);
				men -= 50;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file...");
			System.exit(0);
		}
		
		for(week = 1; week <= 20; week++){
			army.printReport(week);
			army.addStrength();
		}
	
	}
}