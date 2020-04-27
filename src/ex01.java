import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ex01 {

	public static void main(String[] args) {
	
		
		Map<String,String> clientMap = new HashMap<String, String>();
		
		clientMap.put("age", "여자");
		clientMap.put("gender", "남자");
		clientMap.put("address", "가산디지털단지");
		
		String name = "age"
				+ "";
		//
		Set<String> keys = clientMap.keySet();
		System.out.println("목록");
		for(String key : keys) {
			if(name.equals(key)) {
				System.out.println("동일한 이름이 있습니다."+ name);
				break;
			}
	
		}//
		

	}

}

