public class Pro5
{
  public static void main(String[] args)
  {
    // dont have to do 1, 2, 5, 6, 10, 12, 14, 15, 18, 20
    //we HAVE to do 3, 4, 7, 8, 9, 11, 13, 16, 17, 19
    for(int i = 20; i != 0; i+= 20)
      {
        if(i%3 == 0)
        {
          if(i%4 == 0)
          {
            if(i%7 == 0)
            {
              if(i%8 == 0)
              {
                if(i%9 == 0)
                {
                  if(i%11 == 0)
                  {
                    if(i%13 == 0)
                    {
                      if(i%16 == 0)
                      {
                        if(i%17 == 0)
                        {
                          if(i%19 == 0)
                          {
                            System.out.println(i);
                            break;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        
      }




    
  }



  
}