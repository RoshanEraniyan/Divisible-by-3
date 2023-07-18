import java.util.*;

class Solution
{
    public void calculate(int[] array,int n)
    {
        int power=1,result=0;
        for(int i=array.length-1;i>=0;i--)
        {
            result=(result+((array[i]%3)*power))%3;
            power=(power*10)%3;
        }
        if(result==0)
        {
            result=1;
        }
        else
        {
            result=0;
        }
        System.out.println(result);
    }
}

class Divisible
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.calculate(array,n);
    }
}
