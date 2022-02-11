import java.util.*;

import java.lang.*;

import java.io.*;

public class transpose


{

	
public static void main(String args[]) 

	
{
		

Scanner s1 = new Scanner(System.in);
		
System.out.println("Enter matrix size");
		
int m = 0;
		
int n=0;
		
int i=0;
		
int j=0;
		
m = s1.nextInt();
		
n= s1.nextInt();
		
int[][] a=new int[m][n];
		
int[][] b=new int[m][n];
		
int[][] c=new int[m][n];
		
System.out.println("Enter matrix A");
		
for(i=0;i<m;i++)
		

{
		

for(j=0;j<n;j++)
		
	
{
			

a[i][j] = s1.nextInt();	
	
		
}
		

}

		

System.out.println("Transpose of A" );	
		
for(i=0;i<m;i++)
		

{
		

for(j=0;j<n;j++)
		
	
{
			

System.out.print(" "+a[j][i] );	

			
}
		

System.out.println("" );
	
	
}
		
	

}


}