import java.util.*;
import java.io.*;
import java.lang.*;
public class vowelconsonant 

{

public static void main(String[] args) 

{

String str;
int vcount = 0, ccount = 0;
Scanner sc=new Scanner (System.in);
System.out.print("Enter String:  ");
str=sc.nextLine();

for(int i = 0; i < str.length(); i++) 

{ 

char ch = str.charAt(i); 
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 

{ 

vcount++; 

} 

else if((ch >= 'a'&& ch <= 'z') || (ch >= 'A'&& ch <= 'Z')) 

{

ccount++;

}

}

System.out.println(str);
System.out.println("Number of Vowels: " + vcount);
System.out.println("Number of Consonants: " + ccount);

}

}