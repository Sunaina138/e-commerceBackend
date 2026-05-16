package com.commerce.repo;

import com.commerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepo extends JpaRepository<Cart,Integer> {
}
