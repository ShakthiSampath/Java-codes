import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];     // initializing an array
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();    // keyboard input value
        }

        for( int j=n-1;j>-1;j--)
        {

            System.out.print(arr[j]);
            System.out.print(" ");   // space-separated value
        }
        in.close();
    }
}
