package DAY14.String;

public class demo {
    public static void main(String[] args) {
        String name = "hello";
        char[] c = {'h','e','l','l','o'};
        String s = new String(c);
        System.out.println(s);
        System.out.println(name.compareTo(s));
        System.out.println(name.concat(s));
        System.out.println(name.length()+" "+s.length());
        System.out.println(name.charAt(3));
        System.out.println(name.equals(s));
        System.out.println(name.startsWith("h"));
        System.out.println(name.endsWith("o"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String a = "he llo ";
        System.out.println(a.trim());
        System.out.println(name.split("e"));
        System.out.println(name.replace("e","a"));


    }
}
