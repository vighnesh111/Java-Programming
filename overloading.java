import java.util.*;
import java.io.*;
import java.lang.*;
class Adder

{  

static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;} 

}  

class overloading

{

public static void main(String[] args)

{  

int a,b,c;
Scanner sc=new Scanner (System.in);
System.out.print("Enter Number:  ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println(Adder.add(a,b));  
System.out.println(Adder.add(a,b,c));  

}

}  
