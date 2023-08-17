package A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Data_Members {
	// create 4 object
	 private static  WebPageStacksArray t1=new WebPageStacksArray(10); 
	 private static  WebPageStacksArray t2=new WebPageStacksArray(10);
	 private static  WebPageStacksArray t3=new WebPageStacksArray(10);
	 private static  WebPageStacksArray history=new WebPageStacksArray(50);


	public static void main(String[] args) throws FileNotFoundException {
		File input=new File("input.txt"); //create an object of input file to read data
	       if(!input.exists()) {
	    	   System.out.println("fcitInput.txt  does not found"); //we check if the file exists  
	       }
	       Scanner input1 =new Scanner(input);
	       int number = input1.nextInt(); // to read the first number in the input file
	       PrintWriter output=new PrintWriter("output");  
	       
	   	File fCommand=new File("CommandsStack.txt");
	       Scanner input2 =new Scanner (fCommand);
	       output.print("        Welcome to URL Stack System\r\n"
	    	   		+ "-----------------------------------------------------");
	       output.println();
	       while(input2.hasNext()) {
	    	
	    	   
	    	   String command =input2.next();
	    	   
	    	   if(command.equalsIgnoreCase("STARTUP")) {
	    		   // for loop to read every line after the number
	    	for(int i=0;i<number;i++) {
	    		String C =input1.next();
	    		// to check if the line is equal to T1
	    		if(C.equalsIgnoreCase("T1")) {
	    			// we bush it to tab 1 array,object t1
	    			t1.push(input1.nextLine());
	    			// we print the String value
	    		output.println("The URL"+t1.peek()+" was pushed into Stack T1");
	    			   }
	    		// to check if the line is equal to T2
	    		else if(C.equalsIgnoreCase("T2")) {
	    			// we bush it to tab 2 array,object t2	
	    	t2.push(input1.nextLine());
	    	output.println("The URL"+t2.peek()+" was pushed into Stack T2");
	    		   }
	    		// to check if the line is equal to T3
	    	else if(C.equalsIgnoreCase("T3")) {
	    		// we bush it to tab 3 array,object t3
	    		t3.push(input1.nextLine());
	    		output.println("The URL"+t3.peek()+" was pushed into Stack T3");
	    	
	    	   }
	       }
	    	output.println();
   		 output.print("------------------------------------------------------------------------");
   		 output.println();   
	}	   
	    	   else if(command.equalsIgnoreCase("GO_FORWARD")) {
	    		   // Variable to read from input2(commands)
	    		   String f=input2.next();
	    		   // we check if the next of commands GO_FORWARD is equal to T1
	    		   if(f.equalsIgnoreCase("T1")) { 
	    			   
	    			// we bush it to tab 1 array,object t1	
	    			   t1.push(input2.nextLine());
	    			output.println("The URL"+t1.peek()+" was pushed into Stack T1");
	    			 output.println("------------------------------------------------------------------------");
	    			   }
	    		   // we check if the next of commands GO_FORWARD is equal to T2
	    		   if(f.equalsIgnoreCase("T2")) {
	    				// we bush it to tab 2 array,object t2
	    			   t2.push(input2.nextLine());
	    				output.println("The URL"+t2.peek()+"was pushed into Stack T2");
	    				 output.println("------------------------------------------------------------------------");
	    		   }
	    		   // we check if the next of commands GO_FORWARD is equal to T3
	    		   if(f.equalsIgnoreCase("T3")) {
	    				// we bush it to tab 3 array,object t3
	    			   t3.push(input2.nextLine());
	    			output.println("The URL"+t3.peek()+"was pushed into Stack T3");
	    			 output.println("------------------------------------------------------------------------");
	    		   }
	    	   }
	    	   
	    	   else if(command.equalsIgnoreCase("GO_BACK")) {
	    		   // Variable to read from input2(commands)
	    		String B=input2.next();
	    		   // we check if the next of commands GO_BACK is equal to T1
	    		if(B.equalsIgnoreCase("T1")) {
	    			//We save the value that we delete in variable
	    			String value=t1.pop();
	    			// we bush it to history array,object history
	    			history.push(value);
	    		}
	    		   // we check if the next of commands GO_BACK is equal to T2
	    		else if(B.equalsIgnoreCase("T2")) {
	    			String value=t2.pop();
	    			// we bush it to history array,object history
	    			history.push(value);
	    		}
	    		   // we check if the next of commands GO_BACK is equal to T3
	    		else if(B.equalsIgnoreCase("T3")) {
	    			String value=t3.pop();
	    			// we bush it to history array,object history
	    			history.push(value);
	    		}
	    	   }
	    	   else if(command.equalsIgnoreCase("DISPLAY_ALL_VISITED")) {
	    		   output.println("The content of Stack T1:");
	    		   output.print("_________________________");
	    		   output.println();
	    		   //for loop to print the content of t1 array
	    		   for(int i=0;i<t1.getSize();i++) {
	    			   if(!t1.isEmpty()) {
	    			   output.println(t1.pop());
	    		   }
	    	   }
	    		   output.println();
	    		   output.println("The content of Stack T2:");
	    		   output.print("_________________________");
	    		   output.println();
	    		   //for loop to print the content of t2 array
	    		   for(int i=0;i<t2.getSize();i++) {
	    			   if(!t2.isEmpty()) {
	    			   output.println(t2.pop());
	    		   }
	    	   }
	    		   output.println();
	    		   output.println("The content of Stack T3:");
	    		   output.print("_________________________");
	    		   output.println();
	    		   //for loop to print the content of t3 array
	    		   for(int i=0;i<t3.getSize();i++) {
	    			   if(!t3.isEmpty()) {
	    			   output.println(t3.pop());
	    		   }
	    	   }
	    		   output.println();
	    		   output.println("The content of the history stack :");
	    		   output.print("_________________________");
	    		   output.println();
	    		   //for loop to print the content of history array
	    		   for(int i=0;i<history.getSize();i++) {
	    			   if(!history.isEmpty()) {
	    			   output.println(history.pop());
	    		   }
	    	   } 
	    		
	    	   }
	    	   if(command.equalsIgnoreCase("QUIT")) {
	    		  //break;
	    	   }

	    	  
	       
	}
	       output.println("============================");
    	   output.println("Best Wishes ");
    	   output.println("============================");
    	   input1.close();
    	   output.close();    
	    	        
}
	             

}



