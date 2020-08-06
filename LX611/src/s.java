
        class Father {
            int i = 1;
            public int done() {
                return fun();
            }
            private int fun() {
                return i;
            }
        }
        class Son extends Father {
            int i = 9;
            public int fun() {
                return i;
            }
        }
        public class s {
            public static void main(String[] args) {
                Father f = new Son();
                System.out.println(f.done());
            }
        }

//        String s="12354";
//        String a=str(s);
//        System.out.println(s);
//        char[] chars = s.toCharArray();
//        char[] chars1={'1','2','5','6'};
//        String s1 = chars.toString();
//        char d='a';
//        System.out.println(d);

