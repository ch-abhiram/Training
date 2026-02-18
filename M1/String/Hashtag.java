package first.src.M1.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Hashtag {
    public static void main(String[] args) {
        String input = "I love #Java and #Regex in #Programming";
        List<String> res= extract(input);
        System.out.println(res);

    }

    public static List<String> extract(String text){
        List<String> hashtag = new ArrayList<>();

        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            hashtag.add(matcher.group(1));
        }
        return hashtag;
    }
    public static List<String> extractHash(String text){

        return Arrays.stream(text.split(" ")).filter(word->word.startsWith("#") && word.length()>1)
                .map(word->word.substring(1)).collect(Collectors.toList());
    }
}
