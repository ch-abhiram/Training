package DAY15.StringBuffer;

public class buffer {
    public static void main(String[] args) {
        StringBuffer obj = new StringBuffer("hello");
        System.out.println(obj.capacity());
        System.out.println(obj.length());
        System.out.println(obj.append("mem"));
        System.out.println(obj.insert(2,"pepepe"));
        System.out.println(obj.reverse());
        System.out.println(obj.charAt(4));
        System.out.println(obj.indexOf("o"));
        System.out.println(obj.lastIndexOf("m"));
        System.out.println(obj.delete(4,7));

    }
}
