package com.commerce.service;

import com.commerce.entity.Cart;
import com.commerce.exception.CartAlreadyHasException;
import com.commerce.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements ICartService{

    @Autowired
    private CartRepo cartRepo;

    @Override
    public Cart addToCart(Cart cart) {
        return cartRepo.save(cart);
    }


    @Override
    public List<Cart> showCartProducts() {
       return cartRepo.findAll();

    }

    @Override
    public String removeItem(Integer id) {
        Optional<Cart> byId = cartRepo.findById(id);

        if(byId.isPresent()){
            Cart cart = byId.get();
            String product = cart.getPName();
            cartRepo.deleteById(id);
            return(product+" is removed from the cart");
        }
        return id+" is not available";
    }
}
