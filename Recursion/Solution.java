import java.io.*;
import java.util.*;

public class Solution {
    static int factorial(int a)
    {
      int res;
      if(a==1)
       return 1;

      res = a*factorial(a-1);
      return res;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int recur_Var = sc.nextInt();
      //int res_Recursion = factorial(recur_Var);
      System.out.println(factorial(recur_Var));
    }
}
