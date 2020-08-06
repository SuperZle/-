public class Text {
        static int i;
        public int aMethod() {
            i++;
            return i;
        }
        int[] a={1,2,3,4,56,6,7};

        public static void main (String args[]) {
            Text test=new Text() ;
            test.aMethod () ;
            System.out.println (test.aMethod()) ;
            int[] a={1,2,3,4,5,6,7};
            System.out.println(a.length);
            byte b=1;
            char c='5';

        }
}

