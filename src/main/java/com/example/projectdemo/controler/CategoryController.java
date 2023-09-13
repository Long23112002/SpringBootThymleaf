package com.example.projectdemo.controler;

import com.example.projectdemo.model.Products;
import com.example.projectdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/category") // Set the base URL for this controller
public class CategoryController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        List<Products> listProducts = productService.getAllProducts();
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("newProduct", new Products());
        System.out.println(listProducts.size());
        return "admin/category/index";
    }


    @PostMapping("/add")
    public String addCategorySubmit(@ModelAttribute Products newProduct) {
        productService.addProducts(newProduct);
        return "redirect:/admin/category";
    }
}
