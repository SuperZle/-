import java.util.*;

public class LxMap {
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
        Iterator<String> iterator = classname.iterator();
        while (iterator.hasNext()){
            String classname1 = iterator.next();
            //System.out.println(classname1);
            //获取班级对应的学生信息   返回指定的值
            Map<String, String> stuMap = schoolMap.get(classname1);
            //获取学生的id
            Set<String> stuId = stuMap.keySet();
            Iterator<String> iterator1 = stuId.iterator();
            while (iterator1.hasNext()){
                String stuId1 = iterator1.next();
                String stuName = stuMap.get(stuId1);
                System.out.println(classname1+stuId1+stuName);
            }

        }


        //获取学生的编号






    }
}
