package task_20_Feb;

public class Encapsulation {
    public static void main(String[] args) {
        SBI sbi = new SBI("Aakash", 100000);
        System.out.println(sbi.getAmount());
        System.out.println(sbi.getName());
    }
}
class SBI {
    private String name;
    private int amount;

    public SBI(String name, int amount) {

        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}