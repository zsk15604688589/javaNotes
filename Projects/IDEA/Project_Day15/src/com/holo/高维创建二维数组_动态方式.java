/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;

/**
 * @author Holo
 * @date 7/2/2022 下午5:00
 */
public class 高维创建二维数组_动态方式 {
    public static void main(String[] args) {
        //高维创建,可以不确定列数
        int[][] array = new int[3][];

        //在使用元素时,必须创建出来了
        array[0] = new int[1];
        array[0][0] = 1;

        array[1] = new int[2];
        array[1][0] = 2;
        array[1][1] = 3;

        array[2] = new int[3];
        array[2][0] = 4;
        array[2][1] = 5;
        array[2][2] = 6;

        //遍历
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("array[" + row + "][" + column + "]=" + array[row][column]);
            }
        }

    }
}