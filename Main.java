import java.util.*;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Find the all the common multiple between two numbers within 1-100.
    
    for(int i=1;i <= 50;i++)
    {
      System.out.println(i);
      if (i%(3*5)==0)                                     
        {
          System.out.print("Common multiple of both your numbers"+"\n");  
       }
      else if (i%3==0)
      {
        System.out.println("multiple of you first number");
      }
      else if (i%5==0)
      {
        System.out.println("multiple of your second number");
      }
      
      
    }
    
    //10:  10 5,2,1
    int num=100;

    //for loop; if statment; %
    //here put some random thing in and it will reverse it idk bored
    for(int nums=1;nums <= num; nums++)
    {
      if (num%nums==0)
      {
        System.out.println(nums);
      }
    }
    int i=0;
    String word="i like to eat water";
    String wordR="";
    for(i=word.length()-1; i>=0; i--)
    {
      //System.out.println(word.charAt(i));
      wordR+=word.charAt(i);
    }
    System.out.println(wordR);
  }
}
