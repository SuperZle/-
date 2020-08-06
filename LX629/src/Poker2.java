import java.util.*;

public class Poker2 {

    public static void fun(){
        //创建扑克牌集合
//        String[] s={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//        String[] s1={"♣","♠","♥","◆"};

        Map<Integer,String> map = new HashMap<>();

        map.put(53,"大王");
        map.put(54,"小王");
        map.put(1,"红心A");map.put(2,"红心2");map.put(3,"红心3");map.put(4,"红心4");map.put(5,"红心5");map.put(6,"红心6");map.put(7,"红心7");map.put(8,"红心8");map.put(9,"红心9");map.put(10,"红心10");map.put(11,"红心J");map.put(12,"红心Q");map.put(13,"红心K");
        map.put(14,"方块A");map.put(15,"方块2");map.put(16,"方块3");map.put(17,"方块4");map.put(18,"方块5");map.put(19,"方块6");map.put(20,"方块7");map.put(21,"方块8");map.put(22,"方块9");map.put(23,"方块10");map.put(24,"方块J");map.put(25,"方块Q");map.put(26,"方块K");
        map.put(27,"黑桃A");map.put(28,"黑桃2");map.put(29,"黑桃3");map.put(30,"黑桃4");map.put(31,"黑桃5");map.put(32,"黑桃6");map.put(33,"黑桃7");map.put(34,"黑桃8");map.put(35,"黑桃9");map.put(36,"黑桃10");map.put(37,"黑桃J");map.put(38,"黑桃Q");map.put(39,"黑桃K");
        map.put(40,"梅花A");map.put(41,"梅花2");map.put(42,"梅花3");map.put(43,"梅花4");map.put(44,"梅花5");map.put(45,"梅花6");map.put(46,"梅花7");map.put(47,"梅花8");map.put(48,"梅花9");map.put(49,"梅花10");map.put(50,"梅花J");map.put(51,"梅花Q");map.put(52,"梅花K");

        List<Integer> list1=new ArrayList<>(map.keySet());

//        while (iterator.hasNext()){
//            Integer next = iterator.next();
//            String[] strings = map.get(next);
//
//        }




        Collections.shuffle(list1);



        //System.out.println(list2);

        List p1=new ArrayList();
        List p2=new ArrayList();
        List p3=new ArrayList();
        List p4=new ArrayList();



        for (int i = 0; i < map.size(); i++) {

            if (i < 51) {

                if (i%3==1){
                    p1.add(map.get(list1.get(i)));
                }
                if (i%3==2){
                    p2.add(map.get(list1.get(i)));

                }
                if (i%3==0){
                    p3.add(map.get(list1.get(i)));

                }
            }else {
                p4.add(map.get(list1.get(i)));
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }

    public static void main(String[] args) {

        fun();

    }

}
