import java.util.*;
public class Main{
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.menu();
    }
}
class ATM{
    static int balance;
    static int password=1234;
    public static void menu(){
        System.out.println("press 1: for Enter Password");
        System.out.println("press 2: for deposit");
        System.out.println("press 3: for withdraw");
        System.out.println("press 4: for balance check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            passwordcheck();
        }
        else if(n==2){
            Deposit();
        }
        else if(n==3){
            Withdraw();
        }
        else if(n==4){
            Balance();
        }

    }
    public static void passwordcheck(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password");
        int pw=sc.nextInt();
        if(pw==password){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Enter Valid Password");
        }
        System.out.println();
        menu();


    }
    public static void Deposit(){
        System.out.println("Enter Amount to Deposit");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        balance+=amount;
        System.out.println("Deposited successfully");
        menu();

    }
    public static void Withdraw(){
        System.out.println("Enter Amount to withdraw");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        System.out.println("Withdrawn successfully");
        balance-=amount;
        menu();

    }
    public static void Balance(){
        System.out.println("Account Balance: "+balance);
        menu();
    }
    
}


