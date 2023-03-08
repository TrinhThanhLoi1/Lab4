package bai1;

public class Bai1 {

    public class ChuNhat {

        protected double rong;
        protected double dai;

        public ChuNhat(double rong, double dai) {
            this.rong = rong;
            this.dai = dai;
        }

        public double getChuVi() {
            return (dai + rong) * 2;

        }

        public double getDienTich() {
            return (dai * rong);
        }

        public void xuat() {
            System.out.println("Dien tich la : " + getDienTich());
            System.out.println("Dien tich la : " + getChuVi());
        }
    }

    public class Vuong extends ChuNhat {

        public Vuong(double canh) {
            super(canh, canh);
            double rong = canh;
        }

        public void xuat() {
            System.out.println("Dien tich la : " + getDienTich());
            System.out.println("Dien tich la : " + getChuVi());

        }
    }

    public class main {

        public static void main(String[] args) {
            ChuNhat cn1 = new ChuNhat(5, 8);
            cn1.xuat();
            Vuong hv1 = new Vuong(8);
            hv1.xuat();
            Vuong hv2 = new Vuong(8);
            hv2.xuat();
            System.out.println();
        }
    }
}
