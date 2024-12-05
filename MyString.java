public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCase = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
                lowerCase += ch;
            }
            else {
                lowerCase += ch;
            }
        }
        return lowerCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int lenght1 = str1.length();
        int length2 = str2.length();

        if (length2 > lenght1) {
            return false;
        }
        for (int i = 0; i < lenght1; i++) {
            if (i + length2 > lenght1) {
                break;
            }
            String subString1 = str1.substring(i, i + length2);
            for (int j = 0; j < lenght1; j++) {
                if (str2.indexOf(subString1) != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
