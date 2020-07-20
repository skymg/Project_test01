package com.atguigu;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("helloorld");
        System.out.println("args = " + Arrays.deepToString(args));
        String[] arr = new String[]{"tom","jerry","hanmeie","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (String s : strings) {
            System.out.println(s);
        }

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","aa");
        map.put("year","12");
        map.put("address","cq");
        Set<String> set=map.keySet();
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()) {
            String key =iterator.next();
            System.out.println(key+">^^xx^^>缓冲中>^^xx^^>"+map.get(key));
        }
    }
}
