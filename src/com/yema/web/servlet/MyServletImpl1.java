package com.yema.web.servlet;

/**
 * @Author ��yema
 * @Date ��Create in 15:43 2018/4/2
 * @Edit ��by Intellij IDEA
 * @Description ��
 */
public class MyServletImpl1 implements IMyServlet {
    @Override
    public void init() {
        System.out.println("servlet1��ʼ��ʼ��...");
    }

    @Override
    public void service() {
        System.out.println("servlet1���ڷ���...");
    }

    @Override
    public void destory() {
        System.out.println("servlet1�������...");
    }
}
