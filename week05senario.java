import java.util.Scanner;
/**
 * Write a description of class week05senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week05senario
{ 

    public static void main (String[]args) {
    
     Scanner input = new Scanner(System.in);
       
     boolean a = true;
     
     System.out.println("===== NIBL Fixed Deposit Calculator =====");
     
     
          while(a)
             {
              System.out.print("Enter deposit amount: ");
               double principal = input.nextDouble();
     
               if(principal<1000)
               {
                 System.out.println("Your amount should be above Rs.1000");
              continue; 
         }
    
    
    
    
    
             System.out.print("Enter duration in months: ");
             int months= input.nextInt();
            double year =  months/12.0;
              if(months<=0 || months >60)
             {
                System.out.println("Months should be greater than o and smaller than 60");
             continue; 
            }
      
      
      
      
             System.out.print("Enter the rate ");   
            double rate = input.nextDouble();
             if(rate<8 || rate >12)
            {
            System.out.println("Your interest rate cannot be below 8 and above 12");
             continue; 
           }
      
      
      
             double interest = (principal*year*rate)/100;
             System.out.println("interest is  "+interest);
       
             double compound = principal + interest;
             System.out.println("compound interest is  "+compound);
       
             double processingfee = interest*(0.5/100);
             System.out.println("Processing fee is  "+processingfee);
       
             double actualinterest = interest-processingfee;
             System.out.println("actual interest is  "+actualinterest);
      
      
            double actualamount = principal+actualinterest;
            System.out.println("actual amount is  "+actualamount);
      
      
      
      
             System.out.print("Do you want to calculate another FD? (y/n): ");
               char ch = input.next().charAt(0);
    
                if(ch == 'y' || ch == 'Y')
                {
                a = true;
                }
                else
                {   
                a = false;
                }
            }            
        }
    }




