
public class Pro7
  {

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
        {return false;}
 
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
            {return false;}
 
        return true;
    }
    
    public static void main(String[] args)
    {
      for(int i = 2, count = 0; i != -1; i++)
        {
          if(isPrime(i))
          {
            count++;
            if(count == 10001)
            {
              System.out.println(i);
              break;
            }
          }
        }
    }
  }
    