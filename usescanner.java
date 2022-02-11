import java.util.*;
import java.io.*;
import java.lang.*;
class usescanner
{

static int roll,age;
static double feespaid;
static String name,sex;

public static void main(String args[])

{

Scanner sc = new Scanner(System.in);
System.out.println("Enter Name:");
name = sc.nextLine();
System.out.println("Enter Gender:");
sex = sc.nextLine();
System.out.println("Enter Roll no:");
roll = sc.nextInt();
System.out.println("Enter Age:");
age = sc.nextInt();
System.out.println("Enter Feespaid:");
feespaid = sc.nextDouble();
System.out.println("Your Name is:"+name);
System.out.println("Your Age:"+age);
System.out.println("Your Gender is:"+sex);
System.out.println("Your Roll no is:"+roll);
System.out.println("Amount paid:"+feespaid);

}

}