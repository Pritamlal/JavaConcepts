import java.util.Scanner;
class perfect{
public static void main(String [] args){
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the number:");
    int num = scn.nextInt();
    int sum=0;
    int i;
    
        for(i=1;i<=num/2;i++){
            if(num%i==0){
                sum += i;
            }
        }
    
        if(sum==num){
            System.out.println("It is perfect number");
        }
        else{
            System.out.println("It is not perfect number");
        }
    
}
}