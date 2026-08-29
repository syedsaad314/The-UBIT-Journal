import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket listening on port 5000
            ServerSocket SS = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Accept a client connection
            Socket socket = SS.accept();
            System.out.println("Client connected!");

            //  Setup input/output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //  Send a welcome message to client
            out.println("Hello Client, you are connected to the server!");
            System.out.println("Welcome message sent to client.");

            //  Communication loop
            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                System.out.println("Client says: " + clientMessage);

                // Termination check
                if (clientMessage.equalsIgnoreCase("bye")) {
                    out.println("Goodbye! Server closing connection...");
                    break;
                }

                // Server replies
                out.println("Server received: " + clientMessage);
            }

            //  Close connections
            socket.close();
            SS.close();
            System.out.println("Connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

