import java.lang.System;

public class Test {
    
    public void testUsers() {
        // Create a User instance
        Client client = new Client();

        // Set the name and ID
        client.setName("Frederick", "Douglas");
        //Set the balance
        client.setBalance(1200.00f);

        // Test the getName() method
        if("Frederick Douglas".equals(client.getName())){
            System.out.println("SUCCESS: Got correct name");
        }else{
            System.out.println("ERROR: Got incorrect name");
            System.out.println("--- RETURNED: " + client.getName() + " - EXPECTED: " + "Frederick Douglas");
        }
        // Test the getId() method
        if(1200.00f == client.getBalance()){
            System.out.println("SUCCESS: Got correct balance");
        }else{
            System.out.println("ERROR: Got incorrect balance");
            System.out.println("--- RETURNED: " + client.getBalance() + " - EXPECTED: " + 1200.00);
        }
    }

    public void testSystem(){
        Client client1 = new Client();
        client1.setName("Frederick", "Douglas");
        client1.setBalance(1200.00f);
        client1.setUserId(123);
        client1.setCreditLine();

        Client client2 = new Client();
        client2.setName("Whoopie", "Goldberg");
        client2.setBalance(1503.78f);
        client2.setUserId(456);
        client2.setCreditLine();

        BankSystem system = new BankSystem();
        system.createClientList("database.csv");
        system.addClientToDatabase(client1);
        system.addClientToDatabase(client2);

        String clientFound = system.findClientInDatabase(client2.UserId);
        if("456,Whoopie,Goldberg,1503.78,10000.00".equals(clientFound)){
            System.out.println("SUCCESS: Got correct client");
        }else{
            System.out.println("ERROR: Got incorrect client");
            System.out.println(clientFound);
        }

    }
}
