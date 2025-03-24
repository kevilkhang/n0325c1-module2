package ss2_constructor_time;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    ThoiGian(){
    }

    ThoiGian(int gio) {
        this.gio = gio;
        phut = 0;
        giay = 0;
    }

    ThoiGian(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }

    ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    void  output() {
        System.out.printf("%d:%d:%d",this.gio,this.phut,this.giay);
    }
}