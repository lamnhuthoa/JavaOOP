import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanSu {

	public static void main(String[] args) {
		
		
		
		//1. Nhập thông tin công ty
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. Nhập thông tin công ty-------------------------------------");
		System.out.println("--------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên công ty: ");
		String tenCongty = scanner.next();
		System.out.print("Mã số thuế: ");
		String maSoThue = scanner.next();
		System.out.print("Doanh thu tháng: ");
		int doanhThuThang = scanner.nextInt();

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. Xuất thông tin công ty-------------------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Công ty: " + tenCongty);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu tháng: " + doanhThuThang);
		
		NhanVienThuong nhanVienThuong1 = new NhanVienThuong("123","Nhan Vien A","0956474348",120,100,"Truong Phong A");
		NhanVienThuong nhanVienThuong2 = new NhanVienThuong("234","Nhan Vien B","0956474311",254,100,"Truong Phong A");
		NhanVienThuong nhanVienThuong3 = new NhanVienThuong("345","Nhan Vien C","0956474342",122,100,"Truong Phong B");
		
		TruongPhong truongPhong1 = new TruongPhong("321","Truong Phong A","0956423443",120,200,2);
		TruongPhong truongPhong2 = new TruongPhong("534","Truong Phong B","0923474348",120,200,1);
		
		GiamDoc giamDoc1 = new GiamDoc("978","Giam Doc A","0956423443",400,200,75);
		GiamDoc giamDoc2 = new GiamDoc("876","Giam Doc B","0956423443",300,200,60);
		
		
		
		//4. Xuất thông tin toàn bộ người trong công ty
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("4.Xuất thông tin toàn bộ người trong công ty------------------");
		System.out.println("--------------------------------------------------------------");
		xuatThongTinNhanVienThuong(nhanVienThuong1);
		xuatThongTinNhanVienThuong(nhanVienThuong2);
		xuatThongTinNhanVienThuong(nhanVienThuong3);
		
		xuatThongTinTruongPhong(truongPhong1);
		xuatThongTinTruongPhong(truongPhong2);
		
		xuatThongTinGiamDoc(giamDoc1);
		xuatThongTinGiamDoc(giamDoc2);

		
		
		//5. Tính và xuất tổng lương cho toàn công ty
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("5.Tính và xuất tổng lương cho toàn công ty--------------------");
		System.out.println("--------------------------------------------------------------");
		int tongLuongNhanVienThuong = nhanVienThuong1.tinhLuongThang() + nhanVienThuong2.tinhLuongThang() + nhanVienThuong3.tinhLuongThang();
		int tongLuongTruongPhong = truongPhong1.tinhLuongThang() + truongPhong2.tinhLuongThang();
		int tongLuongGiamDoc = giamDoc1.tinhLuongThang() + giamDoc2.tinhLuongThang();
		int tongLuongToanCongTy = tongLuongNhanVienThuong + tongLuongTruongPhong + tongLuongGiamDoc;
		System.out.println("Tổng lương công ty: " + tongLuongToanCongTy);

		
		
		//6. Tìm nhân viên thường có lương cao nhất
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("6.Tìm nhân viên thường có lương cao nhất----------------------");
		System.out.println("--------------------------------------------------------------");
		ArrayList<Integer> luongNhanVienThuong = new ArrayList<Integer>();
		luongNhanVienThuong.add(nhanVienThuong1.tinhLuongThang());
		luongNhanVienThuong.add(nhanVienThuong2.tinhLuongThang());
		luongNhanVienThuong.add(nhanVienThuong3.tinhLuongThang());
		
		int max = luongNhanVienThuong.get(0);
		for(int i = 0; i < luongNhanVienThuong.size(); i++) {
			if(max < luongNhanVienThuong.get(i)) {
				max = luongNhanVienThuong.get(i);
			}
		}
		
		String nhanVienLuongCao;
		if(max == nhanVienThuong1.tinhLuongThang()) {
			nhanVienLuongCao = "Nhân viên 1";
		} else if (max == nhanVienThuong2.tinhLuongThang()){
			nhanVienLuongCao = "Nhân viên 2";
		} else {
			nhanVienLuongCao = "Nhân viên 3";
		}
		
		System.out.println("Nhân viên thường có lương cao nhất: " + nhanVienLuongCao);
		
		

		//7. Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("7.Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất----");
		System.out.println("--------------------------------------------------------------");
		
		ArrayList<Integer> soNhanVienDuoiQuyenTruongPhong = new ArrayList<Integer>();
		soNhanVienDuoiQuyenTruongPhong.add(truongPhong1.getSoLuongNhanVienDuoiQuyen());
		soNhanVienDuoiQuyenTruongPhong.add(truongPhong2.getSoLuongNhanVienDuoiQuyen());
		int soNVNhieuNhat = soNhanVienDuoiQuyenTruongPhong.get(0);
		for(int index = 0; index < soNhanVienDuoiQuyenTruongPhong.size(); index++) {
			if(soNVNhieuNhat < soNhanVienDuoiQuyenTruongPhong.get(index)) {
				soNVNhieuNhat = soNhanVienDuoiQuyenTruongPhong.get(index);
			}
		}
		
		String truongPhong;
		if(soNVNhieuNhat == truongPhong1.getSoLuongNhanVienDuoiQuyen()) {
			truongPhong = "Trưởng phòng 1";
		} else {
			truongPhong = "Trưởng phòng 2";
		}
		
		System.out.println("Trưởng phòng có số nhân viên dưới quyền nhiều nhất: " + truongPhong);
		
		//9.Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("9.Tìm giám đốc có số lượng cổ phần nhiều nhất-----------------");
		System.out.println("--------------------------------------------------------------");
		List<Integer> luongNhanVienArray = new ArrayList<Integer>();
		luongNhanVienArray.add(nhanVienThuong1.tinhLuongThang());
		luongNhanVienArray.add(nhanVienThuong2.tinhLuongThang());
		luongNhanVienArray.add(nhanVienThuong3.tinhLuongThang());
		luongNhanVienArray.add(truongPhong1.tinhLuongThang());
		luongNhanVienArray.add(truongPhong2.tinhLuongThang());
		luongNhanVienArray.add(giamDoc1.tinhLuongThang());
		luongNhanVienArray.add(giamDoc2.tinhLuongThang());
		
		List<Integer> arrays = Arrays.asList(luongNhanVienArray.toArray(new Integer[0]));
        arrays.sort(Comparator.comparingInt(o -> (int) o).reversed());
		System.out.println("Lương nhân viên sắp xếp theo chiều giảm dần: " + arrays);
		
		
		
		//10. Tìm giám đốc có số lượng cổ phần nhiều nhất
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("10.Tìm giám đốc có số lượng cổ phần nhiều nhất----------------");
		System.out.println("--------------------------------------------------------------");
		ArrayList<Integer> giamDocArray = new ArrayList<Integer>();
		giamDocArray.add(giamDoc1.getPhanTramCoPhan());
		giamDocArray.add(giamDoc1.getPhanTramCoPhan());
		
		int giamDocCoPhanMax = giamDocArray.get(0);
		for(int j = 0; j < giamDocArray.size(); j++) {
			if(giamDocCoPhanMax < giamDocArray.get(j)) {
				giamDocCoPhanMax = giamDocArray.get(j);
			}
		}
		
		String giamDoc;
		if(giamDocCoPhanMax == giamDoc1.getPhanTramCoPhan()) {
			giamDoc = "Giám đốc 1";
		} else {
			giamDoc = "Giám đốc 2";
		}
		
		System.out.println("Trưởng phòng có số nhân viên dưới quyền nhiều nhất: " + giamDoc);
		
		
		
		//11. Tính và xuất tổng thu nhập của từng giám đốc
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("11.Tính và xuất tổng thu nhập của từng giám đốc---------------");
		System.out.println("--------------------------------------------------------------");
		int loiNhuanCongTy = doanhThuThang - tongLuongToanCongTy;
		
		int soCoPhanGiamDoc1 = giamDoc1.getPhanTramCoPhan();
		int soCoPhanGiamDoc2 = giamDoc2.getPhanTramCoPhan();
		
		double luongGiamDoc1 = giamDoc1.tinhLuongThang() + (soCoPhanGiamDoc1/100)*loiNhuanCongTy;
		double luongGiamDoc2 = giamDoc2.tinhLuongThang() + (soCoPhanGiamDoc2/100)*loiNhuanCongTy;
		
		System.out.println("Lương giám đốc 1: " + luongGiamDoc1 + "\nLương giám đốc 2: " + luongGiamDoc2);
	}	
	
	
	//Khai báo function để in thông tin toàn nhân viên
	public static void xuatThongTinNhanVienThuong(NhanVienThuong nhanVienThuong) {
		System.out.println("Họ tên: " + nhanVienThuong.hoTen + "| Mã số nhân viên: " + nhanVienThuong.maSo + "| Số điện thoại: " + nhanVienThuong.soDienThoai + "| Số ngày làm việc: " + nhanVienThuong.soNgayLamViec + "| Lương một ngày: " + nhanVienThuong.luongMotNgay + "| Trưởnng phòng quản lý: " + nhanVienThuong.getTruongPhongQuanLy());
	}
	
	public static void xuatThongTinTruongPhong(TruongPhong truongPhong) {
		System.out.println("Họ tên: " + truongPhong.hoTen + "| Mã số nhân viên: " + truongPhong.maSo + "| Số điện thoại: " + truongPhong.soDienThoai + "| Số ngày làm việc: " + truongPhong.soNgayLamViec + "| Lương một ngày: " + truongPhong.luongMotNgay + "| Số nhân viên dưới quyền: " + truongPhong.getSoLuongNhanVienDuoiQuyen());
	}
	
	public static void xuatThongTinGiamDoc(GiamDoc giamDoc) {
		System.out.println("Họ tên: " + giamDoc.hoTen + "| Mã số nhân viên: " + giamDoc.maSo + "| Số điện thoại: " + giamDoc.soDienThoai + "| Số ngày làm việc: " + giamDoc.soNgayLamViec + "| Lương một ngày: " + giamDoc.luongMotNgay + "| Số cổ phần: " + giamDoc.getPhanTramCoPhan());
	}
}
