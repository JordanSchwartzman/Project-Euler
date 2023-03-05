public class Pro4
{
    public static void main(String[] args)
  {
    int k = 999;
    int l = 999;
    int i = k*l;
    int max = 0;
    
        while(i>100*100)
        {
            int reversed = 0; // Reset reversed to 0 at the start of each iteration
            int j = i;
            while (j != 0) 
            { 
                int digit = j % 10;
                reversed = reversed * 10 + digit;
                j /= 10;
            }
            if (i == reversed && i > max)
            {
                max = i;           
            }
          if(k != 100)
          {
            k--;
            i = k*l;
          }
          else
          {
            k = 999;
            l -=1;
            i = k * l;
          }
        }
    System.out.println(max);
    }
}