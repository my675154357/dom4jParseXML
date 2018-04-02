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
 * @Description ��
 */
public class test2 {

    @Test
    public void fun() throws DocumentException {
        //1.��ȡ������
        SAXReader reader = new SAXReader();
        //2.���document�ĵ�����
        Document document = reader.read("src/w.xml");
        //3.��ȡ��Ԫ��
        Element root = document.getRootElement();
        System.out.println(root.getName());//��ȡ��Ԫ��name
        //4.��ȡ��Ԫ��
        Element charactor = root.element("charactor");
        List<Element> elements = charactor.elements();
        for (Element e : elements){
            System.out.println(e.getName()+"..."+e.getText());
        }

    }

}
