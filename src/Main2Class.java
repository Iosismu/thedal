import java.util.Random;
import java.util.Scanner;

public class Main2Class {
	Scanner scan = new Scanner(System.in);
	
	public int car() {
	
		System.out.print("1.더하기 2.빼기 2.곱하기 3.나누기 0.종료\n숫자를 입력해주세요: ");
		int input = scan.nextInt();
		
		return input;
	}
	
	public int [] car2(int input) {
		int [] nums = new int[2];
		Random rnd = new Random();
		
		if(input == 1) {
			for(int i = 0; i < 10; i++) {
				int num1 = rnd.nextInt(30) + 10;
				int num2 = rnd.nextInt(10) + 1;
				System.out.print(num1 + " + " + num2 + " = " );
				int user = scan.nextInt();
				if(user == (num1 + num2)) {
					nums[0] += 1;
				}
				else {
					nums[1] += 1;
				}
			}
		}
		else if(input == 2) {
			for(int i = 0; i < 10; i++) {
				int num1 = rnd.nextInt(30) + 10;
				int num2 = rnd.nextInt(10) + 1;
				System.out.print(num1 + " - " + num2 + " = " );
				int user = scan.nextInt();
				if(user == (num1 - num2)) {
					nums[0] += 1;
				}
				else {
					nums[1] += 1;
				}
			}
		}
		else if(input == 3) {
			for(int i = 0; i < 10; i++) {
				int num1 = rnd.nextInt(30) + 10;
				int num2 = rnd.nextInt(10) + 1;
				System.out.print(num1 + " * " + num2 + " = " );
				int user = scan.nextInt();
				if(user == (num1 * num2)) {
					nums[0] += 1;
				}
				else {
					nums[1] += 1;
				}
			}
		}
		else if(input == 4) {
			for(int i = 0; i < 10; i++) {
				int num1 = rnd.nextInt(30) + 10;
				int num2 = rnd.nextInt(10) + 1;
				System.out.print(num1 + " / " + num2 + " = " );
				int user = scan.nextInt();
				if(user == (num1 / num2)) {
					nums[0] += 1;
				}
				else {
					nums[1] += 1;
				}
			}
		}
		else if(input == 0) {
			System.out.println("종료");
		}
		return nums;
	}
}
