import java.util.Scanner;
class Main
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
  int n = in.nextInt();

//Try out your code here
 
  int s=1;
  
    for(int i=1;i<=n;i++)
    {
      for(int j=0;j<i;j++)
      {
        
        if(s%2 == 0)
        {
        System.out.print("#");
        }
        else
        {
          System.out.print("*");
        }
        s=s+1;
        
      }
      System.out.print("\n");
       
      
    }
    }
}
