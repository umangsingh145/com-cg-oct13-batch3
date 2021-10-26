package com.cg.oct13.batch3.day6;

class Hi extends Thread{
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


class Hello extends Thread{
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
public class MultiThreads{
	
	public static void main(String[] args) {
		
		Hi first=new Hi();
		Hello second=new Hello();
		first.start();
		try{
			Thread.sleep(10);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	    second.start();
	
	}

}
