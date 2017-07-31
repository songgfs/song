package com.asiainfo.chapter1.songgf;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class PracticeApi {
    public static void main(String[] args) {
        DataOpertions();
        StringPractice();
        Array();
        fileOper();
    }
    public static  void StringPractice(){
        //String类型的字符串一旦开辟后就对应的大小就不会发生着改变，若进行 s = s +"sqweqe";
        //则是先销毁之前的所定义的，再进行重新定义一个空间让其存储。
        String m = "wlecome";
        m = m+"dadsadsa";
        //若是Stringbuffer 或者Stringbuilder 这两种可以通过append进行在尾部进行追加字符串，其空间是可变的，
        // 当每次内存不足的时候按照当前的进行扩展一倍，但是也是存在着缺陷，存在着浪费空间的可能性
        StringBuffer sb = new StringBuffer();
        sb.append("song");
        sb.append("dasdasd");
        System.out.println(sb.toString());
    }

    public static void  DataOpertions(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
        Date data = new Date();
        System.out.println("结果"+sdf.format(data));
    }
    /*
    * 集合分有list,set,map,其中list集合是有序的，set集合是无序的，map按照键-值的方式存放的。
    *Collection和Map
    * */
    public static void  Array(){
        List<String> list = new ArrayList<String>();
        list.add("ten");
        list.add("five");
        list.add("one");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String string : list) {
            System.out.println(string);
        }

        Set<String> set = new HashSet<String>();
        set.add("song");
        set.add("s");
        set.add("d");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //map的循环是通过获取键来进行对值的获取的
        Map<String, String> map = new HashMap<String, String>();
        map.put("song", "123");
        map.put("gao", "1234");
        map.put("feng", "12345");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getValue());
        }
    }

    public static void fileOper(){
    }
}
