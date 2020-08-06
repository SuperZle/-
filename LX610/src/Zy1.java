public class Zy1 {
    /**
     * String s = “2019-09-05 13:40:45”;  ----> “20190905134045
     */
    public static void main(String[] args) {
        String s = "2019-09-05 13:40:45";
        String s1 = s.replaceAll("[\\D]","");
        System.out.println(s1);
        /*char[] c = s.toCharArray();
        for (int i = 0; i < c.length ; i++) {
            if (c[i]>=48 && c[i]<=57){
                char[] j={c[i]};
                String s1=new String(j);
                System.out.print(s1);
            }
        }*/
    }
}

