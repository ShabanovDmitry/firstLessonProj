public class Lesson5 {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[1] = new Person("Suvorov Pavel", "Programmer", "suvpavel@mailbox.com", "892315622", 50000, 38);
        persArray[2] = new Person("Sidorov Vitaly", "Locksmith", "sidvitaly@mailbox.com", "892512332", 25000, 47);
        persArray[3] = new Person("kuznetsov Grigory", "Marketer", "kuzgrigory@mailbox.com", "892012372", 35000, 30);
        persArray[4] = new Person("Kolovrat Victor", "Driller", "kolvictor@mailbox.com", "892344372", 24000, 29);
        for (int j = 0; j < 5; j++) {
            if (persArray[j].getAge() > 40) {
                persArray[j].over40();
            }
        }
    }

}
