import java.util.Scanner;
/*
게임설명 : 야구게임을 메소드를 이용하여 구현한다.
중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다.
생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종 료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.
위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3];
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.
 */
class BaseballGame{

	int[] com = new int[3];
	int[] user = new int[3];
	int gameCnt;
	int strCnt;
	int ballCnt;

	Scanner scan = new Scanner(System.in);

	public void gameStart() {
		gameCnt = 0;
		strCnt = 0;
		ballCnt = 0;
		for(int i=0; i<com.length ;i++) {
			com[i] = (int) ((Math.random()*9)+1);
		}
		for(int i=0; i<com.length ;i++) {
			System.out.println(com[i]+" ");
		}

		System.out.println();

		inputNumber();
	}

	public void inputNumber() {
		for(int i=0; i<user.length; i++) {
			System.out.printf("%d번째 숫자를 입력해주세요 : ",i+1);
			int userNum = scan.nextInt();
			user[i] = userNum;
		}
		isNumber();
	}
	public void isNumber() {

		for(int i=0; i<user.length; i++) {
			for(int j=0; j<com.length; j++) {
				if(user[i]==com[j] && i==j) {
					strCnt++;
				}
				else if(user[i]==com[j] && i!=j) {
					ballCnt++;
				}
			}
		}
		gameCnt++;
		showStrike();
	}

	public void showStrike() {
		for(int i = 0; i<user.length;i++) {
			System.out.printf("[%d]\t",user[i]);
		}
		System.out.println();
		if(strCnt ==0 && ballCnt == 0) {
			System.out.println("OUT 입니다!");
		}
		else {
			System.out.print(strCnt+" Strike "+ballCnt+" Ball");
			System.out.println();
		}

		if(strCnt == 3) {
			System.out.println("3 Strike!! 정답을 맞추셨습니다.");
			System.out.println("시도횟수 : " + gameCnt);
			restart();

		}
		else {
			strCnt = 0; ballCnt=0; 
			inputNumber();
		}
	}

	public void restart() {
		System.out.println("게임 재시작(1) | 게임종료(0) : ");
		int plusGame = scan.nextInt();

		if(!(plusGame == 1 || plusGame == 0)) {
			System.out.println("잘못 입력 하였습니다. 0 또는 1만 입력하세요!!");
			restart();

		}
		else if(plusGame ==1) {
			System.out.println("게임을 재시작 하겠습니다.");
			gameStart();

		}
		else {
			System.out.println("게임을 종료합니다.");
		}
	}
}


public class QuBaseballGame {
	public static void main(String[] args) {
		BaseballGame game1 = new BaseballGame();
		game1.gameStart();
	}
}
