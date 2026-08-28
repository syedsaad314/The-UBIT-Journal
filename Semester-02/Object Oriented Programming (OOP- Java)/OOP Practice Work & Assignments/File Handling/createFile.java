import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class createFile {
         public static void main(String [] args){
         File file = new File("C:\\Users\\user\\Saad\\testingnotepad.txt");
         try {
             if(file.createNewFile())
                 System.out.println("File created");
             else
                 System.out.println("File already exists");
         }
         catch (FileNotFoundException e) {
             System.out.println("File not found");
         }
         catch (IOException e) {
             System.out.println("I/O Error");
         }
         catch (Exception e) {
             System.out.println("Unexpected Error");
         }
     }
 }

