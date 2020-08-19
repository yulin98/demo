package com.example.demo.json;



import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(JUnit4.class)
public class JsonTest {

    @Test
    public void test1(){
/*        String[] e={"1","2"};
        String m ="4";*/
        String a="100,200";
        String[] split = a.split(",");
        /*for (String s : split) {
            System.out.println("s = " + s);
        }*/
        /*Arrays.stream(split).forEach(s -> {
            System.out.println("s = " + s);
        });*/

        /*List<String> strings = Arrays.asList(split);
        List<Float> list=new ArrayList<>();*/
       /* strings.stream().forEach(s -> {
            list.add(Float.valueOf(s));
        });*/

        List<Float> list1=new ArrayList<>();
        for (String string: split){
            list1.add(Float.valueOf(string));
        }

        /*for (String string : strings) {
            list.add(Float.valueOf(string));
        }*/
        System.out.println("JSON.toJSONString(list) = " + JSON.toJSONString(list1));

    }
}
