package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc:
 *
 * throws的引入
 * 为什么有了try...catch处理异常还需要学习throws关键字?
 * 在实际开发当中，可能某个异常我处理不了，或者我没有权限处理，更或者说我压根就不想处理，
 * 那么我们可以抛给其他人处理，即调用者处理，谁调用谁处理。
 * 格式
 *   [修饰符] 返回值类型 方法名(参数列表) [throws 异常类1,异常类2....]{
 *   }
 * 特点
 * 1.该方法抛出异常类,表示抛出调用者处理,谁调用谁处理
 * 2.一个方法可以声明多个异常类
 * 3.如果一个方法抛出的是一个编译时异常,那么必须处理,调用者也必须处理
 * 4.子类继承父类,重写方法,抛出的异常不能够被扩大
 *
 *          子类重写父类的方法.子类的异常不能比父类的异常大
 */
public class Demo06 {

    public static void main(String[] args){
        // 01  throws 抛出异常处理  谁调用谁处理
        // 02  不出来.抛出去
        try {
            div();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *  可以抛出异常
     *    ArithmeticException  运行异常 (非检查异常 ，为了程序的健壮 我们要出来)
     *    ClassNotFoundException  检查异常, 必须出来(不出来编译不通过)
     *
     */
    public static void  div()throws ArithmeticException,ClassNotFoundException{
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}
