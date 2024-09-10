package Java_OOP.Bai2.Person;

public class information {
    public static void main(String[] args) {
        Person person = new Person("NV01", "Minh", "Nam", 12, "0909123548", "123 ABC");
        System.out.println(person.getMSNV());
        System.out.println(person.getName());
        System.out.println(person.getGender());
        System.out.println(person.getAge());
        System.out.println(person.getPhone());
        System.out.println(person.getAddress());
    }

}
