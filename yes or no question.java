import java.util.Scanner;

public class divby3or5 {
       public static void main(String[] args) {
        Scanner bk =new Scanner(System.in);
        int n=bk.nextInt();
        if(n%3==0&&n%5==0)
         System.out.println("yes");
         else
          System.out.println("no");

         }

    
}
