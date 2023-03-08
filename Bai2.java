package bai2;

public class Bai2 {

    public abstract class SVPL {

        private String hoTen;
        private String nganh;

        public SVPL(String hoTen, String nganh) {
            this.hoTen = hoTen;
            this.nganh = nganh;
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getNganh() {
            return nganh;
        }

        abstract double getDiem();

        public String getHocLuc();
        String hocluc = null;
        double Diem = getDiem();
        if (Diem >= 9){
        hocluc = "Xuat sac";
        }
        else if (Diem >= 7.5){
        hocluc = "Gioi";
        }
        else if (Diem >= 6.5){
        hocluc = "Kha";
        }
        else if (Diem >= 5){
        hocluc = "Trung Binh";
        }
        else hocluc  = "Yeu";
    }
    return hocluc ;
}
