import java.util.*;
import java.io.*;
import java.lang.*;
public class stringoperations

{
    
public static void main(String[] args) {
String test = "My name is vighnesh and I am 19 years old and my favourite symbol is $";
count(test);

}

public static void count(String x)

{

char[] ch = x.toCharArray();
int letter = 0;
int space = 0;
int num = 0;
int symbol = 0;
for(int i = 0; i < x.length(); i++)

{

if(Character.isLetter(ch[i]))

{

letter ++ ;

}

else if(Character.isDigit(ch[i]))

{

num ++ ;
			
}

else if(Character.isSpaceChar(ch[i]))

{

space ++ ;

}

else

{

symbol ++;

}

}

System.out.println("My name is vighnesh and I am 19 years old and my favourite symbol is $");
System.out.println("letter: " + letter);
System.out.println("space: " + space);
System.out.println("number: " + num);
System.out.println("symbol: " + symbol);
			
}

}