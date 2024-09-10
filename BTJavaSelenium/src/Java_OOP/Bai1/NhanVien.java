package Java_OOP.Bai1;

public class NhanVien {
    public String MSNV;
    public String Name;
    public int age;
    public String phone;
    public String address;

    public NhanVien(String MSNV, String name, int age, String phone, String address) {
        this.MSNV = MSNV;
        Name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("MSNV: "+MSNV);
        System.out.println("Name: "+Name);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("address: "+address);
    }
}
