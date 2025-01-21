package ex_InputfromUser;

public class ex_CLI {

    public static void main (String[] args) {

        String name_string  = args[0];
        System.out.println(name_string);

        String age_string = args[1];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

        String salary_string = args[2];
        int salary = Integer.parseInt(salary_string);
        System.out.println(salary);

    }
}
