package first.src.M1.StringManipulation;

import java.util.Scanner;

public class HashToFront {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String input = sc.nextLine();

       StringBuilder hashstr = new StringBuilder();
       StringBuilder str = new StringBuilder();

//       for (char i : input.toCharArray()) {
//           if (i == '#') {
//               hashstr.append(i);
//           } else {
//               str.append(i);
//           }
//       }
//
//       System.out.println(hashstr.append(str).toString());
//   }

       for (char i : input.toCharArray()) {
           if (Character.isDigit(i)) {
               hashstr.append(i);
           } else {
               str.append(i);
           }
       }
       System.out.println(str.append(hashstr).toString());

   }
}
