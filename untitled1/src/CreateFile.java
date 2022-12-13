import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void createFile(String txt) throws IOException {
        File file = new File("file.txt");
        if(!file.exists()){
            if(file.createNewFile()){
                System.out.println("file created Successfully");
            } else {
                System.out.println("file can't be created");
            }
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(txt);
        fileWriter.close();
    }

}
