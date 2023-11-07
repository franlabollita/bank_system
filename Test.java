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
        
    }
}
