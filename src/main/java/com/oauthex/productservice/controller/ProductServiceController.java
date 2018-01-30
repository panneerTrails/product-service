package com.oauthex.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProductService")
public class ProductServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceController.class);

    @GetMapping("/productServiceStatus")
    public String getProductStatus() {
        LOGGER.info("Inside Product Service Controller:::");
        return "Hello I'm from core service";
    }
}


