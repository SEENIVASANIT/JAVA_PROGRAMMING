package seeni;

public class Bubble_sort {

	public static void main(String[] args) {
		int arry[]= {10,19,4,16,18,20};
////////ascending order///////////////////////		
		Bubble_Sort_ascending obj=new Bubble_Sort_ascending();
	//	obj.ascending(arry);
		int recvide_ascending_arry[]=obj.ascending(arry);
		for(int x:recvide_ascending_arry)
			System.out.print(x+" ");
		System.out.println();
		System.out.println("arry sescending order!");
////////////descending order/////////////////////
		Bubble_Sort_descending.descending(arry);
		int recvide_descending_arry[]=Bubble_Sort_descending.descending(arry);
		for(int x:recvide_descending_arry)
			System.out.print(x+" ");
	}
	

}
////////////ASCENDING ORDER/////////////////////////////
class Bubble_Sort_ascending{
	public int[] ascending(int []arry) {
		for(int i=1;i<arry.length-1;i++) {
			for(int j=0;j<arry.length-i;j++)//j<arry.length-i becose fiest pass the last element will be sort so we will check length-i;
			{
				if(arry[j]>arry[j+1])
				{
					int temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
				}
			}
		}
		return arry;
	}
}
////////////////DESCENDING ORDER///////////////////////////
class Bubble_Sort_descending{
	public static int[] descending(int []arry) {
		for(int i=1;i<arry.length-1;i++) {
			for(int j=0;j<arry.length-i;j++)//j<arry.length-i becose fiest pass the last element will be sort so we will check length-i;
			{
				if(arry[j]<arry[j+1])
				{
					int temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
				}
			}
		}
		return arry;
	}
}
//OUTPUT
//4 10 16 18 19 20 
//arry sescending order!
//20 19 18 16 10 4 