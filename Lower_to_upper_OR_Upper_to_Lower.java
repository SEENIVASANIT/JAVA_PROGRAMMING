import static java.lang.System.*;
import java.util.*;
public class Hello {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		out.println("Enter a name lowercase or lowercase!:");
		String name=input.nextLine();
		if(name.charAt(0)>='a' && name.charAt(0)<='z' )
			Lower_to_upper.lowercase(name);
		
		else
			Upper_to_lower.uppercase(name);
		
		
	}

}
class Lower_to_upper{
	public static void lowercase(String a) {
		//convert lowercase to upper case!
		for(int i=0;i<a.length();i++) {
			char name_word=a.charAt(i);
			int c=name_word-32;
			char type_cast_char=(char)c;
			out.print(type_cast_char);
		}
	}
}
class Upper_to_lower{
	public static void uppercase(String a) {
		//convert uppercase to lowercase!
		for(int i=0;i<a.length();i++) {
			char name_word=a.charAt(i);
			int c=name_word+32;
			char type_cast_char=(char)c;
			if(type_cast_char=='@')
				out.print(" ");
			else
				out.print(type_cast_char);
		}
	}
}
/////////////////////////////////////out put///////////////////////////////
//Enter a name lowercase or lowercase!:
//EG:1
//seeni vasan
//SEENI VASAN


//EG-2
//Enter a name lowercase or lowercase!:
///SEENIVASAN
//seenivasan

//EG-3
//Enter a name lowercase or lowercase!:
//SEENI VASAN
//seeni vasan

//EG-4
