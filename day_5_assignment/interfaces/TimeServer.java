package day_5_assignment.interfaces;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


//5. Nested Interface for Callback Handling
//•	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
//•	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
//•	Implement at least two classes implementing Client, registering them, and simulate notifications.


public class TimeServer {

    
    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private final List<Client> clients = new ArrayList<>();

    
    public void registerClient(Client client) {
        if (client != null) {
            clients.add(client);
            System.out.println("Client registered: " + client.getClass().getSimpleName());
        }
    }

  
    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client client : clients) {
            client.updateTime(now);
        }
    }

    
    public static void main(String[] args) {
        TimeServer server = new TimeServer();

       
        class DigitalClock implements Client {
          
            public void updateTime(LocalDateTime now) {
                System.out.println("Digital Clock Updated: " + now);
            }
        }

       
        class LoggerService implements Client {
            
            public void updateTime(LocalDateTime now) {
                System.out.println("Logger Service recorded time: " + now);
            }
        }

     
        server.registerClient(new DigitalClock());
        server.registerClient(new LoggerService());

        System.out.println("sending notifications : : ");
        server.notifyClients();
    }
}
