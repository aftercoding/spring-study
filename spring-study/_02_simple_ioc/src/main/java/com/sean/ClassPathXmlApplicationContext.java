package com.sean;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 21:07
 */
public class ClassPathXmlApplicationContext {
    private static Map<String, Object> beanMap = new HashMap<>();
    private String filePath;
    public ClassPathXmlApplicationContext(String filePath){
        this.filePath = filePath;
        load();
    }

    private void load(){
        String path = ClassPathXmlApplicationContext.class.getClassLoader().getResource(filePath).getPath();
        try {
            path = URLDecoder.decode(path, "utf-8");
            Document document = Jsoup.parse(new File(path), "utf-8");
            Elements beans = document.getElementsByTag("bean");
            if (beans != null && beans.size() > 0) {
                for (int i = 0; i < beans.size(); i++) {
                    Element bean = beans.get(i);
                    String className = bean.attr("class");
                    String id = bean.attr("id");
                    Class<?> clazz = Class.forName(className);
                    Constructor<?> constructor = clazz.getConstructor();
                    Object obj = constructor.newInstance();
                    beanMap.put(id, obj);
                }

            }
        } catch ( Exception e){
            e.printStackTrace();
        }
//        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
//                 IllegalAccessException | InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
    }


    public Object getBean(String id){
        return beanMap.get(id);
    }
}
