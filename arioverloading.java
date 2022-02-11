import java.util.*;
import java.io.*;
import java.lang.*;
class Solve

{  

static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;} 
static int sub(int a,int b){return a-b;}  
static int sub(int a,int b,int c){return a-b-c;} 
static int mult(int a,int b){return a*b;}  
static int mult(int a,int b,int c){return a*b*c;} 
static int div(int a,int b){return a/b;}  
static int div(int a,int b,int c){return (a/b)/c;} 
}  

class arioverloading

{

public static void main(String[] args)

{  

int a,b,c;
Scanner sc=new Scanner (System.in);
System.out.print("Enter Number:  ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println("");  
System.out.println(Solve.add(a,b));  
System.out.println(Solve.add(a,b,c));  
System.out.println("");  
System.out.println(Solve.sub(a,b));  
System.out.println(Solve.sub(a,b,c));  
System.out.println("");  
System.out.println(Solve.mult(a,b));  
System.out.println(Solve.mult(a,b,c));  
System.out.println("");  
System.out.println(Solve.div(a,b));  
System.out.println(Solve.div(a,b,c));  

}

}  
