package labtuan4;
import java.util.Scanner;
 class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;
    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }
    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma hang: ");
        String maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        String tenHang = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        long donGia = scanner.nextLong();

        System.out.print("Nhap thoi gian bao hanh: ");
        thoiGianBaoHanh = scanner.nextInt();
        System.out.print("Nhap dien ap: ");
        dienAp = scanner.nextInt();
        System.out.print("Nhap cong suat: ");
        congSuat = scanner.nextInt();

        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
    }
    public void xuat() {
        System.out.println("Ma hang: " + getMaHang());
        System.out.println("Ten hang: " + getTenHang());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh + " thang");
        System.out.println("Dien ap: " + dienAp + " V");
        System.out.println("Cong suat: " + congSuat + " W");
    }
   }
