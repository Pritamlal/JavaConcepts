import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean isPrime = true;
        int i;
        if(num<2){
            isPrime=false;
        }
        else{
            for(i=2;i<num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("It is not Prime number");
        }
    }
}