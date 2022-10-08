package Extra;

import java.util.Arrays;
import java.util.Locale;

public class Extra_extra {
    public static void main(String[] args) {
        String str0 = "Our honeymoon is over And the best days of our love Are dead and gone";

        String[] arr0 = str0.toLowerCase().split(" ");
        Arrays.sort(arr0);
        System.out.println(Arrays.toString(arr0));

        str0 = String.join("", arr0);
        String str1; // letter
        String str2 = ""; // letters occurred
        for(int i = 0; i < str0.length(); i++) {
            str1 = str0.substring(i, i + 1);
            int count;
            if (!str2.contains(str1)) {
                count = str0.length() - str0.replace(str1, "").length();
                str2 = str2.concat(str1);
                System.out.println(str1 + " - " + count);
            }
        }



    }
}
