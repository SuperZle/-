public class A邮箱 {
    public static void main(String[] args) {
        String s="5@sg.fd.gdbf";
        fun(s);
    }
    public static void fun(String s){
        String s1="^\\w+@[a-zA-Z]+(\\.[a-zA-Z]{1,})+$";
        //        String s1="^\\w+@\\w+(\\.[a-zA-Z]{1,})+$";
        boolean matches = s.matches(s1);
        System.out.println(matches);
    }
}
