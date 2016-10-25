import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        for(int a = 0; a < n; a++)
        {

          String S = sc.next();
          for(int i=0;i<S.length();i=i+2)
            {
              System.out.print(S.charAt(i));
            }
            System.out.print("  ");
          for(int j=1;j<S.length();j=j+2)
            {
              System.out.print(S.charAt(j));
            }
            System.out.println();
        }

    }
}
