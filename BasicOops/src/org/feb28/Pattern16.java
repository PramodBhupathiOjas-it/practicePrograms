package org.feb28;

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for (int rows=0; rows<range; rows++)
        {
 
           
            for (int cols=range-rows; cols>1; cols--)
            {
                
                res += " ";
            }
  
            
            for (int cols=0; cols<=rows; cols++ )
            {
                
               res += "* ";
            }
  
          
            res += "\n";

	}
		System.out.println(res);

}
}
