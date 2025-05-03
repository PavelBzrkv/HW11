public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(891267400, "Nokia", 167);

        phone1.receiveCall("Vasay");

        System.out.println(phone1.country);
        System.out.println(phone2.country);

        phone2.receiveCall("Petya", phone2.phoneNumber);

    }
}
