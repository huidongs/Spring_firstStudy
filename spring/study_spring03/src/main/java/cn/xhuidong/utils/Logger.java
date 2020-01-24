package cn.xhuidong.utils;

/**
 * @auther huidong
 * @date 2020/1/13 10:33
 *
 * 用于记录日志的工具类，它里面提供了公共的方法
 */
public class Logger {

    //用于打印日志，计划让其在切入点方法之前执行


    //前置通知
    public void beforePrintLog()
    {
        System.out.println("前置通知Logger类中的beforePrintLog方法开始记录日志了  ");

    }
    //后置通知
    public void afterReturningPrintLog()
    {
        System.out.println("后置通知Logger类中的afterReturningPrintLog方法开始记录日志了  ");

    }
    //异常通知
    public void afterThrowingPrintLog()
    {
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了  ");

    }
    public void printLog()
    {
        System.out.println("最终通知Logger类中的printLog方法开始记录日志了  ");

    }
}
