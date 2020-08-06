public class Watch {
    /**
     *定义一个手表Watch类，一个设置时间的方法，一个显示时间的方法
     */
        int hour;
        int minute;
        int second;
    public void setup(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void display(){
        System.out.println("时间为:"+hour+minute+second);
    }


}
