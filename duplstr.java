import java.util.*;
import java.io.*;
import java.lang.*;
public class duplstr 

{

public static void main(String args[]) 

{

String str;
int cnt = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
str = sc.nextLine();
char[] inp = str.toCharArray();
System.out.println("Duplicate Characters are:");
for (int i = 0; i < str.length(); i++) 

{

for (int j = i + 1; j < str.length(); j++) 

{

if (inp[i] == inp[j]) 

{

System.out.println(inp[j]);
cnt++;
break;

}

}

}

}

}
