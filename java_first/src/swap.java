
public class swap {

	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		
		//x 와 y 의 내용물을 교체
		int temp = x;
				x=y;
				y = temp;
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		int time = 99980;
		int hour = time/3600;
		int minute = (time-(hour*3600))/60;
		//초는 분까지를 제외한 부분
		int second = time%60;
		System.out.println(hour+"시간"+minute+"분"+second+"초");
		
		
		
	int score = 103;
		//스코어가 60 이상이면 합격 아니면 불합격
	/*
		if (score >= 60) { System.out.println("합격");
		}
		else { System.out.println("불합격"); }
		*/
		//80에서 100 사이면 우수
		//60에서 79사이면 보통
		//0에서 59사이면 노력이라고 출력
	
			if(score >= 80 && score <=100){System.out.println("우수");
		}else if(score >= 60 && score <80){System.out.println("보통");
		}else if(score >= 0 && score <60){System.out.println("노력");
		}else { System.out.println("잘못된 점수");}
		
		
		
	
	}

}

