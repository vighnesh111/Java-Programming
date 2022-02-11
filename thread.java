import java.util.*;
import java.lang.*;
import java.io.*;
class Star extends Thread

{

public void run()

{

int i;
for(i=1;i<=7;i++)

{

System.out.print("*");
try

{

Thread.sleep(1100);

}

catch(Exception e)

{

}

}

}

}

class Dollar extends Thread

{

public void run()

{

int i;
for(i=1;i<=7;i++)

{

System.out.print("$");
try

{

Thread.sleep(1000);

}

catch(Exception e)

{

}

}

}

}

class thread

{

public static void main(String[] args)

{

Dollar n=new Dollar();
Thread t1=new Thread(n);
Star n1=new Star();
Thread t2=new Thread(n1);
t1.start();
t2.start();

}

}
