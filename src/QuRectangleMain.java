

class Rectangle{
    int bottom, height;
	
	public Rectangle() {}
	
	public Rectangle(int bot, int hei) {
		bottom = bot;
		height = hei;
	}
	public void ShowAreaInfo() {
		System.out.println("직사각형의 면적: "+(bottom*height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
    public Square(int bottom) {
    	super();
    	this.bottom = bottom;
    }
    
    public void ShowAreaInfo() {
		System.out.println("정사각형의 면적: "+(bottom*bottom));
	}
} 

public class QuRectangleMain {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
 
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();

	}

}

/*
 직사각형 면적: 12
정사각형 면적: 49

 */
