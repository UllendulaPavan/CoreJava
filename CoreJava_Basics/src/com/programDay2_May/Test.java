package com.programDay2_May;

class TestSync
{
	void display(int a) throws InterruptedException {
		synchronized (this) {
			System.out.println(a*5);
			Thread.sleep(500);
		}
	}
}

class NIT extends Thread
{
	TestSync test;
	@Override
	public void run() {
		try {
			test.display(Thread.MIN_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public NIT(TestSync test) {
		this.test = test;
	}
}
class NIT1 extends Thread
{
	TestSync test;
	@Override
	public void run() {
		try {
			test.display(MIN_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public NIT1(TestSync test) {
		this.test = test;
	}
}

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		TestSync test = new TestSync();
		NIT nit = new NIT(test);
		NIT1 nit1 = new NIT1(test);
		
		nit.start();
		nit1.start();
    }
}