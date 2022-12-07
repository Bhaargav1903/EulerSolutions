
public class P4_LargestPalindromeProduct 
{
   static int  largestPalindrome(){
        int max=0;
        for(int i =999; i>100; i--){
            for(int j = 999; j>100; j--){
                int mul = j*i;
                if(checkPalindrome(mul)&&mul>max){
                    max= i * j;
                }
            }
        }
        return max;
    }
    static boolean  checkPalindrome(int n)
    {
        int num = n;
        int s = 0;
        while(num!=0)
        {
          s = s*10 + (num%10);
          num = num/10;
        }
        if(s==n)
          return true;
        return false;
    }
   public static void main (String[] args) 
   {
   	int answer = largestPalindrome();
   	System.out.println(answer);
   }
}

//The largest palindrome product is 906609


