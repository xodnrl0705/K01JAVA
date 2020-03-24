package common;

public class Student extends Person {
	public String stNumber;

	public Student(String name, int age,String stNumber) {
		super(name,age);
		this.stNumber = stNumber;
	}
	
	@Override
	public String getInfo() {
		
		return super.getInfo()+", 학번:" + stNumber;
	}
	
	@Override
	public void showInfo() {
		System.out.println(getInfo());
	}
	

}
