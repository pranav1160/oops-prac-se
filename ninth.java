// Using concepts of Object-Oriented programming develop solution for Banking system having following operations : 1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit 5. Check the balance 6. Display Particular Account information 7. Diaplsy all Records

import java.util.Scanner;

class Account{
    String name;
    int balance;
    int dailyLimit;
    int dailyAmount;

    Account(String n,int b,int dl,int da){
        name = n;
        balance =b;
        dailyLimit = dl;
        dailyAmount = 0;
    }

    void depositMoney(int extra){
        balance+=extra;
        System.out.println(extra+" added so your balance is "+balance);
    }

    void WithdrawMoney(int takeMoney){
        if(balance<takeMoney){
            System.out.println("insufficient balance");
            return;
        }

        if(takeMoney>dailyLimit){
            System.out.println("it exceeds the daily Limit");
            return;
        }

        if(dailyAmount+takeMoney>dailyLimit){
            System.out.println("you have taken money today enter less amount");
            return;
        }

        dailyAmount+=takeMoney;
        balance-=takeMoney;

        System.out.println(takeMoney+" withdrawn so balance is "+balance);
        

    }

    void checkBalance(){
        System.out.println("your balance is "+balance);
    }

    void display(){
        System.out.println("-----------"+name+"------------------");
        System.out.println("balance :"+balance);
        System.out.println("daily limit"+dailyLimit);
        System.out.println("daily amount"+dailyAmount);
    }

}
public class ninth {
    public static void main(String[] args) {

        int choice;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------WELCOME---------------");
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter balance");
        int balance = sc.nextInt();
        System.out.println("enter your dailyLimit");
        int dl = sc.nextInt();
        Account acc = new Account(name, balance, dl, 0);

        do{
            System.out.println("enter 1 to deposit money");
            System.out.println("enter 2 to withdraw money");
            System.out.println("enter 3 to check balance");
            System.out.println("enter 4 to display records");
            choice = sc.nextInt();


            switch (choice) {
                case 1: System.out.println("enter money to deposit");
                        int a = sc.nextInt();
                        acc.depositMoney(a);
                        System.out.println();
                        break;
                case 2: System.out.println("enter money to withdraw");
                        int w = sc.nextInt();
                        acc.WithdrawMoney(w);
                        System.out.println();
                        break;
                case 3: System.out.println("check balance");
                        acc.checkBalance();
                        System.out.println();
                        break;
                case 4: acc.display();
                        System.out.println();
                        break;
                default:System.out.println("thankyou for your service");
                        System.out.println();
                        break;
            }

        }while(choice!=5);

        
        sc.close();
    }
    
}
