import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

      //  int
        //int[] arr1= new int[n];
        for( int j=n-1;j>-1;j--)
        {

            System.out.print(arr[j]);
            System.out.print(" ");
        }
        in.close();
    }
}
