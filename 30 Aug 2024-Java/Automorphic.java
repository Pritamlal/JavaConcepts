import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        num = sc.nextInt();
        int sq = num * num;
        boolean flag=true;

        while(num>0){
            if(num%10!=sq%10){
                flag=false;
                break;
            }
            num=num/10;
            sq=sq/10;
        }
        if(flag){
            System.out.println("It is Automorphic Number");
        }
        else{
            System.out.println("It is not Automorphic Number");
        }
    }
}
