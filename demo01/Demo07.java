package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc:
 *  throw 在方法的内容 可以自己抛出 自定的异常
 */
public class Demo07 {

    public static void main(String[] args){

        test01(10, 0);

    }

    public static void test01(int a,int b){

        if (b == 0){
            //自己手动抛出异常
            // 可以 提示 数据非法 让程序 更好的优化
            try {
                throw  new ArithmeticException("网络访问人多稍后再试....");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        System.out.println(a / b);
    }


}
