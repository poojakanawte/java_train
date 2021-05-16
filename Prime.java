import java.util.*;

public class Prime{

public static void main(String args[])
{
 int num=25,i;
 boolean isPrime=true;
  
for(i=2;i<num;i++)
{
if(i%2==0)
{
isPrime=false;
break;
}
}
if(isPrime)
{
System.out.println(num+" prime number");
}
else
{
System.out.println(num+" not prime number");
}
}
}