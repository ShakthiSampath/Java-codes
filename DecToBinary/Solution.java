import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr_bin[] = new int[20];
      int rem[] = new int[20];
      int count=0;
      for(int i=0;i<rem.length;i++)
      {
        while(n!=0)
        {
          rem[i]=n%2;
          n=n/2;
          System.out.println(rem[i]);
          if(rem[i]==1)
            count++;
        }
      }
      System.out.println(count);
    }
}
