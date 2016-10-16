import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner class used which belongs to util package for input
        int n = in.nextInt();
        for(int i=1;i<=10;i++){
        int j=n*i;
            System.out.println(n+" x "+i+" = "+j);  // '+' Symbol helps in concatenation of the values of the variables.
        }
    }
}
