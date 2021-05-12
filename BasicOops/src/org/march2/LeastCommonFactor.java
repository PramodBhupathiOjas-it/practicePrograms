package org.march2;

import java.util.Scanner;

public class LeastCommonFactor {
	
	static int i=2;  
	static int lcmCal(int firstNum,int secNum,int temp,int res) 
	{
	  if(res % secNum !=0 || res % firstNum !=0)
		{
		res=temp*i;
		i=i+1;
		return lcmCal(firstNum,secNum,temp,res);
		}
	  return res;
 	 }
	public static void main(String arg[]) 
	{
	    int firstNum,secNum,r,t,leastCount;
	    
        Scanner sc=new Scanner(System.in);
        
	    System.out.println("enter  number 1");
        firstNum=sc.nextInt();
        
	    System.out.println("enter  number 2");
	    secNum=sc.nextInt();
	    
	    if(firstNum == 0 || secNum == 0)
	    {
	    System.out.println("Numbers should not be 0");
                   System.exit(0);
	    }
//	    LeastCommonFactor l=new LeastCommonFactor();
	    if(firstNum > secNum) 
		r = firstNum;
	    else
		r = secNum;
	    t = r;
	    leastCount=lcmCal(firstNum,secNum,t,r);
	    System.out.println("LCM of 2 numbers is ="+leastCount);
	}

}
