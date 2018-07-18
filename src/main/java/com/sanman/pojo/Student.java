package com.sanman.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @Author zhaochunhong
 * @Date  2018/7/18
 * @Description //TODO 
 **/
public class Student {
    List<String> classes;
    String name;
    Map<String, String> map = new HashMap<>();

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
