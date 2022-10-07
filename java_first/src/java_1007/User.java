package java_1007;

public class User {
	//유저의 아이디, 계좌번호, 잔액을 각각의 유저가 소유하도록 선언
	//인스턴스 속성으로 생성
	public String id;
	public String accountNumber;
	public int balance;
	
	//이클래스가 처음 사용 될 때 한번 수행
	static { System.out.println("처음에 한번 수행");}
	
	//일반 초기화 : 인스턴스 생성할때마다 수행
	//new를 만나면 인스턴스가 생성됨
	{ System.out.println(" 인스턴스 생성할 때 마다 수행");
}
	//값을 변경하지 못하는 읽기 전용 속성을 생성
	// 실제 프로그램에서 
	
	//동일한 패턴의 작업을 연속해서 여러번 할때는 반복문을 사용
}
