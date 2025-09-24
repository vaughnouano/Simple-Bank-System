package bank_modules;

public class Withdraw {
    
    private double cash;

    Login login;
    // CONSTRUCTOR
    public Withdraw(){
        this.cash = 0.0;
    }

    // SETTER
    public void setAmountWithdraw(double amount){
        if (login.confirmPinToAccess())
        {
            if (amount <= this.cash){
                this.cash = this.cash - amount;
            } else {
                System.out.println("There's not enough cash in your account for that amount.");
            }
        } else {
            System.err.println("Not allowed!");
        }
    }

    // GETTER
    public double getAmountWithdraw(){
        return this.cash;
    }
}
