import java.io.*;
 public class useOfBufferedWriter {
     public static void main(String [] args){
         try{
             FileWriter fw = new FileWriter("C:\\Users\\user\\Saad\\testingnotepad.txt",true);
             BufferedWriter bw = new BufferedWriter(fw);
             bw.write("\nAgain Writing Some Rough Text For Practice..");
             bw.close();
             System.out.println("File Edited Successfully..!");
             System.out.println("Here's the Edited File:");
             FileReader fr = new FileReader("C:\\Users\\user\\Saad\\testingnotepad.txt");
             BufferedReader br = new BufferedReader(fr);
             String line;
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
             br.close();
         }
         catch(IOException e){
             e.printStackTrace();
         }
     }  
 }   

