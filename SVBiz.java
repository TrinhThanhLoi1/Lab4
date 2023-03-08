package bai2;

public class SVBiz extends SVPL {

    protected double diemMarketting;
    protected double diemSales;

    public SVBiz(String hoTen, String nganh, double diemMarketting, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2 * diemMarketting + diemSales) / 3;
    }
}
