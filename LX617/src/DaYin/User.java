package DaYin;

public class User {
    public void choice(Print print){
        print.getMomey();
        print.getName();
        if (print instanceof HeiBaiPrint){
            HeiBaiPrint h = (HeiBaiPrint) print;
            h.fun();
            System.out.println(h.getName()+"牌黑白打印机，正在打印"+h.getCopy()+"的，"+h.getMomey()+"元一张");
        }else if (print instanceof CaiSePrint){
            CaiSePrint c =(CaiSePrint)print;
            c.fun();
            System.out.println(c.getName()+"牌黑白打印机，正在打印"+c.getImg()+"的，"+c.getMomey()+"元一张");
        }else if (print instanceof ThPrint){
            ThPrint t = (ThPrint)print;
            t.fun();
            System.out.println(t.getName()+"牌黑白打印机，正在打印"+t.getPr()+"人模，"+t.getMomey()+"元一个");

        }
    }
}
