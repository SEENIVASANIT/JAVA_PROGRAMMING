import java.util.*;
public class Flames {

	public static void main(String[] args) throws Exception {
		System.out.println("Plese Enter Name Without Space in Small Letters!!!");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the boy name:");
		String name_boy=input.nextLine();//input Boy_name
		System.out.print("Enter the Girl name:");
		String name_girl=input.nextLine();//input_girl_name
		int name_boy_length=name_boy.length();
		int name_girl_length=name_girl.length();
		char []arry_girl=new char[name_girl_length];
		int arry_size=arry_girl.length;
		int count_boy=0;
		if(name_boy_length==0) {
			System.err.print("Plese Enter The Valid Boy Name!");
		}
		else if (name_girl_length==0) {
			System.err.print("Plese Enter The Valid Girl Name!");
		}else {
			
		
		/////////Store_girl_name_in_arry///////
		for(int index=0;index<name_girl_length;index++)
		{
			arry_girl[index]=name_girl.charAt(index);
		}
	////////////////////End///////////////////////
		for(int index_boy=0;index_boy<name_boy_length;index_boy++) 
		{
			for(int index_girl=0;index_girl<arry_size;index_girl++)
			{
				if(name_boy.charAt(index_boy)==arry_girl[index_girl])
				{
					for(int arry_index=index_girl;arry_index<arry_size-1;arry_index++) 
					{
					arry_girl[arry_index]=arry_girl[arry_index+1];
					}
					index_girl=0;
					count_boy++;
					arry_size--;
					break;
			}
		}
	}
		int total_count=name_boy_length-count_boy+(arry_size);
	flames(total_count,name_boy,name_girl);
		}//End else
	}////End main_Function
	//////////////////////////////////////Check Flamesh/////////////////////// 
	static int count=0;
	public static void flames(int a,String Boy,String girl)throws Exception {
		char flames_arry[]= {'F','L','A','M','E','S'};
		char flames_arry2[]= {'F','L','A','M','E','S'};//////Comparison_Flames
		int flames_length=flames_arry.length;
		if(a==0) {
			//System.out.println(Boy+"-{"+"🫂Friend🫂"+"}-"+girl);
	}else {
			
		
		while (flames_length!=1)
		{
		for( int index=0;index<flames_length;index++)
		{
			count++;
			if (count==a) 
			{
				for(int remove=index;remove<flames_length-1;remove++)
				{
					flames_arry[remove]=flames_arry[remove+1];	
				}
				flames_length--;
				count=0;
				index--;	
			}		
		 }
		}
		}
		
/////////////////Printing	Result/////////////////////	
		if(flames_arry[0]==flames_arry2[0]) {
			System.out.println(Boy+"-{"+"🫂Friend🫂"+"}-"+girl);
		}
		else if (flames_arry[0]==flames_arry2[1]) {
			System.out.println(Boy+"-{"+"💖Love💖"+"}-"+girl);
		}else if (flames_arry[0]==flames_arry2[2]) {
			System.out.println(Boy+"-{"+"😍Affection😍"+"}-"+girl);
		}else if (flames_arry[0]==flames_arry2[3]) {
			System.out.println(Boy+"-{"+"💃Marriage🕺"+"}-"+girl);
		}else if (flames_arry[0]==flames_arry2[4]) {
			System.err.println(Boy+"-{"+"😈Enemy😈"+"}-"+girl);
		}else  {
			System.out.println(Boy+"-{"+"👫Sister👫"+"}-"+girl);
		}
	}///end flames Function
}////End class
/////////////////////////////////////////Program OUTPUT////////////////////////////////  /*
/*
                                 Plese Enter Name Without Space in Small Letters!!!
                                          Enter the boy name:alexandaer
                                            Enter the Girl name:samantha
                                            
                                          alexandaer-{💖Love💖}-samantha
*/