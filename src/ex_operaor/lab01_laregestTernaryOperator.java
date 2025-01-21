package ex_operaor;

public class lab01_laregestTernaryOperator {

    public static void main (String[] args) {
        int a = 20 , b = 40 ,  c= 10;
        int largest =(a>=b)? ((a>c)? a:c):(b>=c)? b:c;
    System.out.println("Largeest number"+ largest);


    }
}
