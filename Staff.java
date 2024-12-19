public class Staff {
    protected int staffId;
    protected String name;
    protected String phone;
    protected double salary;

    public Staff(){

    }

    public Staff(int staffId, String name, String phone, double salary){
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getStaffId() {
        return staffId;
    }

    public void displayInfo(){
        System.out.println("Name : " + this.getName());
        System.out.println("Staff Id : " + this.getStaffId());
        System.out.println("Phone : " + this.getPhone());
        System.out.println("Salary : " + this.getSalary());
    }
}
