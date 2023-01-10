package collection;

import java.util.HashMap;
import java.util.Map;

public class a3 {

	public static void main(String[] args) {
		
		Map map=new HashMap ();
		
		map.put("Name","Tom");
		map.put("Roll_No", 07);
		map.put("Div", 'A');
		
		System.out.println(map.get("Name"));
        System.out.println(map.get("Roll_No"));
        System.out.println(map.get("Div"));
	}

}
