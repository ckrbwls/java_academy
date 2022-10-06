package java_1006;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		//입력받은 항 까지의 피보나치 수여르이 합
		//피보나치 수열은 첫번째와 두번째 항은 1이고 세번째 항부터는 이전 2개의 항의 합
		// 1, 1, 2, 3, 5, 8, 13, 21...
		
		//하나의 정수 입력받기
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int fib = sc.nextInt();
		*/
		//합을 저장할 변수
		//규칙이 3번째부터 성립하므로 2번째 까지의 합을 가지고 출발
		int fiboSum = 2;
		
		//현재의 피보나치 수와 이전 2개 항의 수를 저장하기 위한 변수를 생성
		int f1 =1; //현재 이전
		int f2 =1; // 현재 이전의 이전
		
		//3번째 부터 fibo 까지 반복
		
		/*int n = 3;
		while(n <=fib) {
			//현재 항을 구하기
			int f = f1 + f2;
			//현재 항을 합에 추가
			fiboSum = fiboSum + f;
			
			f2 =f1;
			f1 = f;
			
			n = n+1;
			System.out.println(f);
		}
		
		sc.close();
		*/
		/*
		Scanner sc = new Scanner(System.in);
		
			System.out.print("아이디:");
			String id = sc.nextLine();
			
			//입력한 문자열이 아담 인지 확인
			boolean result =  id == "아담";
			System.out.println(result);//false
			//== 는 데이터를 비교하는것이 아니고 해시코드를 비교
			
			//non premitive 타입은 equals 메서드로 내용 비교
			result =id.equals("아담");
			System.out.println(result);
			
			
			sc.close();
			*/
			
		/*
		//정수를 저장할 수 있는 배열 생성
		int [ ] ar;//배열에 메모리 할당을 안해서 에러
		//배열에 3개의 공간을 할당
		ar = new int [3];
		System.out.println(ar[0]);
		
		//배열의 크기가 3이므로 0-2까지만 가능
		//System.out.println(ar[3]);
		
		
		// 배열의 선언과 메모리 할당을 동시에
		//실수 3개를 저장할 수 있는 배열을 생성
		double [ ] br = new double[3];
		
		
		// 배열 선언과 동시에 초기화 (데이터 설정)
		String [ ] aespa = { "카리나", "지젤", "윈터", "닝닝"};
		//배열의 데이터 개수 확인
		System.out.println(aespa.length);
		
		//aespa 배열이 가진 모든 데이터를 출력
		//데이터 개수에 리터럴 사용
		for (int i=0; i<4; i=i+1) { System.out.println(aespa[i]);
		}
		//리터럴 대신에 aespa.length 속성 이용
		//배열의 데이터 개수가 변경이 되도 코드를 수정할 필요가 없음
		for (int i=0; i<aespa.length; i=i+1) { System.out.println(aespa[i]);
		}
		
		//데이터의 개수를 LEN에 넣고 순회
		//. 이나 [인덱스]를 이용해서 데이터에 접근하면 메모리 접근 횟수가 늘어납니다.
		final int LEN = aespa.length;
		for (int i=0; i<LEN; i=i+1) { System.out.println(aespa[i]);
		}
		
		
		//자바에서는 배열이나 List의 경우 빠른 열거 라는 문법을 허용
		//for (임시변수 : 컬렉션)
		//을 이용하면 컬렉션의 모든 데이터를 순차적으로 임시 변수에 대입합니다.
		for(String singer : aespa) { System.out.println(singer);
		
		}
		
		*/
		
		
		/*
		//배열 생성
		String [ ] subjects = {"비트", "리플", "코인", "이더", "부자", "도지", "트론", "카카오", "삼성"};
		//배열이 참조하고 있는 곳을 copy도 참조하도록 한 것 = 참조 복사
		String [ ] copy = subjects;
		System.out.println(subjects[0]);
		copy[0] = "bit";
		//copy극 이용해서 0번째 데이터를 수정하면 subjects에도 동일한 효과
		//되도록이면 참조 복사는 하지 않는것을 권장합니다.
		System.out.println(subjects[0]);
		
		*/
		
		String [ ] [ ] groups = {{"레드벨벳", "에스파"}, {"미쓰에이", "ITSY"}, {"2NE1", "블랙핑크"}};
		
		
		
		
		}
		
		
		
	}


