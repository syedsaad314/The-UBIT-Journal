import java.io.*; 
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server on localhost:5000
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            // Setup communication channels
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            //  Read server's welcome message
            System.out.println("Server: " + in.readLine());

            // Start chat loop
            while (true) {
                System.out.print("You: ");
                String msg = scanner.nextLine();

                // Exit condition
                if (msg.equalsIgnoreCase("bye")) {
                    out.println(msg);
                    System.out.println("Server: " + in.readLine());
                    break;
                }

                //  Send message to server
                out.println(msg);

                // Read server response
                String response = in.readLine();
                if (response == null) {
                    System.out.println("Server closed the connection.");
                    break;
                }
                System.out.println("Server: " + response);
            }

            //  Close all resources
            socket.close();
            scanner.close();
            System.out.println("Connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
