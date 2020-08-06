import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LxMap1 {
    public static void main(String[] args) {
        /*Map map=new HashMap();
        map.put("NJ","南京");
        map.put("YZ","扬州");
        map.put("SZ","苏州");
        map.put("WX","无锡");
        System.out.println(map);

        Map map1=new HashMap();
        map1.putAll(map);
        System.out.println(map1);

        Set set = map1.keySet();
        System.out.println(set);
        Collection values = map1.values();
        System.out.println(values);

        Set set1 = map1.entrySet();
        System.out.println(set1+"-------------");

        Set set2 = map1.keySet();

        Iterator iterator = set2.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            Object o = map1.get(next);
            System.out.println(next+"----------"+o);
        }
        //就是用for循环通过key值来获取值
        for (Object o:set2) {
            Object o1 = map1.get(o);
            System.out.println(o+"++++++++++++++"+o1);

        }*/

        //一层Map<String,String> map = new HashMap;
        Map<String,Map<String,String>>  schoolMap= new HashMap<>();
        Map<String,String> stu=new HashMap<>();
        stu.put("001","小米");
        stu.put("002","小红");
        schoolMap.put("UI",stu);
        Map<String,String> stu1=new HashMap<>();
        stu1.put("001","小花");
        stu1.put("002","小妞");
        schoolMap.put("JAVA",stu1);
        //获取班级
        Set<String> classname = schoolMap.keySet();
        for (String cName:classname) {
            //Iterator<String> iterator = classname.iterator();
            //获取学生信息        学生的Map
            Map<String, String> stuXin = schoolMap.get(cName);
            //学生编号
            Set<String> stuId = stuXin.keySet();
            for (String id:stuId) {
                //学
                String s = stuXin.get(id);
                System.out.println(cName+""+id+""+s);
            }

        }

        fun();




        //获取学生的编号






    }
    public static void fun(){
        Map<String,Map<String,String>>  schoolMap= new HashMap<>();
        Map<String,String> stu=new HashMap<>();
        stu.put("001","小米");
        stu.put("002","小红");
        schoolMap.put("UI",stu);
        Map<String,String> stu1=new HashMap<>();
        stu1.put("001","小花");
        stu1.put("002","小妞");
        schoolMap.put("JAVA",stu1);
        //获取班级
        Set<String> classname = schoolMap.keySet();
        Iterator<String> iterator = classname.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            //学生信息
            Map<String, String> stringStringMap = schoolMap.get(next);
            //学生id
            Set<String> strings = stringStringMap.keySet();

            Iterator<String> iterator1 = strings.iterator();
            while (iterator1.hasNext()){

                String next1 = iterator1.next();
                //学生id
                String s = stringStringMap.get(next1);
                System.out.println(next+""+next1+""+s);

            }


        }

    }

}
