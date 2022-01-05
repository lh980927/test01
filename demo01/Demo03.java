package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc:
 *   复杂异常处理
 *
 *   异常处理执行原理
 * 异常处理的执行流程
 * 1.程序执行到 System.out.println(a / b); 代码
 * 2.系统会抛出一个异常对象
 * 	创建一个异常对象,并且抛出给开发者，当然这里也可以自己抛出，后面会学习如何手动抛出异常。
 * 	ArithmeticException e = new ArithmeticException("/ by zero");
 * 	throw e;
 * 3.代码进入catch块进行匹配
 * 	Exception ae = e; // 多态
 * 4.匹配成功: 程序会转入catch块执行，执行完catch块后继续执行后面程序代码
 *    匹配失败: 程序交还给JVM处理，打印错误信息，程序结束
 *
 * 注意事项:
 * 1.如果程序在try块中出现了异常,那么无论try块下面有多少行代码都不会被执行,直接去和catch块进行匹配。
 * 2.Catch块中的异常类型从上之下必须满足先子类后父类
 *
 * 3.异常处理的标准格式
 * a.能够显示处理的尽量显示处理,提高程序的可读性
 * b.程序的最后面一定要加上Exception作为父类接受一切异常,提高了程序的健壮性
 *
 */
public class Demo03 {
    public static void main(String[] args){
        System.out.println("start");

        int a = 10;
        int b = 1;
        String s = "aa";
        int[] arr = new int[3];
        Object obj = "张三";
        try {
            System.out.println(a / b);
            System.out.println(s.equals("abc"));
            arr[1] = 10;
            Integer integer = (Integer) obj;
        }
        catch (ArithmeticException ae) {
            System.out.println("出问题了,除数为0!");
        }
        catch (NullPointerException ae) {
            System.out.println("出问题了,对象不能够为null!");
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("出问题,数组越界");
        }     catch (Exception e) {
            System.out.println("有问题");
        }
        System.out.println("end");
    }
}
