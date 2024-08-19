package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Map
        * Collection 안터페이스와는 다른 저장 방식을 가진다.
        * 키와 값을 한 쌍으로 저장하는 방식을 사용한다.
        * 인덱스 대신에 키 사용
        *
        * 키(key) ?
        *  : 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        *  1. 요소의 저장 순서를 유지하지 않는다.
        *  2. 키는 중복을 허용하지 않지만, 키가 다르면 중복 값은 저장 가능하다.
        *
        * HashMap, HashTree, TreeMap 등의 대표적인 클래스가 있지만,
        * HashMap이 제일 많이 사용된다.
        * */

        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(2, "redApple");
        hmap.put(3.3, 123);
        System.out.println(hmap);

        hmap.put(2, "yellow");
        System.out.println(hmap);

        hmap.put(3, "yellow");
        System.out.println(hmap);

        // 값을 가져올 때 get()
        System.out.println("키 3에 대한 값 : " + hmap.get(3));

        // 키 값 삭제 처리 remove()
        hmap.remove(3);
        System.out.println(hmap);

        System.out.println(hmap.size());

        HashMap<String, String> hmap2 = new HashMap();
        hmap2.put("one", "java17");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jcbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");
        System.out.println(hmap2);

        // keySet() 이용해서 키만 따로 set으로 만들고, iterator()로
        // 키에 대한 목록을 만든다.
        Iterator<String> keyIter = hmap2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " : " + value);
        }

        Collection<String> values = hmap2.values();
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

       Object[] valueArr = values.toArray();
        for(int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        // Map의 내부에 존재하는 EntrySet을 이용
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, String> map = new HashMap<>();

        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");

        for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }


    }
}
