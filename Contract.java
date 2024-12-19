public class Contract extends Staff{
    private int period;

    public Contract(int staffId, String name, String phone, double salary, int period) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.period = period;

    }

    public int getPeriod() {
        return period;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Period: " + this.getPeriod());
    }
}
