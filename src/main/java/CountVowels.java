public class CountVowels {
    public static int count(String s) {
        int n = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) >= 0) n++;
        return n;
    }
    public static void main(String[] args) { System.out.println(count("Hello World")); }
}
