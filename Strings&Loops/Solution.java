import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String S1 = sc.next();
        String S2 = sc.next();

        for(int i=0;i<S.length;i++)
        {
          if(i%2!=0)
          {

            for(int j =0;j<S1.length;j++)
            {
              S1= S[j];
            }
          }
          else
          {

            for(int k =0;k<S2.length;i++)
            {
              S2= S[k];
            }
          }
        }
        System.out.println(S1+"  "+S2);
    }
}
