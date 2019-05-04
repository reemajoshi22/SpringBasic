package com.spring.example;

public class Test {
	
	public static void main(String[] args) {
		new Test().main();
	}
	
	public void main() {
		//A a = new B();
		A a=new B();
		a.print("abc");
		
		
		
		//((B)a).iB();
	}

	public class A{
		public void print(String a){
			System.out.println("a");
		}
		
		public void iA(){
			
		}
	}
	
	public class B extends A{
		public  void print(String a){
			System.out.println("b");
		}
		
		public void iA(){
			
		}
	}

}
