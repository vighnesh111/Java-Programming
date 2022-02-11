import java.util.Scanner;

import java.io.*;

public class matrixdiag


{
	

public static void main(String args[]) 
	

{
		

Scanner s1 = new Scanner(System.in);
		
System.out.println("Enter matrix size");
		
int m = 0;
		
int n=0;
		
int i=0;
		
int j=0;
		
int diag = 0;
		
int ndiag = 0;
		
m = s1.nextInt();
		
n= s1.nextInt();
		
int[][] a=new int[m][n];
		
System.out.println("Enter matrix A");
		
for(i=0;i<m;i++)
	
	
{
		

for(j=0;j<n;j++)
		
	
{
			

a[i][j] = s1.nextInt();	
	
		
}
		

}
		

for(i=0;i<m;i++)
		

{
			

for(j=0;j<n;j++)
		
	
{
			
	
if(i==j)
			
	
{
			
		
diag=diag+a[i][j];
		
		
}
			
	
else
			
	
{
			
		
ndiag=ndiag+a[i][j];
	
			
}
		
	
}
		

}
		

System.out.println("sum of diagonal"+diag);
		
System.out.println("sum of non-diagonal"+ndiag);


}
	

}