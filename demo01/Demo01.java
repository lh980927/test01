package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc:
 *
 *   如果程序出现了异常?
 *          代码会打印错误信息，并且终止程序的运行，这是虚拟机的一种默认异常处理机制
 *
 *
 */
public class Demo01 {

    public static void main(String[] args) {

        System.out.println("开始");
        int a = 10 / 0;
        System.out.println("结束");

    }
}
