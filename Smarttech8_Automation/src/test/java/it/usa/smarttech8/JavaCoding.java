package it.usa.smarttech8;

public class JavaCoding {
   
	 public static void main(String[] args) {
		
		 for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
	 
	     for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
	 
	         int time = 0;
		
	        if (time < 18) {
	    	  System.out.println("Good day.");
	    	} else {
	    	  System.out.println("Good evening.");
	    // Outputs "Good evening."
	    	}
	    
		/*int time = 22;
	     if (time < 10) {
	       System.out.println("Good morning.");
	     } else if (time < 20) {
	       System.out.println("Good day.");
	     } else {
	       System.out.println("Good evening.");
	     // Outputs "Good evening."
	     }  */
	  
           int day = 4;
          switch (day) {
    case 1:
        System.out.println("Monday");
        break;
     case 2:
        System.out.println("Tuesday");
        break;
     case 3:
        System.out.println("Wednesday");
        break;  }
	 
	 
	 }
}
