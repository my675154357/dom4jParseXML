package com.yema.web.servlet;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Author ：yema
 * @Date ：Create in 15:45 2018/4/2
 * @Edit ：by Intellij IDEA
 * @Description ：通过读取XML文件，用反射来实现实例方法调用。
 */
public class MyServletTest {
    public static void main(String[] args) throws Exception {
        //1.创建解析对象
        SAXReader reader = new SAXReader();
        //2.使用解析器加载web,xml文件，得到document对象
        Document document = reader.read("src/web.xml");
        //3.获取根元素节点
        Element root = document.getRootElement();
        //4.根据元素名称获取子元素节点
        Element servlet = root.element("servlet");
        //5.根据元素名称获取servlet-class文件节点
        String servletClass = servlet.element("servlet-class").getText();
        System.out.println(servletClass);
        //6.通过类全名获取字节码文件
        Class clazz = Class.forName(servletClass);
        //7.创建实体对象
        IMyServlet obj = (IMyServlet)clazz.newInstance();
        //8.调用实例对象的方法
        obj.init();
        obj.service();
        obj.destory();
    }
}
