package pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pk.modelDto.ProductDto;
import pk.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    String home() {
        System.out.println("home");
        return "product";
    }
    @GetMapping("/products")
    List<ProductDto> products() {
        return productService.getProductsList();
    }
}
