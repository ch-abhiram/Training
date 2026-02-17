package first.src.M1.StringManipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompression {
    static void main(String[] args) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if(input == null || input.length()==0){
            System.out.println("");
            return;
        }

        StringBuilder result = new StringBuilder();

        // Count total frequency
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            result.append(entry.getKey());
            if(entry.getValue()>1){
                result.append(entry.getValue());
            }

        }
        System.out.println(result);
        sc.close();


    }
}
