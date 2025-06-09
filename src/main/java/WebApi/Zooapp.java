package WebApi;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Zooapp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animals> zoo = new ArrayList<>();
        zoo.add(new Animals("Murka", "Cat", 3));
        zoo.add(new Animals("Bobik", "Dog", 5));
        zoo.add(new Animals("Kesha", "Parrot", 2));


        try (FileOutputStream fos = new FileOutputStream("animals.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(zoo);
            oos.flush();
        }
        byte[] bytes = Files.readAllBytes(Path.of("animals.bin"));

        try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes))){

           Object obj = ois.readObject();

            List<Animals> loadedZoo = (List<Animals>) obj;
           for(Animals  animal: loadedZoo){
               System.out.println(animal);
           }

        }

    }
}
