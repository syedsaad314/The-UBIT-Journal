 import java.io.File;
 import java.util.Date;
 import java.text.SimpleDateFormat;
 
 public class fileInfo {
     public static void main(String [] args){
         File file = new File("C:\\Users\\user\\Saad\\testingnotepad.txt");
         if(file.exists()){
             System.out.println("File exists. Here are the details:");
             System.out.println("File name: " + file.getName());
             System.out.println("File size: " + file.length());
             System.out.println("File location: " + file.getAbsolutePath());
             //Here Converting Date into Simple Format..
             long lastModifiedMillis = file.lastModified();
             Date lastModifiedDate = new Date(lastModifiedMillis);
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
             String formattedDate = sdf.format(lastModifiedDate);
             System.out.println("Last Modified: " + formattedDate);
         }
         else
             System.out.println("File does not exist.");
         }
     }
