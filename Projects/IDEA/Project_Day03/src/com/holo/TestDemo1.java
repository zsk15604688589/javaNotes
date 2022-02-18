import java.util.Scanner;

//public class TestDemo1 {
//    public static void main(String[] args) {
//        //创建数组
//        int[] array = new int[3];
//        //按照下标的位置添加即可
//        array[0] = 100;
//        array[1] = 200;
//
//        //更新：就是替换下标位置的参数
//        array[0] = 500;
//
//        //删除：就是把制定位置的数据还原为默认值
//        array[1] = 0;
//    }
//}

public class TestDemo1 {
    public static void main(String[] args) {
        //接收控制台的输入数据
        Scanner scanner = new Scanner(System.in);
        //提示信息
        System.out.println("请输入一个数字：");
        int i = scanner.nextInt();
        System.out.println("i"+i);
    }
}
