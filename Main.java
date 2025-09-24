import java.util.Scanner;

import bank_modules.Login;
import bank_modules.Withdraw;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            Login login = new Login();
            login.setPinNumber(2425);
                System.out.println("Welcome to PhilBank!");
                System.out.println(" ");

                int user_pinNumber = 0;
                while (user_pinNumber < 1000)
                {
                    System.out.print("enter your pin: ");
                    user_pinNumber = sc.nextInt(); 
                    login.setPinNumber(user_pinNumber);
                }

                if (login.confirmPinToAccess())
                {
                    Withdraw withdraw = new Withdraw();

                    System.out.println("============================");
                    System.out.println("a. Withdraw");
                    System.out.print("enter choice: ");

                    char choice = sc.next().charAt(0); 

                        switch(choice){
                            case 'a': 
                                System.out.print("Enter amount to withdraw: ");
                                double amount = sc.nextDouble();
                                withdraw.setAmountWithdraw(amount);
                            break;

                            default:
                                System.out.println("Invalid input.");
                        }
                } else {
                    System.err.println("Password incorrect. Acces Denied");
                }
            
            

        sc.close();
    }
}