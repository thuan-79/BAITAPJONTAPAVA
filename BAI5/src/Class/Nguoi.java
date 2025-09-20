package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_123;
    private Date ngaySinh_123;
    private String ngheNghiep_123;

    public Nguoi() {}

    public Nguoi(String hoTen_123, Date ngaySinh_123, String ngheNghiep_123) {
        this.hoTen_123 = hoTen_123;
        this.ngaySinh_123 = ngaySinh_123;
        this.ngheNghiep_123 = ngheNghiep_123;
    }

    public void nhapThongTin(Scanner sc_123) {
        System.out.print("\tNhap ho ten: ");
        hoTen_123 = sc_123.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate_123 = sc_123.nextLine();
        ngaySinh_123 = strToDate(strDate_123);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep_123 = sc_123.nextLine();
    }

    private Date strToDate(String strDate_123) {
        SimpleDateFormat sdf_123 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return sdf_123.parse(strDate_123);
        } catch (ParseException e_123) {
            System.out.println("Loi dinh dang ngay thang! Mac dinh la ngay hien tai.");
            return new Date();
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_123);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh_123));
        System.out.println("\tNghe nghiep: " + ngheNghiep_123);
        System.out.println("\tTuoi: " + tinhTuoi());
    }

    private String dateToString(Date date_123) {
        SimpleDateFormat sdf_123 = new SimpleDateFormat("dd-MM-yyyy");
        return sdf_123.format(date_123);
    }

    public int tinhTuoi() {
        Calendar sinh_123 = Calendar.getInstance();
        sinh_123.setTime(ngaySinh_123);
        Calendar now_123 = Calendar.getInstance();
        int tuoi_123 = now_123.get(Calendar.YEAR) - sinh_123.get(Calendar.YEAR);
        if (now_123.get(Calendar.DAY_OF_YEAR) < sinh_123.get(Calendar.DAY_OF_YEAR)) {
            tuoi_123--;
        }
        return tuoi_123;
    }
}
