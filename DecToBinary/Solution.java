import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  // creating Scanner class for input
      int n = sc.nextInt();
      int rem[] = new int[4];  // using array to store remainder
      int count=0;
      for(int i=0;i<rem.length;i++)
      {
          rem[i]=n%2;                      // calculating remainder
          n=n/2;
          if(n==0)
            break;
      }
      for(int j =rem.length-1;j>=0;j--)
      {
        System.out.print(rem[j]);
        if(rem[j]==1)
          count++;                        // counting number of 1's
      }
      System.out.println();
      System.out.println(count);
    }
}
