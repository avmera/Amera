package A3;

public class WebPageStacksArray {
	String[] stack;
private int maxSize;
private String URL;
private int top;

public WebPageStacksArray (int size) {
	maxSize = size;             // set array size
	stack = new String[maxSize];   // create array for stack
	top = -1;                   // set top to -1 (no items in stack yet)
}

	public boolean isFull () {
		return (top == maxSize-1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public String pop() {
		return stack[top--];
	}
	
	
	public String peek() {
		return stack[top];
	}
	
	public void push(String URL) {
		stack[++top] = URL;
	}
	  public void setURL(String URL){
	       this.URL = URL;
	    }
	  public String getURL(){
	       return URL; 
	    }
	  public void setStack(String[] stack ){
	       this.stack = stack;
	       
	    }
	  public String[] getstack(){
	       return stack; 
	    }
	  public int getSize() {
		  return maxSize;
	  }
	  
	
	
}
