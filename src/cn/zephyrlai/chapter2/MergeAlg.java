package cn.zephyrlai.chapter2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: Zephyr Lai
 * @Description: 2.2 归并算法
 */
public class MergeAlg {

    private Comparable[] aux;//声明辅助数组

    public void merge(Comparable[] a,int low,int mid,int high){
        int i=low,j=mid+1;  //记录两个子数组中的元素相对于整个数组中的下标
        aux=a.clone();
        for (int k=low;k<=high;k++) {
            if(i>mid)                               a[k]=aux[j++];
            else if(j<mid)                          a[k]=aux[i++];
            else if(SortUtils.less(aux[i],aux[j]))  a[k]=aux[i++];
            else                                    a[k]=aux[j++];
        }
    }

    @Test
    public void mergeTest(){
       Integer[] aa={1,3,5,7,9,  2,4,6,8,10};
       System.out.println(Arrays.toString(aa));
       merge(aa,0,4,9); //mid的下标是4而不是5
       System.err.println(Arrays.toString(aa));
    }
}
