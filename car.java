import java.util.*;
class car
{
    int n;
    int sum=0;
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        car obj=new car();
        System.out.println("Enter a number:");
        obj.n=sc.nextInt();
        int i;
        for(i=1;i<=obj.n;i++)
        {
            obj.sum=obj.sum+i;
        }
        System.out.println("sum="+obj.sum);
        sc.close();
    }
}