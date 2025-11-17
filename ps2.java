public class ps2 {
    public static void main(String[] args) {

        char[] text = new char[20];
        String textStr = "Hello";

        for (int i = 0; i < textStr.length(); i++) {
            text[i] = textStr.charAt(i);
        }

        System.out.println(text.length);
        System.out.println(textStr.length());
        System.out.println("Hello".length());
    }
}
