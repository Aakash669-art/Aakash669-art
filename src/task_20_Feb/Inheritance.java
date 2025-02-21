package task_20_Feb;

public class Inheritance {

    public static void main(String[] args) {
        father Son = new son();
        Son.display();

    }

    static class father {

        void display() {
            System.out.println("Father have 1 crore");
        }
    }

}

class son extends Inheritance.father {
    @Override
    void display() {
        System.out.println("have 1 crore also 3bhk");
    }
}
