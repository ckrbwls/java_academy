
public class java_1005 {

	public static void main(String[] args) {
		int menu =1;

		if(menu ==1) {
			System.out.println("한식");
		}else if(menu ==2) {
			System.out.println("중식");
		}else if(menu == 3) {
			System.out.println("기타");
		}else { System.out.println("잘못된 메뉴"); 
		}
		//final을 붙이면 변경할 수 없음
		final int KOREA = 1;
		final int CHINA = 2;
		final int ETC =3;

		//위의 처리를 switch로 처리
		switch (menu) {
		case KOREA: System.out.println("한식");
		break;
		case CHINA: System.out.println("중식");
		break;
		case ETC: System.out.println("기타");
		break;
		default :  System.out.println("잘못된 메뉴");
		break;

		}
		{
			int idx = 0;
			while(idx <3) {
				System.out.println("image"+ (idx+1) +".png");
				idx = idx +1;

			}
		}
		int idx = 0;
		do { System.out.println(10-2*idx);
		idx = idx + 1;

		}while (idx < 6);

		int i =1;
		int sum = 0;
		while(i <11) { 
			i = i + 1;
			sum = sum + i;
		} System.out.println("합계:" + sum);

	}
	}
