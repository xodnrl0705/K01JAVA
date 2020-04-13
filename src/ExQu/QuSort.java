package ExQu;

import java.util.Scanner;

//상위클래스(추상) Sort클래스
abstract class Sort{
	
	int[] arr;
	
	public Sort() {
		arr = new int[10];
		System.out.print("배열보기 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*99+1);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					arr[i] = (int) (Math.random()*99+1);
				}
			}
			System.out.printf("%2d ",arr[i]);
		}
		System.out.println();
	}
	
	abstract void ascSort();//오름차순정렬
	abstract void descSort();//내림차순정렬
}
//Sort클래스를 상속받는 버블정렬클래스
class BubbleSort extends Sort{
	
	int change;
	int sortNum = 1;
	
	public BubbleSort() {}
	
	//오름차순정렬
	@Override
	void ascSort() {
		while(sortNum <= arr.length-1) {
			
			for(int i = 0;i<arr.length-sortNum;i++) {
				if(arr[i]>arr[i+1]) {
					change = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=change;
				}
			}
			
			System.out.printf("Sort%d번진행 : ",sortNum);
			for(int i = 0;i<arr.length;i++) {
				System.out.printf("%2d ", arr[i]);
			}
			System.out.println();
			sortNum++;
		}
	}
	//내림차순정렬
	@Override
	void descSort() {
		while(sortNum <arr.length) {
			
			for(int i = arr.length-1;i>sortNum-1;i--) {
//				System.out.println(arr[i-1]+" "+arr[i]);
				if(arr[i-1]<arr[i]) {
					change = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=change;
				}
			}
			
			System.out.printf("Sort%d번진행 : ",sortNum);
			for(int i = 0;i<arr.length;i++) {
				System.out.printf("%2d ", arr[i]);
			}
			System.out.println();
			sortNum++;
		}
		
	}
	
}
//Sort클래스를 상속받는 선택정렬클래스
class SelectionSort extends Sort{

	int sortNum;
	int indexNum;
	
	public SelectionSort() {}
	//오름차순정렬
	@Override
	void ascSort() {
		int sortNum = 0;
		
		while(sortNum<arr.length-1) {
			int min = arr[sortNum];
			indexNum=sortNum;
			for(int i=sortNum;i<arr.length-1;i++) {
				if(min>arr[i+1]) {
					min = arr[i+1];
					indexNum = i+1;
				}
			}
			if(!(indexNum==sortNum)) {
				
				arr[indexNum]=arr[sortNum];
				arr[sortNum]=min;
			}
			
			System.out.printf("Sort%d번진행 : ",sortNum+1);
			for(int i = 0;i<arr.length;i++) {
				System.out.printf("%2d ", arr[i]);
			}
			System.out.println();
			sortNum++;
		}
	}
	//내림차순정렬
	@Override
	void descSort() {
		int sortNum = 0;
		while(sortNum<arr.length-1) {
			int max = arr[sortNum];
			indexNum=sortNum;
			for(int i=sortNum;i<arr.length-1;i++) {
				if(max<arr[i+1]) {
					max = arr[i+1];
					indexNum = i+1;
				}
			}
			if(!(indexNum==sortNum)) {
				
				arr[indexNum]=arr[sortNum];
				arr[sortNum]=max;
			}
			
			System.out.printf("Sort%d번진행 : ",sortNum+1);
			for(int i = 0;i<arr.length;i++) {
				System.out.printf("%2d ", arr[i]);
			}
			System.out.println();
			sortNum++;
		}
		
	}
}

public class QuSort {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Sort s1 = new BubbleSort();
		System.out.println("=================버블정렬=================");
		System.out.println("정렬방식을 선택하세요");
		System.out.println("1.오름차순");
		System.out.println("2.내림차순");
		int num = sc.nextInt();
		if(num == 1) {
			s1.ascSort();
		}
		else if(num == 2) {
			s1.descSort();
		}
		System.out.println("=======================================");
		Sort s2 = new SelectionSort();
		System.out.println("=================선택정렬=================");
		System.out.println("정렬방식을 선택하세요");
		System.out.println("1.오름차순");
		System.out.println("2.내림차순");

		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println(num1);
		if(num1 == 1) {
			s2.ascSort();
		}
		else if(num1 == 2) {
			s2.descSort();
		}

		
	}	
}




