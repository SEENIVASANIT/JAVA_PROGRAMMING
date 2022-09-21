package seeni;

public class Linear_search {

	static public  void main(String[] args) {
		int arry[]= {10,20,6,3,57};
		String a="seenivasan";
		int towdarry[][]= {{1,22,123},{1,10,1}};
		System.out.println(towdarry.length);
	System.out.println(Get.arryvalue(arry, 69));
Get.linersearch_in_string(a);
Get.towdarry_search(towdarry);
//1 22 123
//1 10 1
//
	}

}
class Get{
	public static int arryvalue(int arry[], int a) {
		for(int i=0;i<arry.length;i++) 
			
			
if(arry[i]==a)
  return i;
return-1;
	
		
	}
public static void linersearch_in_string(String a){
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='a') {
			
			System.out.println( a.charAt(i));
			break;
			}
	}
		
	}
public static void towdarry_search(int [][] arry) {
	for(int i=0;i<arry.length;i++) {
		for(int j=0;j<arry[i].length;j++) {
			if(arry[i][j]==10) {
				System.out.println(arry[i][j]+"yes");
				break;
			}
		}
	}
}
	
}
