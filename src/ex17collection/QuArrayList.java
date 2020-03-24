package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;
/*
문제1) QuArrayList.java 
사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를
 알아내서 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라.
 
 */
public class QuArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름:");
		String searchName = sc.nextLine();
			
		//2.확장for문으로 컬렉션 전체를 접근
		int index = -1;//인덱스는 0이상이므로 초기값은 -1로 지정함.
		for(Student st : list) {
			System.out.println("객체의 이름:"+st.getName());
			
			if(st.getName().equals(searchName)) {
				//객체의 참조값을 통해 List내의 index값을 찾음.
				list.indexOf(st);
				//해당 객체를 찾으면 즉시 루프 탈출
				break;
			}
			
		}
		//3.검색결과 유/무에 따라 
		if(index == -1) {
			//검색결과 없을때...검색결과가 없다고 출력
			System.out.println("\n검색된 결과가 없습니다.");
		}
		else {
			//검색결과 있을때…검색된 데이터 삭제
			System.out.println("\n검색된 결과 있음.");
			System.out.println("[삭제된 객체의 정보출력]");
			/*
			인덱스를 통해 컬렉션에 저장된 객체를 삭제하면 해당 객체를 
			반환하게 되므로 객체의 정보를 출력할 수 있다.
			 */
			list.remove(index).showInfo();
		}
		//4.전체정보 출력
		System.out.println("전체 정보 출력");
		for(Student st :list) {
			System.out.println(st.getInfo());
		}
	}



}
