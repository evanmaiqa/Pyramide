package Extra;

public class Builder {
    /**
     * https://www.youtube.com/watch?v=bKc6zvWF-nw&list=PLN_SYR3PfTtkj8BQXwYR74m4BL5UxSBF0&index=108
     */

    public static void main(String[] args) {
        String str_0 = String.join(" ", "method", "concatenates", "the", "Strings"); // object1
        str_0 = str_0.concat("1");// object2
        str_0 = str_0.concat("2");// object3
        str_0 = str_0.concat("3");// object4
        str_0 = str_0.concat("4");// object5
        System.out.println(str_0);

        StringBuilder stringBuilder = new StringBuilder("Concatenate");

        System.out.println("String = " + stringBuilder);
        System.out.println("length = " + stringBuilder.length());
        System.out.println("capacity = " + stringBuilder.capacity());

        System.out.println(stringBuilder.charAt(0));
        // change index
        stringBuilder.setCharAt(0, 'S');
        System.out.println("change index = " + stringBuilder);

        // cut StringBuilder
        stringBuilder.setLength(3);
        System.out.println("cut StringBuilder = " + stringBuilder);

        // append
        StringBuilder sb = new StringBuilder();
        String str_1 = sb.append("77").append("---!").toString(); // toString - приводим к строке
        System.out.println("Append = " + str_1);



        // Task 1
        StringBuilder stringBuilder1 = createSomeString(3, 56);
        StringBuilder stringBuilder2 = createSomeString(30, 2);
        String s = stringBuilder1.toString();
//        System.out.println(stringBuilder1);
//        System.out.println(s);
        System.out.println(stringBuilder2);

        // modifySomeString
        System.out.println(modifySomeString(stringBuilder1));

        // insert
        StringBuilder stringBuilder3 = new StringBuilder("I Java");
        stringBuilder3.insert(2, "is ");
        System.out.println("insert: " + stringBuilder3);

        // reverse
        StringBuilder stringBuilder4 = new StringBuilder("Hello");
        System.out.println("reverse " + stringBuilder4.reverse());

        //delete
        StringBuilder stringBuilder5 = new StringBuilder("This is test");
        System.out.println("before delete: " + stringBuilder5);
        System.out.println("after delete: " + stringBuilder5.delete(4, 8));

        //deleteCharAt
        StringBuilder stringBuilder6 = new StringBuilder("Concatenate");
        System.out.println("deleteCharAt(0) " + stringBuilder6.deleteCharAt(0));

    }

    private static StringBuilder createSomeString(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return stringBuilder;
    }

    private static StringBuilder modifySomeString(StringBuilder stringBuilder) {
        int position;
        while ((position = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(position);
            stringBuilder.insert(position, "equal");
        }
        return stringBuilder;
    }
}
