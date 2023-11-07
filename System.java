import java.io.FileWriter;
import java.io.IOException;


public class System {
    
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
        //TO DO: Format client details to line in CSV file
    }

    public String findClientInDatabase(int clientID){
        //TO DO: Find client in CSV file.
        String client = "ID,FIRSTNAME,LASTNAME,BALANCE,CURRENTCREDIT";
        return client;
    }
}
