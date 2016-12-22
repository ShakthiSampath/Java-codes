import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] str = new String[3];
            String[] num = new String[3];
            int[] len = new int[3];

            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();
                String x = sc.next();
                str[i] = s1;
                len[i]=15-s1.length();

                if(x.length()==3)
                  num[i]=x;
                else if(x.length()==2)
                  num[i]="0"+x;
                else if(x.length()==1)
                  num[i]="00"+x;
            }
