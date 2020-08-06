import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * current user 张++
 * 2020/7/13 0013
 * 14:43
 * 2020
 *
 * 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
 * 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
 *
 * 3. 第二个队伍只要姓李并且年龄超过30岁的成员姓名；存储到一个新集合中。
 * 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
 *
 * 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
 * 6. 根据姓名创建 Person 对象；存储到一个新集合中。
 * 7. 打印整个队伍的Person对象信息。
 */
public class Lx2 {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("张小二",18));
        list1.add(new Person("李小三",20));
        list1.add(new Person("张三",27));
        list1.add(new Person("李小四",19));
        list1.add(new Person("王小五",30));
        list1.add(new Person("赵小六",18));
        list1.add(new Person("王小七",19));
        list1.add(new Person("赵八",10));
        Stream<Person> limit = list1.stream().filter(a -> a.getName().length() == 3).limit(3);

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("李小儿",31));
        list2.add(new Person("王小三",20));
        list2.add(new Person("李小四",28));
        list2.add(new Person("李小五",32));
        list2.add(new Person("李三",27));
        list2.add(new Person("李小六",32));
        list2.add(new Person("李小七",32));
        list2.add(new Person("赵十",10));
        Stream<Person> 李 = list2.stream().filter(a -> a.getAge() >= 30).filter(a -> a.getName().startsWith("李")).skip(2);
        //合并
        Stream<Person> concat = Stream.concat(limit, 李);
        concat.map(a ->{
            List<String> list=new ArrayList<>();
            list.add(a.getName());
            return list;
        }).forEach(a -> System.out.println(a));
    }
}
