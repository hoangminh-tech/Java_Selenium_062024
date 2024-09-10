package Java_OOP.Bai2.Person;

public class Person {
    public String MSNV;
    public String Name;
    public String gender;
    public int age;
    protected String phone;
    protected String address;

    public Person(String MSNV, String name,String gender, int age, String phone, String address) {
        this.MSNV = MSNV;
        Name = name;
        this.gender=gender;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getMSNV() {
        return MSNV;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    protected String getPhone() {
        return phone;
    }

    protected String getAddress() {
        return address;
    }

//    public void showdata(){
//        System.out.println("MSNV: "+MSNV);
//        System.out.println("Name: "+Name);
//        System.out.println("Gender: "+gender);
//        System.out.println("age: "+age);
//        System.out.println("phone: "+phone);
//        System.out.println("address: "+address);
//    }
}
