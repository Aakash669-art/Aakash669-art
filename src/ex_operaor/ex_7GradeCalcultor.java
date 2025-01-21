package ex_operaor;

public class ex_7GradeCalcultor {
    public static void main(String[] args) {
        int a = 77;

        String Grade = (a >= 90 && a <= 100) ? "A" :
                (a >= 80 && a <= 89) ? "B" :
                        (a >= 70 && a <= 79) ? "C" :
                                (a >=60 && a <= 69) ? "D" :
                                        (a >= 50 && a <= 59) ? "F":
                                                "Invalid value";
        System.out.println(Grade);

    }

}
