package com.example.productSpring.service;

import com.example.productSpring.domain.Product;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private Map<Integer, Product> productMap = new HashMap<>();

    public Map<Integer, Product> getProductMap() {
        return Collections.unmodifiableMap(productMap);
    }

    public Integer getKey(Product product) {
        return product.getId();
    }

    public Product add(Product product) {
        productMap.put(getKey(product), product);
        return product;
    }

    public JSONObject get() {
        return new JSONObject(getProductMap().size());
    }
}
