package bank_modules;

public class Login {
    
    private int pinNumber;
    private int cashAmount;
    // private int userCreatedPinNumber;

    // CONSTRUCTOR
    public Login(){
        this.pinNumber = 0000;
        this.cashAmount = 0;
        // this.userCreatedPinNumber = 0;
    }
    
    // SETTERS
        public void setPinNumber(int user_pinNumber){
            if (user_pinNumber < 1000){
                System.out.println("user pin is invalid. Must be 4 digits");
            } else {
               this.pinNumber = user_pinNumber;    
            }
        }

    // GETTERS
        public int getPinNUmber(){
            return this.pinNumber;
        }
        public int cashAmount(){
            return this.cashAmount;
        }

    public boolean confirmPinToAccess(){
        if (this.pinNumber == 2425){
            return true;
        } else {
            return false;
        }
    }
}
