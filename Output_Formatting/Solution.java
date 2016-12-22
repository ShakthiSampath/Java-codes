import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);  // class for giving input
            String[] str = new String[3];
            String[] num = new String[3];
            int[] len = new int[3];

            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();     // input given
                String x = sc.next();
                str[i] = s1;               // storing string in String array
                len[i]=15-s1.length();

                if(x.length()==3)          // code for padding with zeroes
                  num[i]=x;
                else if(x.length()==2)
                  num[i]="0"+x;
                else if(x.length()==1)
                  num[i]="00"+x;
            }

            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
              char[] space = new char[len[i]];    // character array for
              for(int j=0;j<len[i];j++){          // adding space
                space[j] = ' ';
              }
              System.out.print(str[i]);           // giving output
              System.out.print(space);
              System.out.println(num[i]);
            }
            System.out.println("================================");
    }
}
