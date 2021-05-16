import java.util.*;
class PerfectNumber{
 public static void main(String args[])
 {
  int n=12;
  boolean b=isPerfect(n);
if(b)
System.out.print("IsPerfect number");
else
System.out.print("Not PrfectNumber");
}
public static boolean isPerfect(int n)
{
  int sum=0,i;  

  for(i=1;i<=n/2;i++)
  {
  if(n%i==0)
    sum=sum+1;
  }
  if(n==sum)
  return true;

  return false;
}
}

