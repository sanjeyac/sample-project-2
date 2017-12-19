package eu.sanprojects.yanagaorders.web;

import eu.sanprojects.yanagaorders.service.ProductDto;
import eu.sanprojects.yanagaorders.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author sanjeya
 */
@Controller
public class ProductRestController {

    public static final String URL = "/v1/products";

    @Autowired
    private ProductService productService;

    @GetMapping(URL)
    public ResponseEntity getAll() {
        List<ProductDto> products = productService.getAll();
        if (products.isEmpty()) {
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(products);
        }
    }
    
    @PostMapping(URL)
    public ResponseEntity save(@RequestBody ProductDto product) {
        productService.saveNew(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }    
    
}
