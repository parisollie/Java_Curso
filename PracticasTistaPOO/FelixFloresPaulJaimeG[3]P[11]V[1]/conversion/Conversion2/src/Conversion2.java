import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Conversion2  {

    public static void main(String[] args) {

        try {

            // convert file to byte[]
            byte[] bFile = readBytesFromFile("C:\\Users\\andro\\Desktop\\Hola.txt");

            //java nio
            //byte[] bFile = Files.readAllBytes(new File("C:\\temp\\testing1.txt").toPath());
            //byte[] bFile = Files.readAllBytes(Paths.get("C:\\temp\\testing1.txt"));

            // save byte[] into a file
            Path path = Paths.get("C:\\Users\\andro\\Desktop\\hello.txt");
            Files.write(path, bFile);

            System.out.println("Su numero binario del archivo es : ");

            //Print bytes[]
            for (int i = 0; i < bFile.length; i++) {
                System.out.print((char) bFile[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static byte[] readBytesFromFile(String filePath) {

        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try {

            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return bytesArray;

    }

}
