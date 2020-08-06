import java.util.*;
@SuppressWarnings("ALL")
public class Poker1 {

    public static void fun(){
        //创建扑克牌集合
        Map<String,String> map = new HashMap<>();
//        map.put("53","大王");
//        map.put("54","小王");
        map.put("01","红心A");map.put("02","红心2");map.put("03","红心3");map.put("04","红心4");map.put("05","红心5");map.put("06","红心6");map.put("07","红心7");map.put("08","红心8");map.put("09","红心9");map.put("10","红心10");map.put("11","红心J");map.put("12","红心Q");map.put("13","红心K");
        map.put("14","方块A");map.put("15","方块2");map.put("16","方块3");map.put("17","方块4");map.put("18","方块5");map.put("19","方块6");map.put("20","方块7");map.put("21","方块8");map.put("22","方块9");map.put("23","方块10");map.put("24","方块J");map.put("25","方块Q");map.put("26","方块K");
        map.put("27","黑桃A");map.put("28","黑桃2");map.put("29","黑桃3");map.put("30","黑桃4");map.put("31","黑桃5");map.put("32","黑桃6");map.put("33","黑桃7");map.put("34","黑桃8");map.put("35","黑桃9");map.put("36","黑桃10");map.put("37","黑桃J");map.put("38","黑桃Q");map.put("39","黑桃K");
        map.put("40","梅花A");map.put("41","梅花2");map.put("42","梅花3");map.put("43","梅花4");map.put("44","梅花5");map.put("45","梅花6");map.put("46","梅花7");map.put("47","梅花8");map.put("48","梅花9");map.put("49","梅花10");map.put("50","梅花J");map.put("51","梅花Q");map.put("52","梅花K");

        //List<String> list1=new ArrayList<>(map.keySet());
        Set<String> strings = map.keySet();

        List<String> list2=new ArrayList(map.values());



        //Collections.shuffle(list1);
        Collections.shuffle(list2);


        //System.out.println(list2);

        List p1=new ArrayList();
        List p2=new ArrayList();
        List p3=new ArrayList();
        List p4=new ArrayList();
        List p5=new ArrayList();
        List p6=new ArrayList();
        List p7=new ArrayList();
        List p8=new ArrayList();


        for (int i = 0; i < map.size(); i++) {
            if (i < 24) {

                if (i%8==0){
                    p1.add(list2.get(i));
                }
                if (i%8==1){
                    p2.add(list2.get(i));

                }
                if (i%8==2){
                    p3.add(list2.get(i));

                }
                if (i%8==3){
                    p4.add(list2.get(i));
                }
                if (i%8==4){
                    p5.add(list2.get(i));

                }
                if (i%8==5){
                    p6.add(list2.get(i));

                }
                if (i%8==6){
                    p7.add(list2.get(i));

                }
                if (i%8==7){
                    p8.add(list2.get(i));

                }
            }else {
                break;
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);


    }

    public static void main(String[] args) {

        fun();

    }

}
