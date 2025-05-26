import java.io.*;
import java.nio.charset.StandardCharsets;

public class Streams {
    public static void main(String[] args) throws IOException {
//        InputStream is = new FileInputStream("src/main/java/Vehicle/input.txt");
//        byte[] allByte = is.readAllBytes();
//
//        for(byte b: allByte){
//            System.out.printf("%d ", b);
//        }
//        System.out.println();
//
//
//        Reader reader = new FileReader("src/main/java/Vehicle/input.txt");
//        char[] inpit = new char[256];
//       int n =  reader.read(inpit);
//        System.out.println(new String(inpit, 0, n));


        Writer writer = new OutputStreamWriter(
                new FileOutputStream("src/main/java/Vehicle/input.txt"),
                StandardCharsets.UTF_8 // <-- Вот тут задаем кодировку
        );
        writer.write("Aidar is my love");
        writer.flush();
        writer.close(); // Тоже закрываем
    }


    }

