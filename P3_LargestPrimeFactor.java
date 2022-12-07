public class P3_LargestPrimeFactor{
   static long MaximumPrime( long n){
      long mxprime = -1;
      while (n % 2 == 0) {
         mxprime = 2;
         n>>= 1;
      }
      for (int i = 3; i <= Math.sqrt(n); i += 2){
         while (n % i == 0){
            mxprime = i;
            n = n / i;
         }
      }
      if (n > 2)
      mxprime = n;
      return mxprime;
   }
   public static void main(String[] args){
      long num =  600851475143L;
      System.out.println(MaximumPrime(num));
   }
}
//The output here is 6857