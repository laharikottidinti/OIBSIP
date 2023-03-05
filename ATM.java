import java.util.Scanner;
import java.util.ArrayList;
public class ATM
{
    public static ArrayList<Integer> transaction=new ArrayList<Integer>();
    public static int balance=0;
    public static void availableBalance(int balance){
        System.out.println("\nBalance Available: "+balance);
    }


    public static void withdraw(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter amount to withdraw:");
        int amt=sc.nextInt();
        System.out.println("\nProcessing Transaction....");
        if (balance>amt || balance == amt ){
            balance=balance-amt;
            transaction.add(balance);
            System.out.println("\nPlease Collect Money.Thank You......");
            availableBalance(balance);
        }
        else{
            System.out.println("\nInsufficient Balance.Sorry....Please make sure there is money in your card!");
        }
        
    }

    public static void  deposit(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter amount to Deposit:");
        int amt=sc.nextInt();
        System.out.println("\nProcessing Transaction....");
        balance=balance+amt;
        transaction.add(balance);
        availableBalance(balance);
        System.out.println("\nYour money is successfully deposited.Thank You.....");
        


    }
    public static void transfer(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter ACC-NO to transfer the amount:");
        int acc_no=sc.nextInt();
        System.out.println("\nEnter amount to transfer:");
        int amt=sc.nextInt();
        System.out.println("\nProcessing Transaction...");
        if(balance>amt || balance==amt){
            balance=balance-amt;
            transaction.add(balance);
            
            availableBalance(balance);
            System.out.println("\nYour Money is successfully tansfered.Thank You.....");
            

        }
        else{
            System.out.println("\nInsufficient Balance for transfer...Please verify your balance....");
        }
        

    }

    public static void main(String[] args){
        balance=1000;
        int pin;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nPlease Insert Your Card");
        System.out.println("\nPlease enter PIN:");
        pin=sc.nextInt();
        int a;
        while(true){
        System.out.println("\nATM(Automated Teller Machine)");
        System.out.println("\n 1.Withdraw \n 2.Deposit \n 3.Transfer \n 4.Transaction History \n 5.Quit \n ");
        System.out.println("Please Enter your choice:");
        a=sc.nextInt();
        
        switch(a){
            case 1:
               availableBalance(balance);
               withdraw(balance);
               break;

            case 2:
               availableBalance(balance);
               deposit(balance);
               break;

            case 3:
               availableBalance(balance);
               transfer(balance);
               break;
            
            case 4:
               for(int i: transaction){
               
                System.out.println("\nBalance after Transaction: \n"+i);
               }
            
            case 5:
               System.out.println("\nThank You...Visit Again!!");
               System.exit(0);


        }
        }

    }
    
}