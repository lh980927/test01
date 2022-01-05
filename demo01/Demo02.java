package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc:
 *  异常处理方式1:
 *      01 try{
 *         可能异常的代码
 *      }catch(){
 *          捕获 异常处理的代码
 *      }
 */
public class Demo02 {

    public static void main(String[] args) {

        System.out.println("开始");

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("捕获异常...");
        }

        System.out.println("结束");
    }

}
