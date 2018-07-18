package com.sanman.testjson;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanman.pojo.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @Author zhaochunhong
 * @Date  2018/7/18
 * @Description //TODO 
 **/
public class TestJson {
    public static void main(String[] args) {
        List<String> classes = new ArrayList<>();
        classes.add("math");
        classes.add("english");
        classes.add("chinese");

        Map<String, String> map = new HashMap<>();
        map.put("1a","a1");
        map.put("2b", "b2");
        Student student = new Student();
        student.setName("huahua");
        student.setClasses(classes);
        student.setMap(map);
        String string = "{\"classes\":[\"math\",\"english\",\"chinese\"],\"name\":\"huahua\",\"map\":{\"1a\":\"a1\",\"2b\":\"b2\"}}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            string = objectMapper.writeValueAsString(student);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            Student newStudent = objectMapper.readValue(string, Student.class);
            for (Map.Entry<String, String> entry: newStudent.getMap().entrySet()){
                System.out.println( "key:" + entry.getKey() +" value: "+ entry.getValue());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            JsonNode root = objectMapper.readTree(string);
            String name = root.get("name").asText();
            int age = root.get("age").asInt();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
