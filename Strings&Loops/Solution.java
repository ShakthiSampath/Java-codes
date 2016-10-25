import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String S1 = sc.next();
        String S2 = sc.next();

        for(int i=0;i<S.length();i++)
        {
          if(i%2!=0)
          {
            S1 = Character.toString(S.charAt(i));
          }
          else
          {
            S2 = Character.toString(S.charAt(i));
          }
        }
        System.out.println(S1+"  "+S2);
    }
}
