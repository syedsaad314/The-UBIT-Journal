import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) {
        try {
            Socket cs = new Socket("localhost", 9090);
            System.out.println("Connected to server successfully!");

            DataInputStream dis = new DataInputStream(cs.getInputStream());
            DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String msg = "";

            while (!(msg.equalsIgnoreCase("quit"))) {
                System.out.print("You: ");
                msg = br.readLine();
                dos.writeUTF(msg);
                dos.flush();

                if (msg.equalsIgnoreCase("quit")) break;

                String response = dis.readUTF();
                if (response.equalsIgnoreCase("quit")) break;
                System.out.println("Server: " + response);
            }

            System.out.println("Client disconnected.");

            dis.close();
            dos.close();
            br.close();
            cs.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

