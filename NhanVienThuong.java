
public class NhanVienThuong extends NhanVien implements ActionTinhLuongThangimp{
	private String truongPhongQuanLy;
	
	public NhanVienThuong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, int luongMotNgay, String truongPhongQuanLy) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
		this.truongPhongQuanLy = truongPhongQuanLy;
	}
	
	@Override
	public int tinhLuongThang() {
		return luongMotNgay * soNgayLamViec;	
	}

	public String getTruongPhongQuanLy() {
		return truongPhongQuanLy;
	}

	public void setTruongPhongQuanLy(String truongPhongQuanLy) {
		this.truongPhongQuanLy = truongPhongQuanLy;
	}
}
