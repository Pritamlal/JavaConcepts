import java.util.Scanner;

public class alladd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number::");
        int num = scn.nextInt();
        int sum=0;
        int rem=0;
        while(num>0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        System.out.println("The Sum is=:"+sum);
    }
}
