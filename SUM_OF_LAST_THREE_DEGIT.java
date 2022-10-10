package sss;

public class Add_there {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=67242786;
////////////TAKE LAST THREE NUMBER/////////////////
int last_three_number=number%1000; ///(67242786 % 1000)=786
////////////TAKE LAST ONE NUMBER////////////////
int last_one_number=number%10;/////////(786 % 10)=6
////////TAKE LAST-1 NUMBER ///////////////
int last_minus1=last_three_number/10%10;/////(786 /10)=78  (78 % 10)=8
/////////////TAKE LAST-2 NUMBER//////////
int last_minus2=last_three_number/10/10;//////(786 /10)=78  (78 / 10)=7
System.out.print("SUM OF LAST THREE DIGIT : "+(last_one_number+last_minus1+last_minus2));

	
	}

}
