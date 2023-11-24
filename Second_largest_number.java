package leedcode_String;

import java.util.Arrays;

public class Second_largest_number {

	public static void main(String ...args) {
Integer array[]= {1,2,3,4,5,6,7};

/////way 1
//
//Arrays.sort(array,(a,b)->b-a);
//System.out.println("Way 1");
//System.out.println("Secnd largesr number"+" "+array[1]);
///////////

///way 2
int first=-1;
int second=-1;
for(int i=0;i<array.length;i++) {
	if(array[i]>first) {
		second=first;
		first=array[i];
	}else if (array[i]>second && array[i]!= first) {
		second=array[i];
	}
	
}
System.out.println();
System.out.println("Way 2");
System.out.println("Secnd largesr number"+second);
	}

}
