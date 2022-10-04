
public class Login {

	public static void main(String[] args) {
		String id = "itstudy"; 
		//그렇지 앟으면 존재하지 않는 아이디라고 출력
		if (id == "itstudy") {System.out.println("이미 존재하는 아이디");
		}
		else {System.out.println("존재하지 않는 아이디"); 
	}
		String pw = "1234";
		//id 가 itstudy 이고 pw가 1234 이면 로그인 성공
		//그렇지 않으면 로그인 실패하고 출력
		
		if ( id =="이미 존재하는 아이디" && pw == "1234") {System.out.println("로그인");
		
		}else {System.out.println("로그인 실패");
		
		}
		
		// 아이디가 itstudy 이고 pw 가 1234 이면 로그인 성공
		// 아이디가 itstudy 인데 pw 가 1234가 아니면 비밀번호가 틀렸다고 
		// 그 이외의 경우는 없는 아이디라고 출력
		if ( id =="itstudy" && pw == "1234") {System.out.println("로그인 성공");
		}else if (id =="itstudy") {System.out.println("잘못된 비밀번호"); 
}		else {System.out.println("없는 아이디");

}
}
}
