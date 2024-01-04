package pk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    String home() {
        System.out.println("home");
        return "product";
    }
}
