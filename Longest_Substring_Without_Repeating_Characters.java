package leedcode_String;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
	public static void main(String []arg) {
		String a="dvdf";
		 int longest_supstring=0;
		List<Character> data=new ArrayList<Character>();
		for(int i=0;i<a.length();i++) {
			if(data.contains(a.charAt(i))) {
	int aa=data.indexOf(a.charAt(i));
				for(int j=0;j<=aa;j++) {
				      data.remove(data.get(0));
				}
				
				
			//data.add(a.charAt(i));

			}else {
				data.add(a.charAt(i));
				if(longest_supstring<data.size()) {
					longest_supstring=data.size();
				}
			}
		}
	
		System.out.print(longest_supstring);

	}

	
}
