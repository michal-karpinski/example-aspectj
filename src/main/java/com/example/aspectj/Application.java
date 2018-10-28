package com.example.aspectj;

public class Application {

	void stage1(String p1) throws InterruptedException {
		Thread.sleep(150);
	}

	void stage2(int p1) throws InterruptedException {
		Thread.sleep(300);
	}
	
	void stage3() throws InterruptedException {
		Thread.sleep(550);
		throw new RuntimeException("Any exception");
	}
	
	public void run() {
		try {
			this.stage1("Any parameter");
			this.stage2(1);
			this.stage3();
			
		} catch (Exception e) {
			// do nothing
		}
	}
	
	public static void main(String[] args) {
		Application application = new Application();
		application.run();
	}
}
