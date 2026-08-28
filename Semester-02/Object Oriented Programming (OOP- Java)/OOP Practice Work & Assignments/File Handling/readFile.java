import java.io.*;
 public class readFile {
     public static void main(String [] args){
         try {
             FileReader fr = new FileReader("C:\\Users\\user\\Saad\\testingnotepad.txt");
             BufferedReader br = new BufferedReader(fr);
             String line;
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
             br.close();
         }
         catch (IOException e) {
             System.out.println(e.getMessage());
         }
     }
     
 }
