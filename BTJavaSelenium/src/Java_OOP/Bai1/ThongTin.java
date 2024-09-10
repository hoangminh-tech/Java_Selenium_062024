package Java_OOP.Bai1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 =new NhanVien("NV01","Minh", 12,"0909123548","123 ABC");
        NhanVien nv2 =new NhanVien("NV02","Minh1", 23,"0909123448","123 ABC");
        NhanVien nv3 =new NhanVien("NV03","Minh2", 24,"0905123548","123 A4BC");
        nv1.showInfo();
        System.out.println("===========================");
        nv2.showInfo();
        System.out.println("===========================");
        nv3.showInfo();
    }
}
