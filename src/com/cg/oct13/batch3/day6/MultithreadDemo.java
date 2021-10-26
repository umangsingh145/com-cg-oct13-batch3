package com.cg.oct13.batch3.day6;

class Hi implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
		
	}
}


class Hello implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
		}
		
	}
}
public class MultithreadDemo{
	
	public static void main(String[] args) {
		
		Hi first=new Hi();
		Hello second=new Hello();
		
		Thread t1=new Thread(first);
		Thread t2=new Thread(second);
		
		t1.start();
		try{
			Thread.sleep(10);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	    t2.start();
	
	}

}
