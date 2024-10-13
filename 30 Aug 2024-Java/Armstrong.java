import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = scn.nextInt();
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;
        
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, numDigits);
            num /= 10;
        }
        
        if (sum == originalNum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
