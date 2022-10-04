
public class java_1004_1 {

	public static void main(String[] args) {
			int a = 11;//1011
			/*
			 // 이진수로 변환한 결과 확인
			System.out.println(Integer.toBinaryString(a));
			*/
			int b = 14;//1110
			System.out.println(a&b);//1010	and
			System.out.println(a|b);//1111  or
			System.out.println(a^b);//0101	xor
			
			
			// a b 중에서 큰 수 찾기
			int max = a > b ? a : b;
			System.out.println(max);
			
			
	}
}
