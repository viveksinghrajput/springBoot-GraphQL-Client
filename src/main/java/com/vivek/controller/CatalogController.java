package com.vivek.controller;

import com.vivek.dto.Item;
import com.vivek.dto.ItemRequestDTO;
import com.vivek.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/products")
    public List<Item> viewProducts() {
        return catalogService.viewProducts();
    }

    @GetMapping("/products/category")
    public List<Item> viewProductsByCategory(@RequestParam String category) {
        return catalogService.viewProductsByCategory(category);
    }

    @PostMapping("/shipment")
    public Item receiveNewShipment(@RequestBody ItemRequestDTO itemRequest) {
        return catalogService.receiveNewShipment(itemRequest);
    }
}