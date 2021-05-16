import java.util.*;
class SwapingNumber{
public static void main(String args[])
 {
  int r=4,t=5;

  r=r+t;
  t=r-t;
  r=r-t;
  
  System.out.println("r : "+r);
  System.out.println("t : "+t);
}
}