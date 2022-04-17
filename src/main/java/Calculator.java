import java.util.ArrayList;
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


    public static void main(String[] args)
    {
        ArrayList <Double> test = new ArrayList<Double>();
        test.add(2.0);
        test.add(3.0);
        test.add(4.0);
        test.add(5.0);

        ArrayList <Integer> test1 = new ArrayList<Integer>();
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);

        System.out.println(max_list(test));
        System.out.println(min_list(test));
        System.out.println(sum_list(test));
        System.out.println(mult_list(test));

        System.out.println(gcd_list(test1));
        System.out.println(lcm_list(test1));

    }
}