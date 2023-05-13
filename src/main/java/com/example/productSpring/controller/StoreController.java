package com.example.productSpring.controller;

import com.example.productSpring.model.Item;
import com.example.productSpring.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam Set<Integer> id) {
        storeService.add(id);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }
}
