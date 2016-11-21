import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  // creating Scanner class for input
      int n = sc.nextInt();
      int rem[] = new int[20];  // using array to store remainder
      int count=0;
      for(int i=0;i<rem.length;i++)
      {
        while(n!=0)
        {
          rem[i]=n%2;
          n=n/2;
          System.out.println(rem[i]); // printing binary numbers
          if(rem[i]==1)
            count++;                  // counting the number of 1's
        }
      }
      System.out.println(count);
    }
}
