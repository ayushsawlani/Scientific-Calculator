import java.util.ArrayList;
import java.util.*;
public class Calculator{
    public static Double max_list(ArrayList <Double> nums)
    {

        Double ans = -100000000.0;
        for(int i=0; i<nums.size(); i++)
        {
            if(ans<nums.get(i))
            {
                ans = nums.get(i);
            }
        }
        return ans;
    }
    public static Double min_list(ArrayList <Double> nums)
    {

        Double ans = 100000000.0;
        for(int i=0; i<nums.size(); i++)
        {
            if(ans>nums.get(i))
            {
                ans = nums.get(i);
            }
        }
        return ans;
    }

    public static Double sum_list(ArrayList <Double> nums)
    {

        Double ans = 0.0;
        for(int i=0; i<nums.size(); i++)
        {
            //if(ans>nums.get(i))
            {
                ans = ans + nums.get(i);
            }
        }
        return ans;
    }

    public static Double mult_list(ArrayList <Double> nums)
    {

        Double ans = 1.0;
        for(int i=0; i<nums.size(); i++)
        {
            //if(ans>nums.get(i))
            {
                ans = ans * nums.get(i);
            }
        }
        return ans;
    }

    public static int gcd(int a, int b)
    {
        if(a%b == 0)
        {
            return b;
        }
        return gcd(b, a%b);
    }

    public static int gcd_list(ArrayList <Integer> nums)
    {

        int ans = nums.get(0);
        for(int i=0; i<nums.size(); i++)
        {
            //if(ans>nums.get(i))
            {
                ans = gcd (ans , nums.get(i));
            }
        }
        return ans;
    }

    public static int lcm_list(ArrayList <Integer> nums)
    {

        int ans = nums.get(0);
        for(int i=0; i<nums.size(); i++)
        {
            //if(ans>nums.get(i))
            {
                ans =  (ans * nums.get(i))/(gcd (ans , nums.get(i)));
            }
        }
        return ans;
    }

    public static Double square_root(Double x)
    {
        return Math.sqrt(x);
    }

    public static Double power(Double a, Double b)
    {
        return Math.pow(a, b);
    }

    public static Double nat_log(Double x)
    {
        return Math.log(x);
    }

    public static int fac(int x)
    {
        if(x == 0)
            return 1;
        return x*fac(x-1);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("User menu option: \n 1.Square root function \n 2. Factorial function \n 3. Natural Logarithm(base e) \n 4. Power function \n");
        int option = 0;

        option = sc.nextInt();


        //user options
        if(option==1)
        {
            //Takes only numbers >= 0
            //Error handling done, returns NaN if negative number
            System.out.print("Enter the number for which you wish to calculate: \n");
            double num = sc.nextDouble();

            System.out.println("Square root of " + num + " is " + square_root(num));
        }
        else if(option==2)
        {
            //Takes only integer as input
            System.out.print("Enter the number for which you wish to calculate: \n");
            int num = sc.nextInt();

            if (num < 0)
            {
                System.out.print("Factorial of a negative number is not defined. \n");
            }
            else
            {
                System.out.println("Factorial of " + num + " is " + fac(num));
            }
        }
        else if(option==3)
        {
            //Negative no. -> NaN, 0 -> -Infinity, Infinity -> Infinity
            System.out.print("Enter the number for which you wish to calculate: \n");
            double num = sc.nextDouble();

            System.out.println("Natural Logarithm(base e) of " + num + " is " + nat_log(num));
        }
        else if(option==4)
        {
            System.out.print("Enter the number for which you wish to calculate: \n");
            double num = sc.nextDouble();

            System.out.print("Enter the exponent number: \n");
            double exp = sc.nextDouble();
            System.out.println("Power of " + num + " is " + power(num, exp));
        }
        else{
            System.out.print("Wrong input for selecting the options. Kindly choose from 1,2,3,4 \n");
        }

    }
}