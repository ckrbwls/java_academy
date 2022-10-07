package java_1007;

public class Main1 {

	public static void main(String[] args) {
		//Hello Java를 3번 출력하는 작업을 자주 수행
		
		//static가 있는 메서드 호출
		//MethedClass.threeJava();

		//static이 붙지 않은 메서드 호출
		//인스턴스를 생성한후 인스턴스를 사용하여 호출
		MethedClass methedClass =
				new MethedClass();
		MethedClass.threeJava();
		//매개변수가 있는 메서드 
		//정수 1개를 받아서 작업을 수행하는 메서드
		//이 메서드를 호출할 때는 반드시 정수 1개를 대입해 주어야 합니다.
		methedClass.printDisp(6);
		
		//매개변수가 문자열과 정수인 메서드 호출
		//자바는 매개변수를 순서대로 대입해야합니다.
		methedClass.disp("ㅋㅋㅋㅋ", 2);
		
		methedClass.returnMethod(true);
		
	}

}
