package com.yema.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @Author ：yema
 * @Date ：Create in 15:19 2018/4/2
 * @Edit ：by Intellij IDEA
 * @Description ：用dom4j解析XML
 */
public class Dom4jTest {

    @Test
    public void fun() throws DocumentException {
        //1.获取解析器
        SAXReader reader = new SAXReader();
        //2.获得document文档对象
        Document document = reader.read("src/web.xml");
        //3.获取根元素
        Element root = document.getRootElement();
        System.out.println(root.getName());//获取根元素name
        System.out.println(root.attributeValue("version"));//获取根元素的属性值
        //4.获取子元素
        List<Element> childs = root.elements();
        //5.遍历子元素
        for(Element child : childs){
            if("servlet".equals(child.getName())){
                Element servletName = child.element("servlet-name");
                Element servleClass = child.element("servlet-class");
                System.out.println(servletName.getText()+"-------------"+servleClass.getText());
            }
        }

    }
}
