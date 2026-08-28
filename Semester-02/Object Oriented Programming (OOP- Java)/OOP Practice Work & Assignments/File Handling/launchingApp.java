import java.io.*;

public class launchingApp {
    public static void main(String[] args) {

        //reading a file and displaying text on console
        try{
            FileReader fr = new FileReader("C:/Users/wtc/Desktop/lorem ipsum.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        //launching an application
        //Runtime.getRuntime().exec("notepad");

        //launching specified file in an application
        try {
            //Runtime.getRuntime().exec("notepad C:/Users/wtc/Desktop/lorem ipsum.txt");
            //new ProcessBuilder("notepad", "C:/Users/wtc/Desktop/lorem ipsum.txt").start(); new, safer, recommended
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

