import java.util.Scanner;

public class Strong{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number::");
        int num = scn.nextInt();

        int temp=num;
        int rem;
        int multi;
        int sum=0;
        while(temp>0){
            rem = temp%10;
            multi=1;
            for(int i=1;i<=rem;i++){
                multi=multi*i;
            }
            sum+=multi;
            temp/=10;
        }
        if(sum==num)
        System.out.println("It is Strong Number");
        else
        System.out.println("It is not strong number");
    }
}