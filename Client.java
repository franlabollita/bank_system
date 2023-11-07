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

    public void setUserId() {
        //Function from System to set User Id
    }

    public void setCreditLine(float balance) {
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
                
                float creditLine = this.Balance * 1.45f;;
                return creditLine;
            
            case 'B':
                
                creditLine = this.Balance * 1.65f;;
                return creditLine;

            default:
                creditLine = this.Balance;
                return creditLine;
        }
    }


}
