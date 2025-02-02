package Task_2_Feb_String;

public class String_Function {
    public static void main(String[] args) {
        String s1 = "Hello"; // Creates or reuses "Hello" in the String pool
        String s2 = "Hello"; // Reuses the "Hello" from the String pool
      //  String s3 = s1+s2; // Creates a new object on the heap
        String s3 = new String("Hello");
        System.out.println(s1 == s2); // true, both refer to the same object in the pool
        System.out.println(s1 == s3);  // false, str3 is a new object in the heap
        System.out.println(s1.equals(s3)); // true, because the content is the same
        // Practice
        String name = "Sonal";
        String name2 = "Sonal Patel";
        //1. charAt()
        System.out.println(name.charAt(2));
        //2.concat()
        System.out.println(name.concat(" Kapoor"));
       // 3. contains()
        System.out.println(name.contains("Sonal"));
      // 4.  equals()
        System.out.println(name.equals("Sonal"));
        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));
        // 6. indexOf()
        System.out.println(name.indexOf('S'));
        // 7. length()
        System.out.println(name.length());
        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));
        // 9. split()
        String mail = "aakash12@gmail.com";
        String[] split = mail.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        // 10. substring( , )
        System.out.println(name.substring(0, 3)); //substring= n-1
        //11. toLowerCase()
        System.out.println(name.toLowerCase());
        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());
        // 14. startsWith()
        System.out.println(name.startsWith("S"));
        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 17. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());
        // 18. compareTo()
        System.out.println(name.compareTo("Sonal"));
        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("sonal"));

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("a"));
        // 21. repeat()
        System.out.println(name.repeat(2));

        StringBuilder stringBuilder = new StringBuilder("Hi");
        stringBuilder.append("patel");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());
        String s5 = "Hello";
        String s6 = " World!";
        String s7 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s7); // Output: Hello World!
        System.out.println(s5);
    }
}
