public class Client {
    //CLIENT IS CURRENTLY ONLY PERSONAL TYPE
    int UserId;
    String FirstName;
    String LastName;
    float Balance;
    float CurrentCredit;
    float CreditLine;


    //setters
    public void setName(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public void setBalance(float balance) {
        this.Balance = balance;
    }

    public void setUserId(int id) {
        this.UserId = id;
    }

    public void setCreditLine() {
        this.CreditLine = calculateCreditLine('P');
    }

    //getters
    public int getID() {
        return UserId;
    }

    public float getBalance() {
        return Balance;
    }

    public String getName() {
        return FirstName + ' ' + LastName;
    }

    //Functions
    public int generateClientID(){

        //TO DO

        int id = 0;
        return id;
    }

    public float calculateCreditLine(char clientType){
        switch (clientType) {
            case 'P':
                
                float creditLine = 10000.00f;
                return creditLine;
            
            case 'B':
                
                creditLine = 20000.00f;
                return creditLine;

            default:
                creditLine = 5000.00f;
                return creditLine;
        }
    }


}
