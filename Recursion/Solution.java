import java.io.*;
import java.util.*;

public class Solution {
    int factorial(int a)
    {
      factorial(a)=a*factorial(a-1);
      return a;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int recur_Var = sc.nextInt();
      int res_Recursion = factorial(recur_Var);
      System.out.println(res_Recursion);
    }
}
