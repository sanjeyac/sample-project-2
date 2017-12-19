package eu.sanprojects.yanagaorders.service;

import eu.sanprojects.yanagaorders.domain.Product;
import eu.sanprojects.yanagaorders.domain.ProductCode;

/**
 *
 * @author sanjeya
 */
public class ProductAdapter{
    
    
    public static ProductDto toDto(Product product){
        return ProductDto.of(product.getCode().toInteger(), product.getDescription());
    }
    
    public static Product toEntity(ProductDto product){
        ProductCode code = ProductCode.of(product.getCode());
        String description = product.getDescription();
        return Product.of(code,description);
    }
        
    
}
