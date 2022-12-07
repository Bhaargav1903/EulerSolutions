public class P20_FactorialDigitSum{
    static int factoriaL(int n)
    {
        int fact=0;
        for(int i=1;i<=n;i++)
        {
        fact=fact*i;
        }
        return fact;
}
static int fsum(int num)
{
    int n=factoriaL(num);
    System.out.println(n);
    int ld,sum=0;
    if(n!=0)
    {
        ld = num%10;
        sum = sum + ld;
        num = num/10; 
   }   
     return sum;
}
public static void main (String[] args) 
   {
   	System.out.println(fsum(100));
   }
}