package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.PostEntity;
import com.example.demo.repository.PostCrudRepository;

@Controller
public class PostController {
    
    @Autowired
    PostCrudRepository repository;
    
    @GetMapping("/")
    public String showHome(Model model) {
        Iterable<PostEntity> products = repository.findAll();
        model.addAttribute("products", products);
        return "index";
    }
    
    @GetMapping("/cart.html")
    public String showCart() {
        return "cart";
    }
    
    @GetMapping("/contact.html")
    public String showContact() {
        return "contact";
    }
    
    @GetMapping("/about.html")
    public String showAbout() {
        return "about";
    }
    
    @GetMapping("/shop.html")
    public String showShop(Model model) {
        Iterable<PostEntity> products = repository.findAll();
        model.addAttribute("products", products);
        return "shop";
    }
}