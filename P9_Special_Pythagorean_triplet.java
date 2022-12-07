public class P9_Special_Pythagorean_triplet
{
    public static void main(String[] args)
 {
    int s = 1000;
    for (int i= 1; i <= s/3; i++)
    {  
        for (int j = i + 1; j <= s/2; j++)
        {
            int k = s- i - j;
            if ( i*i + j*j == k*k )
            System.out.println(i*j*k);
        }
    }
}
    }