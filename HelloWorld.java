package lesson2;

public class HelloWorld {

	public static void main(String[] args) {
	sayHelloWorld();
	sayHelloto("Charlie");
	sayHelloto("John");
	
	int x=5;
	
	System.out.println(x);
	
	//f(x)=x*x;
	int result = square(x);
	System.out.println(result);
	
	

	}
	
	static int square(int x){
		return x*x;
	}
	static int returnFive() {
		return 5;
		
		
	}
	static void sayHelloWorld() {
		System.out.println("Hello World!");
	}
	static void sayHelloto(String name) {
		System.out.println("Hello " + name);
		
	}

}
