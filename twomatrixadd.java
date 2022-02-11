import java.util.Scanner;

public class twomatrixadd


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

		
System.out.println("Enter matrix B");
		
for(i=0;i<m;i++)

		
{

		
for(j=0;j<n;j++)
			

{

			
b[i][j] = s1.nextInt();
	
			
}

		
}


		
for(i=0;i<m;i++)

		
{

		
for(j=0;j<n;j++)

			
{

			
c[i][j] =a[i][j]+b[i][j];	

			
}

		
}

		
for(i=0;i<m;i++)

		
{

		
for(j=0;j<n;j++)

			
{
	
		
System.out.print(" "+c[i][j] );
	
			
}
	
	
System.out.println("" );

		
}
		

	
}


}