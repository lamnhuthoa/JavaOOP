
public class GiamDoc extends NhanVien implements ActionTinhLuongThangimp {
	private int phanTramCoPhan;
	
	public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, int luongMotNgay, int phanTramCoPhan) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
		this.phanTramCoPhan = phanTramCoPhan;
	}
	
	@Override
	public int tinhLuongThang() {
		return 300 * soNgayLamViec;
	}

	public int getPhanTramCoPhan() {
		return phanTramCoPhan;
	}

	public void setPhanTramCoPhan(int phanTramCoPhan) {
		this.phanTramCoPhan = phanTramCoPhan;
	}
} 
