import java.io.*;

public class Streams {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/main/java/Vehicle/input.txt");
        byte[] allByte = is.readAllBytes();
        String result = new String(allByte);
        System.out.println(result);

        Reader reader = new FileReader("src/main/java/Vehicle/input.txt");
        char[] inpit = new char[256];
       int n =  reader.read(inpit);
        System.out.println(new String(inpit, 0, n));



    }
}
