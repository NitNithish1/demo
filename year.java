import java.util.Scanner;
public class year{
    public static void main(String args[]) {
        Scanner kbd=new Scanner(System.in);
        System.out.print("Enter The Number of Days:");
        int days=kbd.nextInt();
        int years=days/365;
        int remainingDays=days%365;
        int months=remainingDays/30;
        int daysleft=remainingDays%30;
        System.out.println(years+" Years "+months+" Months "+daysleft+" Days");
    }
    
}
