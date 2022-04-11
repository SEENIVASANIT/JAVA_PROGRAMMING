
//        REMOVE CHARATER IN THA STRING!!!
import java.util.*;

class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.print("ENTER ANY WORD!");
        //GET USER INPUT String;
        String user_input=input.nextLine();
        System.out.print("ENTER REMOVE CHARATER IN WORD!");
        char remove_char=input.next().charAt(0);
        //GET USER INPUT Char;
        char[] arry=user_input.toCharArray();


        int user_input_size=arry.length;
        for (int index_value=0;index_value<arry.length;index_value++)
        {
            if (arry[index_value] == remove_char) //CHECK SAME CHARATER or NOT
            {
                for (int index = index_value; index < user_input_size-1; index++)
                {
                    arry[index] = arry[index + 1];//  NEXT VALUE REPLACE IN FIRST VALUE
                }
                user_input_size--;
                index_value--;

            }
        }
        //PRINT ARRAY ELEMENTS
        for (int index=0;index<user_input_size;index++)
        {
            System.out.print(arry[index]);
        }
        //String a=Arrays.toString(arry);
        //System.out.print(a);
    }
}
//##############################################################################################################//
//                       PROGRAM-OUTPUTIS
//                 ----------------------------
//               ENTER ANY WORD!                 HELLOWORLD
  //             ENTER REMOVE CHARATER IN WORD!  L
    //           output=                         HEOWORD