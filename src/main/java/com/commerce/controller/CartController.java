package com.commerce.controller;

import com.commerce.entity.Cart;
import com.commerce.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:5173")
public class CartController {

    @Autowired
    private ICartService service;

    @PostMapping("/add")
    public Cart addCart(@RequestBody Cart cart){
        return service.addToCart(cart);
    }


    @GetMapping("/get")
    public List<Cart> getCartItems(){
        return service.showCartProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Integer id){
        return service.removeItem(id);
    }

}
