import java.util.Scanner;

public class minimum {
      public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int size=input.nextInt();
        int arr []=new int[size];
        for(int i=0;i<size; i++)
        arr[i]=input.nextInt();
        int max=arr[0];
        for (int i = 1; i <size; i++) {
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("MAX"+max);
            
        }


    
}
