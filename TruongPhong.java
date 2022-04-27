
public class TruongPhong extends NhanVien implements ActionTinhLuongThangimp {
	private int soLuongNhanVienDuoiQuyen;

	public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, int luongMotNgay, int soLuongNhanVienDuoiQuyen) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
		this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
	}
	
	@Override
	public int tinhLuongThang() {
		return 200 * soNgayLamViec + 100 * soLuongNhanVienDuoiQuyen;	
	}

	public int getSoLuongNhanVienDuoiQuyen() {
		return soLuongNhanVienDuoiQuyen;
	}

	public void setSoLuongNhanVienDuoiQuyen(int soLuongNhanVienDuoiQuyen) {
		this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
	}
}
