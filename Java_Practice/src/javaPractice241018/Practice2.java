package javaPractice241018;

import java.util.Scanner;

public class Practice2 {
//조건문 연습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idAdmin = "admin";
		int passAdmin = 1234;
		System.out.println("=====로그인=====");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID : ");
		String idInput = scanner.next();
		System.out.println("Password : ");
		int passInput = scanner.nextInt();
		scanner.close();

		boolean idCheck = idAdmin.equals(idInput);
		boolean passCheck = passAdmin == passInput;
		int i = 0;
		
		if (idCheck && passCheck) {
			System.out.println("==========로그인 성공==========");
			System.out.println("환영합니다. 하청빈님");
			i = 1;
		} else if (idCheck) {
			System.out.println("==========로그인 실패==========");
			System.out.println("비밀번호가 틀렸습니다.");
			i = 2;
		} else if (passCheck) {
			System.out.println("==========로그인 실패==========");
			System.out.println("존재하지 않는 아이디 입니다.");
			i = 3;
		} else {
			System.out.println("==========로그인 실패==========");
			System.out.println("다시 로그인 해주세요.");
			i = 4;
		}
		
		switch (i) {
		case 1: {
			System.out.println("==========로그인 성공==========");
			System.out.println("환영합니다. 하청빈님");
			break;
		}
		case 2: {
			System.out.println("==========로그인 실패==========");
			System.out.println("비밀번호가 틀렸습니다.");
			break;
		}
		case 3: {
			System.out.println("==========로그인 실패==========");
			System.out.println("존재하지 않는 아이디 입니다.");
			break;
		}
		case 4 : {
			System.out.println("==========로그인 실패==========");
			System.out.println("다시 로그인 해주세요.");
			break;
		}
		default:
			System.out.println("무언가 잘못되었습니다");
		}
	}


}
