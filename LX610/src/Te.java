public class Te {
    public static void main(String[] args) {

        String s = new String("ahello");
        //返回char值
        char c = s.charAt(4);//索引
        System.out.println(c);

        char[] ccc={'中','国','4'};
        String str=new String(ccc);
        System.out.println(str);

        String s2 = "aHELLO";
//        int i = s.compareTo(s2);  //比较字符的ASCII值
        int i = s.compareToIgnoreCase(s2);  //比较字符的ASCII值
        System.out.println(i);

//        String concat = s.concat(s2);
        String concat = s + s2;//concat=连接字符串
        System.out.println(concat);

        String s3 = "hello";
//        boolean contains = s.contains(s2);
        boolean contains = s.contains(s3);//contains是否包含
        System.out.println(contains);

        String fileName = "听妈妈的话.mp4";
        boolean b = fileName.endsWith(".mp4");//endsWith判断是否以给定的字符串结束结尾字符串字段由这个值结尾
        if(b){
            System.out.println("是音乐文件");
        }

        //字符串的比较，不能用==，要用equals()
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        // == 比较的是地址
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        // equals比较的是内容
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


        // hashcode 哈希值（随机数）
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s.hashCode());

        String imgName = "angle-baby.img";

        String phone = "124454435";
        int i1 = imgName.lastIndexOf(".");
//        String ext = imgName.substring(i1);
        String ext = imgName.substring(i1);
        imgName = phone + ext;
        System.out.println(imgName);

        //length()方法 求字符串长度     数组的大小 length 属性

        //toCharArray()   String ---> char[]
        //    char[] ---> String   new String(char[] c)
        System.out.println("-------------------");

        String ss = "hello";
        char[] chars = ss.toCharArray();
        for(char cc : chars) {
            System.out.print(cc);
        }

        String strs = "23dfgas56745KL-!@";

        String s1 = s.toUpperCase();
        System.out.println(s1);

        String s4 = s2.toLowerCase();
        System.out.println(s4);

        System.out.println("------------");
        //trim()
        String name = " je ff ";
        System.out.println(name.length());

        String sn = name.trim();
        System.out.println(sn.length());;



    }
}
