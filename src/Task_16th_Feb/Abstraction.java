package Task_16th_Feb;

public class Abstraction {
    public static void main(String[] args) {
        Book mybook = new PrintMyBook("Harry Potter","J.K.Rowling", 120);
        mybook.getdetails();
    }
}
