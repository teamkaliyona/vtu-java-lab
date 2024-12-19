public class StaffDemo {
    public static void main(String[] args) {
        Teaching t1 = new Teaching(1, "Ankita", "823462342", 50000, "Computers", 15);
        Teaching t2 = new Teaching(2, "Angad", "54242343", 40000, "Electronics", 10);
        Teaching t3 = new Teaching(3, "Rahul", "6856546", 30000, "AI", 20);

        Technical te1 = new Technical(4, "Bob", "34232430", 10000, "Java");
        Technical te2 = new Technical(5, "Kavita", "567567567", 20000, "Angular");
        Technical te3 = new Technical(6, "Hari", "45645645", 60000, "Python");

        Contract c1 = new Contract(7, "Manu", "896657565", 40000, 4);
        Contract c2 = new Contract(8, "Nayana", "97768786786", 20000, 7);
        Contract c3 = new Contract(9, "Pravit", "867567675", 50000, 1);
        System.out.println("Teaching Staff 1: ");
        t1.displayInfo();
        System.out.println("Teaching Staff 2: ");
        t2.displayInfo();
        System.out.println("Teaching Staff 3: ");
        t3.displayInfo();
        System.out.println("Technical Staff 1: ");
        te1.displayInfo();
        System.out.println("Technical Staff 2: ");
        te2.displayInfo();
        System.out.println("Technical Staff 3: ");
        te3.displayInfo();
        System.out.println("Contract Staff 1: ");
        c1.displayInfo();
        System.out.println("Contract Staff 2: ");
        c2.displayInfo();
        System.out.println("Contract Staff 3: ");
        c3.displayInfo();
    }
}
