package coding_interview;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(reverse(s));
    }

    public static String reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;

        }
        return String.valueOf(chars).toString();
    }
}
