public class IntegerToRoman {

    public String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,   4,   1};
        String[] romans = {"M",  "CM","D", "CD","C", "XC","L", "XL","X", "IX","V", "IV","I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                sb.append(romans[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();

        // Test cases
        System.out.println(converter.intToRoman(3749)); // Output: MMMDCCXLIX
        System.out.println(converter.intToRoman(58));   // Output: LVIII
        System.out.println(converter.intToRoman(1994)); // Output: MCMXCIV
        System.out.println(converter.intToRoman(9));    // Output: IX
        System.out.println(converter.intToRoman(4));    // Output: IV
    }
}
