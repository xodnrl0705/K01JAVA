
public class QuUpgradeGuGu {
	
	
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			int result = i;
			for(int j=1;j<=9;j++) {
				System.out.print(i);
				if(j == 1) {
					System.out.println("X"+1+"="+i);
				}
				else {
					result *= i;
					for(int k=1; k<=j-1;k++) {
						System.out.print("X"+i);
					}
					System.out.println("="+result);
				}
				
			}
		}

	}

}
