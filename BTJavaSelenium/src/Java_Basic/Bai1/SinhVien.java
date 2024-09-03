package Java_Basic.Bai1;

public class SinhVien {
    public String Name = "Hoang Minh";
    public static int age = 35;

    public SinhVien() {
    }

    public void Class() {
        String Lop = "Lớp 12";
        System.out.println(Lop);
    }

    public static void main(String[] args) {
        System.out.println(age);
        SinhVien SV = new SinhVien();
        System.out.println(SV.Name);
        SV.Class();
        ThongTin.TenTruong();
    }
}
