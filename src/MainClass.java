import java.util.ArrayList;
import java.util.Scanner;

/*
 * 메인 클래스
 */

public class MainClass {

	public static void main(String[] args) {
		System.out.println("메인 클래스");
		
		//클래스 선언
		MyClass mc = new MyClass();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		Calculate mc4 = new Calculate();
		
		
		
		mc.bab();
		mc.food();
		mc.nono();
		mc2.m2();
		
		mc3.r1();
		mc3.r2();
		
		int i =  mc3.r1();
		
		System.out.println(i);
		
		
		//클래스 만들고 매소드를 만들기
		//더달의 기능을 별도로 만들어서 
		//더하기 출력 해주는 메소드
		//더하기의 답을 전달 해주는 메소드
		//메인에서 메소드만 이용해서 출력 또는 답을 비교
		
		//int hab = mc4.cal();
		
		//mc4.userDab();
		
		//int input = mc4.userDab();
		
		ArrayList<Integer> aa = mc4.rnd2NumList();
		System.out.println(aa.get(0) +", " + aa.get(1));
		mc4.cal(aa.get(0),aa.get(1));
		
	}

}
