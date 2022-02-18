import org.junit.Test;

import java.util.*;

/**
 * @author Holo
 * @date 2022/2/16 18:37
 */
public class TestDemo {
    public static void main(String[] args) {
    }

    private List list = new ArrayList();

    @Test
    public void test1() {
        //添加
        list.add(1);
        list.add(2);
        list.add(3);
        //输出
        System.out.println(list);
        //输出:[1, 2, 3]
    }

    @Test
    public void test2() {
        //添加元素
        List list = Arrays.asList(1, 2, 3);
        Object obj = list.get(1);
        System.out.println(obj);
        //输出: 2
    }

    @Test
    public void test3() {
        //添加元素
        List list = Arrays.asList(1, 2, 3);
        list.remove(1);
        System.out.println(list);
        //报错:java.lang.UnsupportedOperationException
    }

    @Test
    public void test4() {
        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        //list.remove(1);
        //输出:[1,3]
        list.remove(new Integer(1));
        //输出:[2, 3]
        System.out.println(list);
    }

    @Test //是否包含了指定的元素
    public void test5() {
        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        //可以判断:在修改集合前必须做判断
        if (list.contains(2)) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
        //输出:包含
    }

    @Test
    public void test6() {
        List list = new ArrayList();
        Random random = new Random();
        //获取50以内的随机数
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(50) + 50;
            list.add(i1);
        }
        System.out.println(list);
        //输出:[77, 80, 96, 66, 58, 51, 81, 54, 84, 76]
    }

    @Test
    public void test7() {
        //无序且不重复
        Set set = new HashSet();
        List list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            set.add(i1);
            list.add(i1);
        }
        System.out.println(list);
        System.out.println(set);
        //查询没有出现过的元素
        for (int i = 0; i < 10; i++) {
            //判断
            if (!set.contains(i)) {
                System.out.print(i);
            }
        }
    }
    //输出:
    //[3, 3, 9, 0, 6, 4, 4, 3, 3, 9]
    //[0, 3, 4, 6, 9]
    //12578

}