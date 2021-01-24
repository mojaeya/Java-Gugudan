public class Gugudan {
	public static int[] calculate(int times) {
		       //반환출력/ 메소드명        /입력//
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {        
			result[i] = times * (i + 1);    
		}
		return result; //반환 : return으로 표시
	}
	
	public static void print(int[] result) {     //void = 메소드를 출력했을때 반환되는 값이 없다. 입력만 있을뿐.
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

//	public static void main(String[] args) {
//		int[] result = calculate(2);
//		print(result);
//		
//		int[] times3 = calculate(3);
//		print(times3);
//		
//		int[] times4 = calculate(4);
//		print(times4);
//		
//		int[] times5 = calculate(5);
//		print(times5);
		
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}
