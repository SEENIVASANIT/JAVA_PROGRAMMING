package seeni;

public class Insertion_sort {

	public static void main(String[] args) {
		int arry[]= {5,8,7,9,11,3,2};
		int []recevied_asscending=Sort_ascending_order.ascending_order(arry);
for(int x:recevied_asscending)
	System.out.print(x+" ");

     int []recevied_descending=Sort_descending_order.descending_order(arry);
    for(int x:recevied_descending)
     System.out.print(x+" ");
}
	

} 
class  Sort_ascending_order{
	public static int[] ascending_order(int []arry) {
		System.out.println("Ascending order!");
		for(int i=1;i<arry.length;i++) {
			for(int j=i;j>0;j--)
			{
				if(arry[j]<arry[j-1]) {
					int temp=arry[j];
					arry[j]=arry[j-1];
					arry[j-1]=temp;
				}
				else 
					break;
			}
		}
		return arry;
	}
}

////////////////////////////////////descending////////////////
class  Sort_descending_order{
	public static int[] descending_order(int []arry) {
		System.out.println();
		System.out.println("Descending order!");
		for(int i=1;i<arry.length;i++) {
			for(int j=i;j>0;j--)
			{
				if(arry[j]>arry[j-1]) {
					int temp=arry[j];
					arry[j]=arry[j-1];
					arry[j-1]=temp;
				}
				else 
					break;
			}
		}
		return arry;
	}
}
