package seeni;

public class Binary_search {
	public static void main(String []arg) {
		int []arry= {28,27,20,15,12,10,6,5,3,1};
	System.out.println(Bst.search(arry,2)); 
	}

}
class Bst{
	public static int search(int ary[],int torget) {
		
		int start=0;
		int end=ary.length-1;
	boolean ard=false;
	////check assading or dis
	if(ary[start]<ary[end])
		ard=true;
		while(start<=end) {
			int mid=(start+end)/2;
         if(ard) {
        	 if(torget>ary[mid])
 				start=mid+1;
 			else if (torget<ary[mid]) 
 				end=mid-1;
 			else 
 				//System.out.print(ary[mid]);
 				return mid;
 		}else {
 			if(torget>ary[mid])
 				end=mid-1;
 			else if (torget<ary[mid]) 
 				start=mid+1;
 			else 
 				//System.out.print(ary[mid]);
 				return mid;
		}
 		
         }
		return -1;
			
		
	}
}
