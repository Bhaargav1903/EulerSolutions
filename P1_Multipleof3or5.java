public class P1_Multipleof3or5
{
    public static void main(String[] args)
    {
    int flag = 0;//Flag or count variable
    for (int j = 0; j < 1000; j++) 
    {
        if(j%15 == 0) 
        flag+=j;   
        else if(j%3 == 0 || j%5 == 0) 
        flag+= j;
    } 
    System.out.println(flag);
      }
        } 
//The Output here is 233168