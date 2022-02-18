## 5.4 数组的排序

### 5.4.1 冒泡排序

+ 案例:对3,1,6,2,5进行排序

> 左边和右边两个相邻的数据进行比较
>
> 如果右边的小于左边的数据那么进行一次交换
>
> 如果右边的大于左边的数据那么不进行数据交换 
>
> 公式:
>
> > + 可以看到比较了n-1次,那么第二遍n-2,以此类推
> > + $(n-1)+(n-2)+...=(n-1)*n/2$
> > + 所以对上面的数据进行排序的次数(比较次数):$(5-1)*5/2=10$
> > + 比较的次数称为时间复杂度(10),临时使用的变量称为空间复杂度(1)

![冒泡](../Img/%E5%86%92%E6%B3%A1-16443117661461.gif)

+ 冒泡排序编码案例:

```java
public class BubbleSort {
    public static void main(String[] args) {
        //创建数组
        int[] array = {3, 1, 6, 2, 5};
        //循环比较
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //判断
                if (array[j] > array[j + 1]) {
                    //必须使用一个临时变量保存一下j位置的元素
                    int temp = array[j];
                    //交换位置
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //输出排序后的元素
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
```

### 5.4.2 选择排序

+ 选择排序对冒泡排序进行改进;使**交换次数**减少了,**但是**,**比较次数**没有减少
+ 原理:找到一个元素后一次与后面的元素比较,找到最小的元素放到前面

![选择](../Img/%E9%80%89%E6%8B%A9-16443117704862.gif)

+ 选择排序代码案例

```java
public class SelectionSort {
    public static void main(String[] args) {
        //创建数组
        int[] array = {3, 10, 6, 2, 5, 1};
        //循环比较:选择排序的方式
        for (int i = 0; i < array.length; i++) {
            //设置一个最小的下标值,获取该元素
            int min = i;
            //循环获取最小的元素
            for (int j = i + 1; j < array.length; j++) {
                //判断比较的结果
                if (array[j] < array[min]) {
                    //更换最小的元素对应的下标
                    min = j;
                }
            }
            //找到最小的元素后交换位置
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        //输出排序后的元素
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
```

## 5.5 数组的搜索

### 5.5.1 二分法(折半查找)

+ **注意**:在使用二分法时,数组必须已经**排完序**了

| 元素 | 11   | 12   | 13   | 14   | 15   | 16   | 17   | 18   | 19   |20|
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |----|
| 下标 | 0    | 1    | 2    | 3    | 4    | 5    | 6    | 7    | 8    |9	|	

+ 就是把最小下标+最大下标求和后除2,就可以判断需要的数据是在前一半还是后一半

+ 二分查找代码案例:

  ```java
  public class BinarySearch {
      public static void main(String[] args) {
          //创建数组
          int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
          //使用二分查找
          int index = binarySearch(array, 20);
          System.out.println(index);
      }
  
      //获取下标的值
      public static int binarySearch(int[] array, int value) {
          //开始的下标
          int begin = 0;
          //结束的下标
          int end = array.length - 1;
          //循环
          while (begin <= end) {
              //折半
              int mid = (begin + end) / 2;
              //判断
              if (value == array[mid]) {
                  return mid;
              } else if (value > array[mid]) {//数据在后一半
                  //开始的下标变化
                  begin = mid + 1;
              } else if (value < array[mid]) {//数据在前一半
                  //结束的下标变化
                  end = mid - 1;
              }
          }
          return -1;
      }
  }
  ```

### 5.5.2 笔试题

+ 10万瓶水,其中有1瓶有毒,有10只小强,如果小强喝了有毒的水后3秒后死亡,问如何找到这瓶水
+ 答:使用折半+推算

## 5.6 Arrays工具类

### 5.6.1 通过工具类对数组进行排序

```java
public class Arrays排序 {
    public static void main(String[] args) {
        //创建数组
        int[] array = {3,1,6,2,5};
        //工具类对数组排序
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
```

### 5.6.2 使用工具类对数组进行二分法

```java
public class Arrays二分法 {
    public static void main(String[] args) {
        //创建数组
        int[] array = {3,1,6,2,5};
        //查找元素对应的下标
        int index = Arrays.binarySearch(array, 6);
        System.out.println(index);
    }
}
```

+ 注:binarySearch()方法源码中,未查找到对应元素下标后,返回$-(数组长度+1)$

+ binarySearch()源码

  ```java
      private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                       int key) {
          int low = fromIndex;
          int high = toIndex - 1;
  
          while (low <= high) {
              int mid = (low + high) >>> 1;
              int midVal = a[mid];
  
              if (midVal < key)
                  low = mid + 1;
              else if (midVal > key)
                  high = mid - 1;
              else
                  return mid; // key found
          }
          return -(low + 1);  // key not found.
      }
  ```

+ 例如:

  ```java
  public class Arrays二分法 {
      public static void main(String[] args) {
          //创建数组
          int[] array = {3,1,6,2,5};
          //查找元素对应的下标
          int index = Arrays.binarySearch(array, 20);
          System.out.println(index);
      }
  }
  ```

查找20对应的下标后,未找到对应下标,运行结果为:`-6`

