import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;


public class DemoTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        //货币格式
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        String format = decimalFormat.format(123456.12547);
        System.out.println(format);//123,456.13
    }

    @Test
    public void test2() {
        //货币格式
        DecimalFormat decimalFormat = new DecimalFormat("###,###.000000");
        String format = decimalFormat.format(123456.332);
        System.out.println(format);//123,456.332000
    }

    @Test
    public void test3() {
        //财务数据
        BigDecimal v1 = new BigDecimal(20);
        BigDecimal v2 = new BigDecimal(30);
        //相加
        BigDecimal add = v1.add(v2);
        System.out.println(add);//50
    }

    @Test
    public void test4() {
        for (int i = 0; i < 5; i++) {
            double random = Math.random();
            System.out.println(random);
            //0.8145461676629191
            //0.5063139382435713
            //0.022291936593875183
            //0.9098999456499665
            //0.4524165674492039
        }
    }

    @Test
    public void test5() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            //可以指定随机数的范围
            int n = random.nextInt(10);
            System.out.print(n);
            // 43959
        }
    }

    @Test
    public void test6() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int n = random.nextInt(50);
            System.out.println(n + 50);
            //86
            //68
            //79
            //66
            //58
        }
    }

    @Test
    public void test7() {
        int i = 10;
        if (i >= 10) {
            System.out.println(Msg.SUCCESS);
        } else {
            System.out.println(Msg.FAILURE);
        }
        //SUCCESS
    }

    //创建枚举类
    enum Msg {
        SUCCESS, FAILURE;
    }

    @Test
    public void test8() {
        //不建议使用类进行实例化;因为没有灵活性
        ArrayList list = new ArrayList();
        //推荐使用接口指向实现类:具有灵活性
        Collection list1 = new LinkedList();
        Collection list2 = new HashSet();
        //最推荐的就是使用直接接口
        List list3 = new ArrayList();
        List list4 = new LinkedList();
    }

    @Test
    public void test9() {
        List list = new ArrayList();
        list.add(1);
        //等价于
        list.add(new Integer(1));
    }

    @Test
    public void test10() {
        List list = new ArrayList();
        //添加元素
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        //遍历:有序输出,就是输入的顺序(※不是排序)
        for (int i = 0; i < list.size(); i++) {
            Object el = list.get(i);
            System.out.print(el);
            //13545
        }
    }

    @Test
    public void test11() {
        List list = new ArrayList();
        //增加元素
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        //遍历:有序输出,就是输入的顺序(※不是排序)
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Test
    public void test12() {
        List list = new ArrayList();
        //增加元素
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        //遍历:有序输出,就是输入的顺序(※不是排序)
        list.forEach(System.out::println);
    }

    @Test
    public void test13() {
        List list = new ArrayList();
        //增加元素
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        //遍历:有序输出,就是输入的顺序(※不是排序)
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
    }

}