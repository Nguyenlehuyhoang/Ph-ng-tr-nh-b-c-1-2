
package phuong.trinh.bac.pkg1;

import java.util.Scanner;


public class PhuongTrinhBac1 {


    public static void main(String[] args) {
        //1.Khai báo
        double a,b;
        Scanner s = new Scanner(System.in);
        //2.Nhập a,b
        System.out.println("Nhap vao a = ");
        // Lấy giá trị a từ người dùng dán vào biến a
        a = s.nextDouble();
        System.out.println("Nhap vao b = ");
        // Lấy giá trị b từ người dùng dán vào biến b
        b = s.nextDouble();
        //3.Tính toán nghiệm của  pt bậc 1
        if (a == 0) {
            if (b == 0){
                //Trường hợp a = 0 và b = 0: phương trình có vô số nghiệm
                System.out.println("phuong trinh  vo so nghiem: ");
            }else{
                // Trường hợp a = 0 nhưng b khác 0: phương trình vô nghiệm
                System.out.println("Phuong trinh vo nghiem: ");
            }
        }else{
            // Trường hợp a khác 0: tính nghiệm x = -b / a
            double x = -b/a;
            // In kết quả nghiệm x
            System.out.println("x = " + x);
        }
        
        // TODO code application logic here
    }
    
}
