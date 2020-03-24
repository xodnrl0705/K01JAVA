

import java.util.Scanner;

/*
문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서 부터 채워나가고 짝수는 
배열의 끝에서부터 채워나간다.(두번째배열)
출력예시) 총 10개의 정수를 입력하시오.
1 2 3 4 5 6 7 8 9 10

순서대로입력된결과: 1 2 3 4 5 6 7 8 9 10
홀수/짝수 구분입력결과 : 1 3 5 7 9 10 8 6 4 2


 */
public class QuFillArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int k=1,m=1;
		
		for(int i=1;i<=arr.length;i++) {
			System.out.printf("%d번째 값을 입력해주세요: " , i);
			int num = sc.nextInt();
			arr[i-1] = num;
			//System.out.printf("%d ",arr[i-1]);
		}	
		for(int s=1;s<=arr.length;s++) {
			if(arr[s-1]%2==0) { 
				arr2[arr2.length-k]=arr[s-1];
				k++;
			}
			else {
				arr2[m-1]=arr[s-1];
				m++;
				
			}
		}
		for(int j=0;j<arr2.length;j++) {
			System.out.printf("%d ",arr2[j]);
		}

	}
}
