package java_0930;
public class Overflow{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		//primitive type이 아님
		int [] ar = {10, 20, 30};
		System.out.println(x);
		System.out.println(ar);
		//x가 30을 가리키도록 변결
		x =30;
		System.out.println(x);
		
		//int x= 30; //두번만들어서 에러
		//System.out.println(y);
		//y가 없어서 에러
		
		
		int age = 53;
		
		//int는 약 21억 정도까지만 저장
		//에러
		//age = 220000000000;
		
		//22억은 long에 저장
		long money = 2200000000L;
		
		//age = money;
		money = age;
		
		
		char ch = 'A';
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		
		
		//제어문자 사용
		System.out.println("안녕하세요\n반갑습니다.");
		
		
		
		double d =10.7;
		System.out.println(d);
		
		
		float f = 10.7f;
		System.out.println(f);
		
		
		//실수를 정수로 강제로 형변환해서 대입
		int k = (int)10.456;
		System.out.println(k);
		
		double result = 10.0/4;
		System.out.println(result);
		
		byte b = 127;
		b = (byte)(127+1);
		System.out.println(b);
		
		
		//boolean 변수를 만들고 출력하기
		
		boolean isPan = true;
		System.out.println(isPan);
		
		
		//문자열 저장
		String PersonalInformation = "차동섭\n30세\n180cm";
		System.out.println(PersonalInformation);
		
		int a = 10;
		System.out.println(System.identityHashCode(a));
		
		
		
	}
}
