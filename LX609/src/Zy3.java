public class Zy3 {
    /**
     * 打印一个九九乘法口诀表
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }System.out.println();
        }
    }
}
