import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9090);
            System.out.println("Server started at " + ss.getLocalPort());

            Socket cs = ss.accept();
            System.out.println("Client connected successfully!");

            DataInputStream dis = new DataInputStream(cs.getInputStream());
            DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String request = "";

            while (!(request.equalsIgnoreCase("quit"))) {
                request = dis.readUTF();
                if (request.equalsIgnoreCase("quit")) break;

                System.out.println("Client: " + request);

                System.out.print("You: ");
                String kbInput = br.readLine();
                dos.writeUTF(kbInput);
                dos.flush();

                if (kbInput.equalsIgnoreCase("quit")) break;
            }

            System.out.println("Server disconnected.");

            dis.close();
            dos.close();
            br.close();
            cs.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
