package com.yema.web.servlet;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Author ��yema
 * @Date ��Create in 15:45 2018/4/2
 * @Edit ��by Intellij IDEA
 * @Description ��ͨ����ȡXML�ļ����÷�����ʵ��ʵ���������á�
 */
public class MyServletTest {
    public static void main(String[] args) throws Exception {
        //1.������������
        SAXReader reader = new SAXReader();
        //2.ʹ�ý���������web,xml�ļ����õ�document����
        Document document = reader.read("src/web.xml");
        //3.��ȡ��Ԫ�ؽڵ�
        Element root = document.getRootElement();
        //4.����Ԫ�����ƻ�ȡ��Ԫ�ؽڵ�
        Element servlet = root.element("servlet");
        //5.����Ԫ�����ƻ�ȡservlet-class�ļ��ڵ�
        String servletClass = servlet.element("servlet-class").getText();
        System.out.println(servletClass);
        //6.ͨ����ȫ����ȡ�ֽ����ļ�
        Class clazz = Class.forName(servletClass);
        //7.����ʵ�����
        IMyServlet obj = (IMyServlet)clazz.newInstance();
        //8.����ʵ������ķ���
        obj.init();
        obj.service();
        obj.destory();
    }
}
