import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  // creating Scanner class for input
      int n = sc.nextInt();
      int rem[] = new int[100];  // using array to store remainder
      int count=0,index=0;
      while(n>0){
          rem[index++]=n%2;                      // calculating remainder
          n=n/2;
        }

      for(int j=0;j<rem.length;){
        if(rem[j]==1){
          while(rem[j]==1){
            j++;
            count++;
          }
        }
        else{
          j++;
          continue;
        }
      }
      //System.out.println();
      System.out.println(count);
    }
}
