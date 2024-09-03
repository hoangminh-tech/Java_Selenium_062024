package Java_Basic.Bai5;

import java.util.ArrayList;

public class JavaBasic5 {
    public void Employee(){
        ArrayList<String> employee = new ArrayList<>();

        employee.add("Dang Hoang Minh");
        employee.add("Sài Gòn");
        employee.add("25 tuổi");
        employee.add("Độc thân");

        //Duyệt Mảng employee
        for (int i =0; i<employee.size(); i++){
            System.out.println(employee.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i<=50; i+=2)
        {

            if(i%2==0){
                list.add(i);
            }
        }
        //Duyệt mảng i
        for (int i:list)
        {
            System.out.println(i+"\t");
        }

        JavaBasic5 Bai5 = new JavaBasic5();
        Bai5.Employee();

    }
}
