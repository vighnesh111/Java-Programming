import java.io.*;

import java.util.*;
import java.lang.*;  

class fact_or_rev
{ 
     
        
static int factorial (int x)
        
{
            
int fact=1;
            
while(x>1)
           
{
                
fact=fact*x;
                
x--;
            
}
            
return fact;
        
}
        
static void reverse ()
        
{
            
StringBuffer z0 = new StringBuffer();  
            
StringBuffer z1 = new StringBuffer();  
            
String s1;
            
String s2;
           
Scanner input=new Scanner (System.in); 
            
z0.append(input.nextLine());
            
z1.append(z0);
            
z0.reverse();
            
s1 = z0.toString();
            
s2 = z1.toString();
           
System.out.println("INPUT: " + s2); 
   
System.out.println("OUTPUT " + s1); 
                       
System.out.println("Is it a Palindrome? "+s1.equals(s2));
        
}
        

public static void main(String[] args) 
   
{
    	
Scanner s = new Scanner(System.in);
    	
int num =0;
        
int choice =0;
        
System.out.println("Please choose");
        
System.out.println("1. Factorial");
        
System.out.println("2. Reverse");
        
choice = s.nextInt();
        
if(choice==1)
        
{
            
num = s.nextInt();
        
System.out.println(factorial(num));
        
}
        
if(choice==2)
       
{  
            
reverse();
        
}
           
    
}

} 

