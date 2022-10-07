package java_1007;

public class MethedClass {
	public static void
	threeJava() {
		for(int i=0; i<3; i=i+1) {
			System.out.println("Hello Java");
		}
	}
	
	//매개변수가 있는 메서드
	public void printDisp(int n) {
		for (int i=0; i<n; i=i+1) {
			System.out.println("Hello Java");
		}
	}
	
	public void disp(String str, int n) {
		for (int i = 0; i<n; i=i+1) {
			System.out.println(str);
			
		}
	}
	
	//boolean 1개를 받아서 수행하는 메서드
	public void returnMethod(boolean b) {
		System.out.println("수행");
		//b가 false 이면 더 이상 작업을 수행하지 않고 종료
		if (b == false) {
			return;
			
		}
		System.out.println("수행");
	}
	
	//2개의 정수를 더하는 메서드
	//리턴하지 않고 출력하는 메서드
	public void noReturn(int a, int b) {
		System.out.println(a+b);
		
	}
	
	}
	

