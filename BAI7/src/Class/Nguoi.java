package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // thuộc tính
    protected String hoTen_123;
    protected Date ngaySinh_123;
    protected String queQuan_123;

    // phương thức
    // hàm khởi tạo không đối số
    public Nguoi() {
    }

    // hàm khởi tạo có đối số
    public Nguoi(String hoTen_123, Date ngaySinh_123, String queQuan_123) {
        this.hoTen_123 = hoTen_123;
        this.ngaySinh_123 = ngaySinh_123;
        this.queQuan_123 = queQuan_123;
    }

    // hàm nhập vào thông tin
    public void nhapThongTin(Scanner sc_123) {
        System.out.print("\tNhập họ tên: ");
        hoTen_123 = sc_123.nextLine();

        System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
        String strDate_123 = sc_123.nextLine();
        ngaySinh_123 = strToDate_123(strDate_123);

        System.out.print("\tNhập quê quán: ");
        queQuan_123 = sc_123.nextLine();
    }

    private Date strToDate_123(String strDate_123) {
        Date date_123 = null;
        SimpleDateFormat sdf_123 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date_123 = sdf_123.parse(strDate_123);
        } catch (ParseException e_123) {
            System.out.println("Lỗi định dạng ngày tháng!");
        }
        return date_123;
    }

    // hàm hiển thị
    public void hienThiThongTin() {
        SimpleDateFormat sdf_123 = new SimpleDateFormat("dd-MM-yyyy");
        String ngaySinhFormatted_123 = (ngaySinh_123 != null) ? sdf_123.format(ngaySinh_123) : "Không hợp lệ";

        System.out.println("\tHọ tên: " + hoTen_123);
        System.out.println("\tNgày sinh: " + ngaySinhFormatted_123);
        System.out.println("\tQuê quán: " + queQuan_123);
    }

    // hàm lấy ra quê quán
    public String getQueQuan() {
        return queQuan_123;
    }

    // hàm lấy ra thông tin về ngày sinh
    public Date getNgaySinh() {
        return ngaySinh_123;
    }
}
