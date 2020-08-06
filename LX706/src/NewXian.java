/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 11:30
 * current system time
 * 2020
 * current year
 */


public class NewXian extends Thread{
    NewXian(String name){
        super(name);
        //setName(name);
    }

    @Override
    public void run() {

        int a=0;
        try {
            NewXian.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            //System.out.println("++++++++|||||||||"+getName()+"    " +i);
            System.out.println("设置"+Thread.currentThread().getName()+"    "+i);
            if (i==2){
                NewXian2 newXian2=new NewXian2("阿金");
                newXian2.start();
                for (int j = 0; j < 6; j++) {
                    System.out.println("++++++++|||||||||"+newXian2.getName()+"    " +j);
                }
            }
        }
    }
}
