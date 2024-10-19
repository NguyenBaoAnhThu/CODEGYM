package File.Demo;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File myfile = new File("./src/DemoFile.txt");
        if(myfile.exists()){
            if(myfile.canWrite()){
                System.out.println("File can write");
                try {
                    FileWriter fw = new FileWriter("./src/DemoFile.txt");
                    String content = "Day la noi dung ghi vao file";
                    fw.write(content);

                    fw.close();
                }
                catch(IOException e){
                    throw new IOException(e);
                }
            }
            else {
                System.out.println("File can't write");
            }
        }
        else {
            System.out.println("File does not exist");
        }
    }






//            // Một số phương thuc cua file
//            // get ten file
//            System.out.println("Name file " + myFile.getName());
//            System.out.println("File already exists");
//        }else {
//            System.out.println("File not found");
        }


