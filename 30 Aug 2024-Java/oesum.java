import java.util.Scanner;

public class oesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rem;
        int eSum=0;
        int oSum=0;
        while(num>0){
            rem=num%10;
            if(rem%2==0){
                eSum=eSum+rem;
            }
            else{
                oSum=oSum+rem;
            }
            num=num/10;
            
        }
        System.out.println("The eSum is:" +eSum);
        System.out.println("The oSum is:" +oSum);
    }
}
