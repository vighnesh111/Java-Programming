import java.util.*;
import java.lang.*;
import java.io.*;
class Student

{

public int id;
public String name;
public String tuid;
public void det()

{

Scanner s1 = new Scanner(System.in);
System.out.print("Enter Name:");	
name = s1.nextLine();
System.out.print("Enter Unique I.D. No.: ");		
tuid = s1.nextLine();	
System.out.print("Enter Roll No.: ");		
id = s1.nextInt();	
	 
}

}

class Test extends Student

{

public int Marks1;
public int Marks2;
public void mark()

{

Scanner s1 = new Scanner(System.in);
System.out.print("Enter marks of subject 1:");
Marks1= s1.nextInt();
System.out.print("Enter marks of subject 2:");
Marks2= s1.nextInt();

}

}

class Result extends Test

{

public int Total;
public void Calculate()

{

Total=0;
Total=Marks1+Marks2;

}

public void dis()

{

System.out.println("Name: "+name);	
System.out.println("Roll No.: "+id);
System.out.println("Unique ID: "+tuid);
System.out.println("Mark1: "+Marks1);	
System.out.println("Mark2: "+Marks2);	
System.out.println("Total: "+Total);
	
}

}

public class studinherit

{

public static void main(String args[]) 

{
		
Result n=new Result();
n.det();
n.mark();
n.Calculate();
n.dis();
		
}

}
