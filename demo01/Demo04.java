package com.hk.demo01;

/**
 * @Title
 * @Author Yellow Doctor
 * @Desc: 异常的处理
 *
 *    异常报的信息:
 *    Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	at com.hk.demo01.Demo04.test(Demo04.java:35)
 * 	at com.hk.demo01.Demo04.main(Demo04.java:12)
 *   异常信息详情:
 *      01   java.lang.ArithmeticException:类型
 *      02   / by zero的 信息
 *      03  at com.hk.demo01.Demo04.test(Demo04.java:35)  方法和 文件名称 和 异常的行数
 *
 *
 *   自己通过  Throwable 打印的信息:
 *
 *          th.getMessage();  获取异常信息
 *          th.getStackTrace();  获取堆栈信息 (可以获取异常的详细信息)
 *          element.getClassName();  获取的异常信息的类 : com.hk.demo01.Demo04
 *          element.getMethodName();;  获取的异常信息异常的方法 : Main
 *          element.getFileName();           获取异常信息的行文件名称  Demo04.java
 *
 *      int b = a / 0;  出现了异常,
 *        编译期 会创建异常: ArithmeticException 抛给jvm
 *        jvm会处理异常 捕获异常进行异常的处理和打印异常信息
 *        这个过程是:
 *          01   Throwable 中 ,getMessage() 获取异常信息
 *          02   th.getStackTrace(); 获取异常中的堆栈信息
 *          03   StackTraceElement  堆栈信息从元素类 可以捕获  异常的详情
 *                        element.getClassName();  获取的异常信息的类 : com.hk.demo01.Demo04
 *  *                    element.getMethodName();;  获取的异常信息异常的方法 : Main
 *  *                    element.getFileName();           获取异常信息的行文件名称  Demo04.java
 *          04 jvm 输出异常信息,让程序调试代码
 *          05 程序接着往下执行
 *
 */
public class Demo04 {

    public static void main(String[] args) {
//        int a = 10;
//        test(a);
        Throwable th = new Throwable("我是自己的抛出的异常");

//         获取异常信息
        String message = th.getMessage();
        System.out.println("message = " + message);

//        提供编程访问由 printStackTrace() 输出的堆栈跟踪信息。
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            String className = element.getClassName();
            System.out.println("className = " + className);
            String methodName = element.getMethodName();
            System.out.println("methodName = " + methodName);
            int lineNumber = element.getLineNumber();
            System.out.println("lineNumber = " + lineNumber);
            String fileName = element.getFileName();
            System.out.println("fileName = " + fileName);
        }

    }

    private static void test(int a) {
        // 这里 抛出了一个异常
        ArithmeticException arithmeticException = new ArithmeticException();
        // 把这个异常给java虚拟
        System.out.println(a / 0);
    }
}
