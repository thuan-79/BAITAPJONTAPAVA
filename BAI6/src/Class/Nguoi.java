package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // Thuộc tính
    protected String hoTen_123;
    protected Date ngaySinh_123;
    protected String CMND_123;

    // Phương thức
    // Hàm khởi tạo không đối số
    public Nguoi() {
    }

    // Hàm khởi tạo có đối số 1
    public Nguoi(String hoTen_123, Date ngaySinh_123, String CMND_123) {
        this.hoTen_123 = hoTen_123;
        this.ngaySinh_123 = ngaySinh_123;
        this.CMND_123 = CMND_123;
    }

    // Hàm khởi tạo có đối số 2
    public Nguoi(String hoTen_123, String CMND_123) {
        this.hoTen_123 = hoTen_123;
        this.CMND_123 = CMND_123;
        this.ngaySinh_123 = null; // Khởi tạo ngày sinh là null
    }

    // Hàm nhập
    public void nhapThongTin(Scanner sc_123) {
        System.out.print("\tNhập họ tên: ");
        hoTen_123 = sc_123.nextLine();
        
        // Vòng lặp để đảm bảo nhập đúng định dạng ngày
        while (true) {
            System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
            String strDate_123 = sc_123.nextLine();
            ngaySinh_123 = strToDate_123(strDate_123);
            if (ngaySinh_123 != null) {
                break;
            }
        }

        System.out.print("\tNhập CMND: ");
        CMND_123 = sc_123.nextLine();
    }

    private Date strToDate_123(String strDate_123) {
        Date date_123 = null;
        SimpleDateFormat sdf_123 = new SimpleDateFormat("dd-MM-yyyy");
        sdf_123.setLenient(false);

        try {
            date_123 = sdf_123.parse(strDate_123);
        } catch (ParseException e_123) {
            System.out.println("Lỗi định dạng ngày tháng! Vui lòng nhập lại.");
        }
        return date_123;
    }

    // Hàm hiển thị
    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen_123);
        
        // Định dạng lại ngày sinh để hiển thị
        SimpleDateFormat sdf_123 = new SimpleDateFormat("dd-MM-yyyy");
        String ngaySinhStr_123 = (ngaySinh_123 != null) ? sdf_123.format(ngaySinh_123) : "Không xác định";
        System.out.println("\tNgày sinh: " + ngaySinhStr_123);

        System.out.println("\tCMND: " + CMND_123);
    }

    // Hàm lấy ra thông tin CMND
    public String getCMND() {
        return CMND_123;
    }
}
