package com.yema.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @Author ��yema
 * @Date ��Create in 15:19 2018/4/2
 * @Edit ��by Intellij IDEA
 * @Description ����dom4j����XML
 */
public class Dom4jTest {

    @Test
    public void fun() throws DocumentException {
        //1.��ȡ������
        SAXReader reader = new SAXReader();
        //2.���document�ĵ�����
        Document document = reader.read("src/web.xml");
        //3.��ȡ��Ԫ��
        Element root = document.getRootElement();
        System.out.println(root.getName());//��ȡ��Ԫ��name
        System.out.println(root.attributeValue("version"));//��ȡ��Ԫ�ص�����ֵ
        //4.��ȡ��Ԫ��
        List<Element> childs = root.elements();
        //5.������Ԫ��
        for(Element child : childs){
            if("servlet".equals(child.getName())){
                Element servletName = child.element("servlet-name");
                Element servleClass = child.element("servlet-class");
                System.out.println(servletName.getText()+"-------------"+servleClass.getText());
            }
        }

    }
}
