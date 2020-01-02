package Bridge1.com;
import java.lang.*;
import java.util.Scanner;
import java.io.*;
class TriplesCount{
	public int triplesCount(int a[]) {
		int count=0;
		int j=0;
	    int result=0;
	       //Finding 3 digits triples upto a.length possibilities
	       for(int i=0;i<=a.length;i++){
	           j=i%5;
	           //% is used because of index will go above array length
	           result=a[j%5]+a[(j+1)%5]+a[(j+2)%5];
	           if(result == 0){
	        	   //if triples are found and print here as well 
	        	   //increment the count value
	               System.out.println("triplets are "+a[j%5]+" "+a[(j+1)%5]+" "+a[(j+2)%5]);
	                count +=1;
	           }
	       }
	       //returning count value
		return count;
	}
}

class Triples{
    public static void main(String [] args){
       TriplesCount tc=new TriplesCount();
       //integer Array
       int [] a={-1,3,0,-3,-2};
       //calling a function for counting triples
       int count=tc.triplesCount(a);
       if(count>01){
            System.out.println("there are "+count+" triples are available");
       }
       else 
       System.out.println("No triplets are available");
        
    }
}