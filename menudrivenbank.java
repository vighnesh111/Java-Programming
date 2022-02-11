import java.util.*;
import java.io.*;
import java.lang.*;
class menudrivenbank 

{

   public static void main(String[] args) 

{
     
createAccount();
deposit();
withdraw();
computeInterest();


}

private static void createAccount()

{

String name,email;
double phno;
Scanner sc = new Scanner(System.in);
System.out.println("Enter name:");	
name = sc.nextLine();
System.out.println("Enter phone number:");	
phno = sc.nextDouble();

private static void deposit()

{

double dep, confirm;
Scanner sc = new Scanner(System.in);
System.out.println("Enter amount to deposit:");	
dep = sc.nextDouble();
System.out.println("Confirm amount:");	
dep = sc.nextDouble();
System.out.print("Amount deposited successfully:");	

}

private static void withdraw()

{

double wid, confirmwid;
Scanner sc = new Scanner(System.in);
System.out.println("Enter amount to withdraw:");	
wid = sc.nextDouble();
System.out.println("Confirm amount:");	
confirmwid = sc.nextDouble();
System.out.println("Amount withdrawled successfully:");	

}

private static void computeInterest()

{

System.out.println("Rate of Interest on Withdrawl: 7%");

}

}


