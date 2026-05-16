package com.commerce.service;

import com.commerce.entity.Cart;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICartService {

    public Cart addToCart(Cart cart);
    public List<Cart> showCartProducts();
    public String removeItem(Integer id);
}
