public class Technical extends Staff{
    private String skills;

    public Technical(int staffId, String name, String phone, double salary, String skills) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.skills = skills;

    }

    public String getSkills() {
        return skills;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Skills: + " + this.getSkills());
    }
}
