package com.example.demo.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("params")
public class Params {
    @GetMapping("h/{params}")
    public String h(@PathVariable("params") String s) {
        return s;
    }

    @GetMapping("p/{tt}")
    public List<Map<String, Integer>> test(@PathVariable("tt") Integer integer) {
        Map<String, Integer> map = new HashMap<>();
        map.put("t", integer);
        List<Map<String, Integer>> list = new ArrayList<>();
        list.add(map);
        return list;
    }
}
