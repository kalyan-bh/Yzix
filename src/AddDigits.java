import java.util.Scanner;

public class AddDigits {

    public static int addDigi(int num){
        while(num>=10) {            //checks number is not single digit and assigns temp value to 'o'
            int temp = 0;
            while (num > 0) {  // looped until number = zero
                temp += num % 10;  // adds last digit of number to temp
                num /= 10;        // removes last digit of number
            }
            num = temp;
        }
     return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number:");
        int a=sc.nextInt();
        System.out.println(addDigi(a));
    }
}
