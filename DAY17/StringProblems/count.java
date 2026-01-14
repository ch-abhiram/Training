package DAY17.StringProblems;

import java.util.Scanner;

public class count {

    static void vowels(String s){
        s = s.toLowerCase();
        int vowelscount = 0;
        int consonentscount = 0;
        int numbercount = 0;
        int specialcount = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    if(s.charAt(i) == 'a' || s.charAt(i) =='e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                        vowelscount++;
                }else {
                        consonentscount++;
                    }
            } else if (s.charAt(i)>=48 && s.charAt(i)<=57) {
                numbercount++;

            }else {
                specialcount++;
            }

        }
        System.out.println("vowels count: "+vowelscount);
        System.out.println("consonents count: "+consonentscount);
        System.out.println("number count: "+numbercount);
        System.out.println("special char count: "+specialcount);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        vowels(s);

    }
}
