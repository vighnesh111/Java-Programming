import java.util.*;
import java.lang.*;
import java.io.*;
class oddexcp extends Exception

{

oddexcp(String message)

{

System.out.println(message);

}

}

class exceptionodd

{

public static void main(String args[])

{

Scanner s1 = new Scanner(System.in);
System.out.println("Enter number");
int num = s1.nextInt();
try

{

if(num%2!=0)

{

throw new oddexcp("Odd Number");

}

}

catch(oddexcp e )

{

System.out.println("Caught");

}

}

}                                            
         
