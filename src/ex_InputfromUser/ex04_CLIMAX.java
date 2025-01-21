package ex_InputfromUser;

public class ex04_CLIMAX {
    public static void main (String[] args) {

        String a_string = args[0];
        int a = Integer.parseInt(a_string);

        String b_string = args[1];
        int b = Integer.parseInt(b_string);

        int result = (a > b) ? a:b;
        System.out.println(result);

    }
}