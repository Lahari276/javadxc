package advanced.thread;
public class ThreadRun extends Thread {
	
		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  ThreadRun t1=new ThreadRun();  
		  ThreadRun t2=new ThreadRun();  
		   
		  t1.run();  
		  t2.run();  
		 }  
		 
}