import java.util.*;
import java.io.*;
import java.lang.*;
class area

{  

static int areaoverloading(int a,int b){return a*b;}  
static int areaoverloading(int c){return c*c;}  
static double areaoverloading(double d){return d*d*3.14;}  
static double areaoverloading(double e, double f){return e*f*0.5;}  

}  

class areaoverloading

{

public static void main(String[] args)

{  
int a,b,c;
double d,e,f;

Scanner sc=new Scanner (System.in);
System.out.print("Enter Number:  ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextDouble();
e=sc.nextDouble();
f=sc.nextDouble();
System.out.println("");  
System.out.println("Area rectangle: "+area.areaoverloading(a,b));  
System.out.println("");  
System.out.println("Area square: "+area.areaoverloading(c));
System.out.println("");  
System.out.println("Area circle: "+area.areaoverloading(d));  
System.out.println("");  
System.out.println("Area triangle: "+area.areaoverloading(e,f));  

}

}  
