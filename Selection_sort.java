package seeni;

public class Selection_sort {
public static void main(String[] args) {
	int arry[]= {10,15,5,3,2,19,1};
	Sort_assiding.arry_sort_assding(arry);
	for(int x:arry)
		System.out.print(x+" ");
	Sort_disaniding.arry_sort_disanding(arry);
	System.out.println();
	for(int x:arry)
		System.out.print(x+" ");
}
}
class Sort_assiding{
	public static void arry_sort_assding(int []arry) {
		for(int i=0;i<arry.length;i++) {
			int min_index=i;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[j]<arry[min_index]) {
					//min_index=j;
					int temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
				
			}
		}
	}
}
class Sort_disaniding{
	public static void arry_sort_disanding(int []arry) {
		for(int i=0;i<arry.length;i++) {
			int max_index=i;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[j]>arry[max_index]) {
					max_index=j;
				}
				int temp=arry[i];
				arry[i]=arry[max_index];
				arry[max_index]=temp;
			}
		}
	}
}

