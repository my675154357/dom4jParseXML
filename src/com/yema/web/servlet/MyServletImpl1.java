package com.yema.web.servlet;

/**
 * @Author ：yema
 * @Date ：Create in 15:43 2018/4/2
 * @Edit ：by Intellij IDEA
 * @Description ：
 */
public class MyServletImpl1 implements IMyServlet {
    @Override
    public void init() {
        System.out.println("servlet1开始初始化...");
    }

    @Override
    public void service() {
        System.out.println("servlet1正在服务...");
    }

    @Override
    public void destory() {
        System.out.println("servlet1服务结束...");
    }
}
