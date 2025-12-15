
/**
 * Write a description of class t6array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t6array
{
    public static void main(String[] args) {
        int [] age;  //declaring
        age= new int[5]; //constructing
        System.out.println(age.length); //finding length
        
        //first index=0, last= age.length-1 - 5-1=4
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int [] agr= {5,10,15,20,25}; //declaring,constructing,initializing all in one line
        System.out.println(agr.length); //gives certain length =5
        System.out.println(agr[0]); //5 aauna paryo
        
        for(int i=0; i< agr.length; i++) {
            System.out.println(agr[i]);
            
        }
        
        for(int i=agr.length-1; i>=0; i--) //reversing from 4thindex to 0thindex
    
        {
            System.out.println(agr[i]);
            
        }
        
        
        //for suming
        //int [] agr= {5,10,15,20,25}; //declaring,constructing,initializing all in one line
        System.out.println(agr.length); //gives certain length =5
        System.out.println(agr[0]);
        
        int sum=0;
        for (int i=0; i< agr.length; i++) {
            sum= sum+ agr [i];
            System.out.println(sum);
        }
        
        // 2D array
        
        int[][] matrix= { {1,2,3},{4,5,6},{7,8,9},{10,11,12} };
        System.out.println(matrix.length); //length=4 index l-1=3
        
        //traversing
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            
            }
             System.out.println();
             
        }
        
        
        
        
        
        
    
}
}