public class Person {
    String FIO;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Person(String FIO, String position, String email, String phone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    void over40() {
        System.out.println(FIO + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

//    System.out.println
}
