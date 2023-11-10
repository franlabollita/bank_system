import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;

public class BankSystem {
    
    String ClientList;

    public void createClientList(String csvFileName){
         try (FileWriter writer = new FileWriter(csvFileName)) {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        this.ClientList = csvFileName;
    }

    ///
    public void addClientToDatabase(Client client){
        String clientStr = String.format("%d,%s,%s,%.2f,%.2f", client.getID(), client.FirstName, client.LastName, client.getBalance(), client.CreditLine);

        try{
            FileWriter fileWriter = new FileWriter(this.ClientList, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(clientStr);
            bufferedWriter.newLine(); 
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String findClientInDatabase(int clientID){
        
        String client = "ID,FIRSTNAME,LASTNAME,BALANCE,CURRENTCREDIT";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.ClientList));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                if(id == clientID){
                    client = line;
                    reader.close();
                    return client;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return client;
    }
}
