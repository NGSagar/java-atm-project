
import java.util.*;

class ATM1{
    float Balance;
    int PIN = 0707;

    public void checkpin(){
        System.out.println("Enter your pin here:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        //conditions:
        if(enteredpin==PIN){
            System.out.println("Good to go ahead...");
            menu();

        }
        else{
            System.out.println("Invalid pin");
        }
        menu();
    }

    public void menu(){
        System.out.println("Select the Options below:");
        System.out.println("1. Check A/C Balance.");
        System.out.println("2. Withraw Amount.");
        System.out.println("3. Deposite Amount.");
        System.out.println("4. Exit.");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        //conditions:
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositeMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("You've entered wrong option, Please check the options again...");
        }
    }

    //creating Functions:
    public void checkBalance(){
        System.out.println("Balance Amount is: " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter the Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        //conditions;
        if(amount>Balance){
            System.out.println("Insufficient Amount in Your Bank A/C...!!!");
            menu();
        }
        else{
            Balance = Balance - amount;
            System.out.println("Amount withdrawn successfully...");
            menu();
        }
    }

    public void depositeMoney(){
        System.out.println("Enter the Amount to deposite:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance = Balance + amount;
        System.out.println("Amount deposited successfully..");
        menu();
    }
    
    
}

public class ATM_Machine {
    public static void main(String[] args) {

        //creating object:
        ATM1 obj = new ATM1();
        obj.checkpin();
        
    }
    
}
