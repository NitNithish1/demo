1. import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner kbd=new Scanner(System.in);
	    int year=kbd.nextInt();
        if(year%400==0 || year%100!=0&&year%4==0)
        System.out.println("leap year");
        else
        System.out.println("non leap year");
	}
}
Output:
input:2004
leap year
input:2025
non leap year

2.import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner kbd=new Scanner(System.in);
	    char choice=kbd.next().charAt(0);
        switch(choice){
            case 'A': System.out.println("Withdraw"); break;
            case 'B': System.out.println("Deposit"); break;
            case 'C': System.out.println("Balance Check"); break;
            default: System.out.println("Thank you please enter A-C");
        }
        
	}
}
Output:
input:b
Thank you please enter A-C
input:A
Withdraw

3.public class cond1
{
	public static void main(String[] args) {
    int i=1;
    do { 
        System.out.println("rose");
        i++;
    } while (i<5);
      }
}
Output:
rose
rose
rose
rose

4.import java.util.Scanner;

public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        System.out.print(i+" ");  
	}
}
Output:
input:5
1 2 3 4 5 

5.import java.util.Scanner;

public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=n;
        while(i>=1)
        {        System.out.print(i+" ");
                    i--;  
                    System.out.println("A");
        }
    }
}
Output:
input:8
8 A
7 A
6 A
5 A
4 A
3 A
2 A
1 A

6.public class cond1
{
	public static void main(String[] args) {
	    // Scanner scan = new Scanner(System.in);
        // char n = scan.next().charAt(0);
        for(char i='A';i<='Z';i++)
        System.out.print(i+" ");
    }
}
Output:
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

7.import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        for(char i='Z';i>=n;i--)
        System.out.print(i+" ");
    }
}
Output:
input:A
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A 

8.import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for( int i=1;i<=n;i++){
        for( int j=1;j<=n;j++)
        System.out.print("*");
        System.out.println();
        }
    }
}
output:
input:5
*****
*****
*****
*****
*****

9.import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for( int row=1;row<=n;row++){
        for( int col=1;col<=row;col++)
        System.out.print("*");
        System.out.println();
        }
    }
}
Output:
input:4
*
**
***
****

10.import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for( int row=1;row<=n;row++){
        for( int col=1;col<=n-row;col++)
        System.out.print(" ");
         for( int col=1;col<=row;col++)
        System.out.print("*");
        System.out.println();
        }
    }
}
Output:
input:5
    *
   **
  ***
 ****
*****
