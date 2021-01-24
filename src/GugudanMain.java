
public class GugudanMain {							//*클래스는 첫글자 대문자, 메소드는 소문자
	public static void main(String[] args) {          // *자바 클래스는 메인메소드가 있어야 실행 가능
		for(int i = 2; i < 10; i++) {
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result);
		}
	}
}
