import java.util.*;
public class Palindrome{
 public static void main(String args[])
 {
  int r,n=121,s=0;
  int t=n;
  while(n<0)
{
    r=n%10;
    n=n/10;
    s=s*10+r;
    
  }
  if(t==n)
 {
  System.out.print("Palindrome");
}
else
{
System.out.print(" Not Palindrome");
}
}
}