public class Student {
    private String usn;
    private String name;
    private String branch;
    private String phone;
    private double percentage;

    public Student(String usn, String name, String branch, String phone, double percentage){
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
        this.percentage = percentage;
    }

    public String getUsn(){
        return usn;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getPhone() {
        return phone;
    }

    public double getPercentage() {
        return percentage;
    }
}
