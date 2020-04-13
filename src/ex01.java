import java.util.Arrays;

interface A{
	int A = 7, B = 4, C=2;
}

public class ex01 {

	public static void main(String[] args) {
		
		String[][] a = {
				{"1", "2", "3"},
				{"4", "5", "x"}
				
		};
		String[][] b = {
				{"1", "2", "3"},
				{"4", "x", "6"}
				
		};
		String[][] c = {
				{"1", "2", "3"},
				{"4", "5", "x"}
		};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.deepEquals(a, b));
		System.out.println(Arrays.deepEquals(a, c));
	}

}
