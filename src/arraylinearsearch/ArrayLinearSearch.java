/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylinearsearch;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class ArrayLinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b=false;
        int position=0;
        
        int array[]={6,3,1,2,7,3,45,23,98,10};
        
       String value = JOptionPane.showInputDialog(null,"Enter a number to search in array",JOptionPane.QUESTION_MESSAGE);
       
       int number = Integer.parseInt(value);
       
       for(int i=0; i<array.length; i++){
           if(number== array[i]){
               b=true;
               position= i+1;
               break;
           }
       }
       
       if(b){
           JOptionPane.showMessageDialog(null,"NUMBER "+number+" IS FOUND AT POSITION "+position);
       }
       else
       {
        JOptionPane.showMessageDialog(null,"YOUR ENTERED NUMBER DOES NOT EXIST IN GIVEN ARRAY!");
       }
    }
    
}
