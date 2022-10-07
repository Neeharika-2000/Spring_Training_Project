package com.knf.dev.controllers;

import com.knf.dev.models.Product;
import com.knf.dev.models.Product2;
import com.knf.dev.request.Product2Service;
import com.knf.dev.request.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.persistence.Id;

@RestController
//@CrossOrigin("https://localhost/3000/")
@CrossOrigin(origins = "*", maxAge = 4800)
@RequestMapping("api/auth")
public class Product2Controller {
    @Autowired
    private Product2Service service2;

    public Product2Controller(Product2Service service2) {
        this.service2 = service2;
    }

    @GetMapping("/product2_details")
    public List<Product2> ListOfProducts2() {
        return service2.getProduct2List();
    }

    @GetMapping("/{id2}")
    public Product2 product2byid(@PathVariable long id) {
        return service2.product2byid(id);

    }

    @GetMapping("delete2Id/{id}")
    public void delete2byId(@PathVariable("id") long id) {

        service2.delete2byid(id);
    }

    @PostMapping("/insert_product2")
    public void insert2(@RequestBody Product2 data) {

        service2.addProduct2(data);
    }

    @PutMapping("update2/{id}")
    public Product2 update2byId(@PathVariable Long id, @RequestBody Product2 entry) {
        return service2.update2byid(id, entry);
    }
}



