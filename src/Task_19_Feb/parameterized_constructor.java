package Task_19_Feb;

public class parameterized_constructor {

        String name;

        parameterized_constructor(String name) {
            this.name= name;
        }

        public static void main(String[] args) {
             parameterized_constructor parameterized = new  parameterized_constructor("Example");
            System.out.println(parameterized.name);
        }
    }

