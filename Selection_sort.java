package seeni;

public class Selection_sort {
public static void main(String[] args) {
	int arry[]= {10,15,5,3,2,19,1};
	Sort_ascending.arry_sort_ascending(arry);
	for(int x:arry)
		System.out.print(x+" ");
	Sort_descending.arry_sort_descending(arry);
	System.out.println();
	for(int x:arry)
		System.out.print(x+" ");
}
}
class Sort_ascending{
	public static void arry_sort_ascending(int []arry) {
		for(int i=0;i<arry.length;i++) {
			int min_index=i;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[j]<arry[min_index]) {
					min_index=j;
				}
				int temp=arry[i];
				arry[i]=arry[min_index];
				arry[min_index]=temp;
			}
		}
	}
}
class Sort_descending{
	public static void arry_sort_descending(int []arry) {
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

//OUTPUT
//1 2 3 5 10 15 19 
//19 15 10 5 3 2 1 