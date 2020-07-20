package com.atguigu;

import java.util.ArrayList;
import java.util.Arrays;

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
    }
}
