//program to return the sum of the even digits within the number.


import java.util.Scanner;

public class EvenDigitsum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = s.nextInt();
        s.nextLine();
        if ((getEvenDigitSum(number)) < 0) {
            System.out.println("Invalid Number! ");
        } else {
            System.out.println("The sum of even digits in the number is " + getEvenDigitSum(number));
        }
    }
    public static int getEvenDigitSum(int number)
    {
        int r=0;
        int sum=0;
        if(number<0)
        {
            return -1;

        }
        else
        {
            while(number!=0)
            {
                r=number%10;
                if(r%2==0)
                {
                    sum=sum+r;
                }
                number=number/10;
            }
            return sum;
        }
    }
}
