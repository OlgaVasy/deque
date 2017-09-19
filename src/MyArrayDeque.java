import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

/**
 * P 239 project#3: MyArrayDeque.java
 */
public class MyArrayDeque {

   public static void main(String[] args){

   Deque<String> characters = new ArrayDeque<String>();

   Scanner input=new Scanner(System.in);
   System.out.println("Enter a sequence of characters: ");
   char[] chars = input.nextLine().toCharArray();
      for (int i=0; i<chars.length;i++){
        if (chars[i]!=' ')
        characters.addLast(String.valueOf(chars[i]));
      }
      if (!characters.isEmpty())
         System.out.println("The characters are : "+characters);
      else{
         System.out.println("There are no characters entered.");
         System.exit(0);
      }
   System.out.println();

   Deque<String> reverse = new ArrayDeque<String>();
   Iterator it = characters.descendingIterator();
      while (it.hasNext())
       reverse.addLast((String)it.next());

   System.out.println("The characters are: "+characters);
   System.out.println("The characters in reverse order are: "+reverse);

}}
