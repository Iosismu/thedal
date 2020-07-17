import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Calculate {
	
	
		public int [] rnd2Num() {
			Random rnd = new Random();
			int [] nums = new int [2];
			nums[0] = rnd.nextInt(89) + 10;
			nums[1] = rnd.nextInt(89) + 10;
			
			return nums;
			
		}
		
		public ArrayList<Integer> rnd2NumList(){
			ArrayList<Integer> list = new ArrayList<Integer>();
			Random rnd = new Random();
			list.add(rnd.nextInt(89) + 10);
			list.add(rnd.nextInt(89) + 10);
			return list;
		}
		
		//매개 변수로 두개를 받아서 더하기 값을 전달 하는 매소드
		//메소드 이름은 그대로 사용
		//메인 메소드에서
		//위에 만든 랜덤 숫자 2개를 전달 하는 메소드를 활용
		//메인 메소드에서 cal() 의 결과만 출력 해보자
		//rnd2NumList() 메소드를 호출하고
		//받은 데이터를 cal() 넣고 cal() 에서 결과 값을 외부를 전다해서
		//화면에 결과값만 출력
		
		
	
		public int cal(int a, int b) {
			System.out.print(a + " + " + b + " = " + (a+b));
			
			return a+b;
		}
		
		public int cal() {
			
		
			Random rnd = new Random();
			int num1 = rnd.nextInt(89) + 10;
			int num2 = rnd.nextInt(89) + 10;
			
			
			System.out.print(num1 + " + " + num2 + " = ");
		
			return num1 + num2;
		}		
		
		public int userDab() {
			Scanner scan = new Scanner(System.in);
			return scan.nextInt();
		}
		
		public boolean ox(int input, int hab) {
			
				if(hab == input) {
					return true;
				}
				else {
					return false;
				}
		}
		
		
}
