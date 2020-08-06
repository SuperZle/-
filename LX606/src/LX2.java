public class LX2 {
    /**
     * 2.输入三个整数x,y,z，请把这三个数由小到大输出。
     */
    public static void main(String[] args) {
        Double d=Math.random();
        int x=5;
        int y=6;
        int z=98;
        if (x<y){//x小
            if (x<z){
                if (y<z){
                    System.out.println(x+""+y+""+z);
                }else {
                    System.out.println(x+""+z+""+y);
                }
            }else {//z小
                System.out.println(z+""+x+""+y);
            }
        }else if (y<z){
            if (x<z){
                System.out.println(y+""+x+""+z);
            }else {
                System.out.println(y+""+z+""+x);
            }

        }else{
            System.out.println(z+""+y+""+x);
        }
    }
}
