import java.util.*;
import java.io.*;
import java.lang.*;

class immutable
{

public static void main (String args [])
{

String s = "Nilesh Sir "; 
s = s.concat("please give me marks for this practical"); 
System.out.println(s); 

String t = "Nilesh Sir"; 
t.concat("please give me marks for this practical"); 
System.out.println(t); 

}

}