
public class java_1004 {

	public static void main(String[] args) {
		// 정수를 저장하는 변수를 생성
		int age = 30;
		System.out.println(age);
		//age 가 가리키고 있는 데이터를 1 증가시킴
		age++;
		System.out.println(age);
		//명령에 사용하고 1증가 -54를 출력후 55
		System.out.println(age++);
		//1증가하고 명령에서 사용 -56되고 56 출력
		System.out.println(++age);
		
		
		//정수 데이터를 저장하는 변수
		int x = 10;
		int y = 4;
		
		System.out.println(x+y);
	
		System.out.println(x/y);
		
		byte b1 = 10;
		byte b2 = 4;
		byte result = (byte)(b1 / b2);
		
		System.out.println(result);
		
		// 정수 나누기 정수는 정수
		// 정수 나누기 정수를 했을 때 소수까지 출력
		//x 나누기 y 를 했을때 소수까지 나오도록
		double d = x/y;
		System.out.println(d);
		
		//위의 결과를 소수 첫째 자리에서 반올림
		int t= (int)((double)x/y+0.5);
		System.out.println(t);
		
		int money = 32760;
		// 정수 두번쨰 자리 반올림 32800
		int r = (int)((money/100.0 +0.4)*100);
		System.out.println(r);
		
		int idx=0;
		//무한반복
		while(true) {
			switch(idx %3) {
			case 0: System.out.println("빨강");
				break;
			case 1: System.out.println("파랑");
				break;
			case 2: System.out.println("노랑");
				break; }
			//idx 값을 1씩 증가
			idx++;
		}
	}
	{	
		int year = 2022;
		//year 가 윤년인지 판별
		// 4의 배수이고 100의 배수가 아니면 윤년
		//400의 배수는 윤년
		if (year % 4==0 && year % 100 !=0  || year % 400 ==0) {
			System.out.println("윤년");
		}else { System.out.println("윤년 아님");
		}
	}
		
			}
		
		
		

