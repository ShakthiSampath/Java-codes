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

        int[] arr1= new int[];
        int j= arr1.length();
        while(j!=0){
            System.out.print(arr1[j]+" ");
            j--;
        }
        in.close();
    }
}
