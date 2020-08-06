package BooKGuanLi;

public class Customer extends Library{
    //1.查询全部图书     2.加入购物车   3.查看购物车     4.结账      5.退出"
    public void choice1(int i){
        switch (i){
            case 1:{
                look();
                break;
            }
            case 2:{
                //in(String num);
                break;
            }
            case 3:{

                loolIn();
                break;
            }
            case 4:{

                closing();
                break;
            }
            case 5:{
                System.out.println("期待下次相遇");
                break;
            }
            default:
                System.out.println("请重新输入");
        }
    }

//    public void in(get,int i){
//        System.out.println("您已添加"+);
//    }

    public void loolIn(){}

    public void closing(){}

}
