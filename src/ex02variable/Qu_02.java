package ex02variable;

/*
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)

 */
public class Qu_02 {

	public static void main(String[] args) {

		int kor = 99;
		int eng = 80; 
		int math = 96;
		
		double avg = (double) (kor+eng+math) / 3;
		/*double s = 3; 
		double avg = (kor+eng+math) / s;
		*/
		
		System.out.printf("%d점,%d점,%d점의 평균점수는 %.2f점입니다. \n", 
				kor, eng, math, avg);
		System.out.printf("%d점,%d점,%d점의 평균점수는 ",
				kor, eng, math, avg);
		System.out.println((int) avg + "점입니다.");
	}

}
