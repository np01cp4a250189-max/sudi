package workshop11;


/**
 * Write a description of class calculationapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculationapp
{
public static void main (String[] args){
    shape[] shape1 = new shape [2];
      
     shape1[0] = new rectangle (10,5, 6) ;
     shape1[1] = new circle (5) ;
     
     for (int i=0; i<shape1. length; i++){
       shape1 [i].draw() ;
       shape1 [i].displayShapeInfo () ;
     }
    } 
}      