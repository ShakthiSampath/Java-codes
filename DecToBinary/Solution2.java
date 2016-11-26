import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  // creating Scanner class for input
      int n = sc.nextInt();
      int rem[] = new int[100];     // using array to store remainder
      int count=0,count1=0,index=0;
      while(n>0){
          rem[index++]=n%2;         // calculating remainder
          n=n/2;
        }

      for(int j=index-1;j>=0;j--){
        System.out.print(rem[j]);     // printing out the remainder
        if(rem[j]==1){
            count1++;
            if(count1>count)
            {
                count=count1;         // using a count variable
            }
        }
        else{
          count1=0;
        }
      }
      System.out.println();
      System.out.println(count);      // printing the count variable
    }
}
