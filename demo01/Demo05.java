package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc: 常常会在捕获一个异常后抛出另外一个异常，并且希望把异常原始信息保存下来，这被称为异常链。
 */
public class Demo05 {

    public static void main(String[] args) {

        System.out.println("开始...");

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("出来异常...");
            e.printStackTrace();
            // 抛出异常
            try {
                throw  new Exception("有出现了异常....");
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("异常链...");
            }
        }
        System.out.println("结束...");
    }


}
