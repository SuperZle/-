package DaYin;

public class TestPrint {
    public static void main(String[] args) {
        //创建黑白打印机
        //HeiBaiPrint heiBaiPrint = new HeiBaiPrint();
        HeiBaiPrint heiBaiPrint = new HeiBaiPrint("三星",0.5,"15C");

//        heiBaiPrint.setName("三星");
//        heiBaiPrint.setMomey(0.5);
//        heiBaiPrint.setCopy("15C");
        //创建彩色打印机
        //CaiSePrint caiSePrint = new CaiSePrint();
        CaiSePrint caiSePrint = new CaiSePrint("小米",2.5,"30C");

//        caiSePrint.setName("小米");
//        caiSePrint.setMomey(2.5);
//        caiSePrint.setImg("30C");
        //创建3D打印机
//        ThPrint thPrint = new ThPrint();
        ThPrint thPrint = new ThPrint("华为",999999.99,2);
//        thPrint.setName("华为");
//        thPrint.setMomey(999999.99);
//        thPrint.setPr(2);
        //创建一个人
        User r = new User();
        r.choice(heiBaiPrint);
        r.choice(caiSePrint);
        r.choice(thPrint);
    }
}
