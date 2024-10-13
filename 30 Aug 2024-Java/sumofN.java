import java.util.Scanner;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        int sum=0;
        String str=" ";
        for(int i=1;i<=num;i++){
            sum=sum+i;
            str=str+i;
            if(i<num)
            str=str + "+";
        }
        str= str+"=" +sum;
        System.out.println(str);
    }
}
