public class MainClass2 {

	public static void main(String[] args) {
		/*
		System.out.println("예외 처리");
		try {
			
			int [] arr = new int [2];
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자만 입력: ");
			int inp = sc.nextInt();
			System.out.println("당신이 입력한 숫자: " + inp);
			
		} catch (Exception e) {
			System.out.println("오류발생");
		}*/
		
		
		
		Main2Class mc = new Main2Class();
		
		for(;;) {
			int aa = mc.car();
			int[] ww = mc.car2(aa);
			
			if(ww[0] != 0 && ww[1] != 0) {
			System.out.println("맞은개수: " + ww[0] + "\n틀린개수: " + ww[1] + "\n");
			}
			
			if(aa == 0) {
				break;
			}
		}
	}

}