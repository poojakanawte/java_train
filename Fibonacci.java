import java.util.*;

public class Fibonacci
{
public static void main(String args[])
{
int i=0,K=1,l=1;

System.out.println("1 1");


while(i<=50)
{
i=K+l;
System.out.println(i+"");
K=l;
l=i;
}
}
}