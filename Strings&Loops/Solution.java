import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for(int i=0;i<strlen;i++)
        {
          if(i%2!=0)
          {
            String S1 = sc.next();
            for(int i =0;i<strlen;i++)
            {
              S1= S[i];
            }
          }
          else
          {
            String S2 = sc.next();
            for(int i =0;i<strlen;i++)
            {
              S2= S[i];
            }
          }
        }
        System.out.println(S1+"  "+S2);
    }
}
