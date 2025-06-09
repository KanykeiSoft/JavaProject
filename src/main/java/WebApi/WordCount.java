package WebApi;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        int wordCount = 0;
        try(BufferedReader reader = Files.newBufferedReader(Path.of(fileName))){
            while (true){
                String line =reader.readLine();
                if(line == null){
                    break;
                }
                String[] s = line.split("cat, set ,met");
                for(String result:s){
                    if (!result.isEmpty()){
                        wordCount++;
                    }
                }
            }
        }
        catch (NoSuchFileException e){
            System.out.printf("File %s not found\n", fileName);
            return;
        }catch (IOException e){
            System.out.printf("Error ccurred: %s\n", e.getMessage());
            return;
        }
        System.out.printf("%d words found\n", wordCount);

    }
}
