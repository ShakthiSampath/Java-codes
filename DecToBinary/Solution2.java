import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      int n = sc.nextInt();
      int rem[] = new int[100];
      int count=0,count1=0,index=0;
      while(n>0){
          rem[index++]=n%2;
          n=n/2;
        }

      for(int j=0;j<index;j++){
        System.out.print(rem[j]);
        if(rem[j]==1){
            count1++;
            if(count1>count)
            {
                count=count1;
            }
        }
        else{
          count1=0;
        }
      }
      System.out.println();
      System.out.println(count);
    }
}
