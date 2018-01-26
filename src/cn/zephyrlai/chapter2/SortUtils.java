package cn.zephyrlai.chapter2;

/**
 * @Author: Zephyr Lai
 * @Description: 第二章 算法 的通用工具类
 */
public class SortUtils {

    //判断i是否比j小，如果i比j小，则返回true
    public static Boolean less(Comparable i,Comparable j){
        return i.compareTo(j)<0;
    }

}
