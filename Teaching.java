public class Teaching extends Staff {
    private String domain;
    private int publications;

    public Teaching(int staffId, String name, String phone, double salary, String domain, int publications) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.domain = domain;
        this.publications = publications;

    }

    public String getDomain() {
        return domain;
    }

    public int getPublications() {
        return publications;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Domain: " + this.getDomain());
        System.out.println(("Publications: " + this.getPublications()));
    }

}
