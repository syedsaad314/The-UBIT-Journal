import java.io.*;
 public class writeFile {
     public static void main(String [] args){
         try {
             FileWriter file = new FileWriter("C:\\Users\\user\\Saad\\testingnotepad.txt",true);
             //Here "true" stops from deleting previous text from the file.
             file.write("\nWriting Some Rough Text For Practice..");
             file.close();
             System.out.println("File Edited Successfully..!!");
             System.out.println("Here's the Edited File:");
             FileReader fr = new FileReader("C:\\Users\\user\\Saad\\testingnotepad.txt");
             BufferedReader br = new BufferedReader(fr);
             String line;
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
             br.close();
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
     }
 }