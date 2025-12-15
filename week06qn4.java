import java.util.Scanner;

/**
 * Write a description of class week06qn4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week06qn4
{
    public static void main(String [] args){
         int [] num = {10,20,30,40,50};
         System.out.println(num.length);
         
         int sum = 0;
         int avg = 0;
        
        
        for(int i=0; i<num.length;i++)
        {
         System.out.println(num[i]);
         
         sum = sum+num[i];
         System.out.println(sum);
         
         avg = sum/num.length;
         System.out.println(avg);
         
         int high = num[0];
         int low = num[0];
         
         if(num[i]>high)
         {
            high = num[i];
        }
        
        if(num[i]<low)
        {
        low = num[i];
        }
        
        System.out.println("highest number"+ high);
        System.out.println("lowest number is"+ low);
        }
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of subjects");
        int sub = input.nextInt();
        
        int[] cc = new int[sub];
        
        for(int i =0; i<cc.length; i++)
        {
            System.out.println("value at index " +i);
            cc[i]= input.nextInt();
            System.out.println(cc[i]);
        
        }
        
        for(int i =0; i<cc.length; i++)
        {
        System.out.println("the values are " +cc[i]);
        
        }
        
        
        
        
    
    
    }
}
