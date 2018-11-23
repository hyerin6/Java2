package e2018.exam2;
// innerClass - outterClass의 멤버변수를 자주 사용한다.
class World { 
	String message = "안녕하세요"; // World의 멤버변수

	public void doSomething() {  
		Hello hello = new Hello(); // outterClass 객체를 받지 않아도 된다.
		hello.say();   
	}

	class Hello { 
		public void say() {    
			System.out.println(message); // World의 멤버변수를 사용한다.
		}
	}
}

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World world = new World();   
		world.doSomething(); 
	}
}
