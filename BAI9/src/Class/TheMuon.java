package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuộc tính
	private int soMuon_116;
	private Date ngayMuon_116;
	private Date hanTra_116;
	private String soHieu_116;

	// phương thức
	// hàm khởi tạo không đối số
	public TheMuon() {
	}

	// hàm khởi tạo có đối số
	public TheMuon(int soMuon_116, Date ngayMuon_116, String soHieu_116) {
		this.soMuon_116 = soMuon_116;
		this.ngayMuon_116 = ngayMuon_116;
		this.soHieu_116 = soHieu_116;
	}

	// hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);

		System.out.print("\tNhập số mượn: ");
		soMuon_116 = sc_116.nextInt();
		sc_116.nextLine();

		System.out.print("\tNhập ngày mượn: ");
		String strNgayMuon_116 = sc_116.nextLine();
		ngayMuon_116 = strToDate_116(strNgayMuon_116);

		String strNgayTra_116 = "31-12-2020";
		hanTra_116 = strToDate_116(strNgayTra_116);

		System.out.print("\tNhập số hiệu: ");
		soHieu_116 = sc_116.nextLine();
	}

	private Date strToDate_116(String strNgayMuon_116) {
		Date date_116 = null;

		SimpleDateFormat sdf_116 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_116 = sdf_116.parse(strNgayMuon_116);
		} catch (ParseException e_116) {
			System.out.println("Lỗi định dạng ngày tháng!");
		}

		return date_116;
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		super.hienThiThongTin();

		// Create a SimpleDateFormat object to format the output date
		SimpleDateFormat sdf_display = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("\tSố phiếu mượn: " + soMuon_116);
		// Format the ngayMuon_116 date before printing
		System.out.println("\tNgày mượn: " + sdf_display.format(ngayMuon_116));
		// Format the hanTra_116 date before printing
		System.out.println("\tHạn trả: " + sdf_display.format(hanTra_116));
		System.out.println("\tSố hiệu: " + soHieu_116);
	}

	// hàm lấy ra thông tin về hạn trả
	public Date getHanTra() {
		return hanTra_116;
	}
}