package eu.sanprojects.yanagaorders.service;

import com.google.common.base.Preconditions;
import eu.sanprojects.yanagaorders.domain.Product;
import eu.sanprojects.yanagaorders.repository.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanjeya
 */
@Service
public class ProductService {
    
    @Autowired
    ProductRepository repository;
            
    public List<ProductDto> getAll(){
        return repository.findAll()
                .stream().map( product -> ProductAdapter.toDto(product) ) 
                .collect(Collectors.toList());
    }
    
    public void saveNew(ProductDto dto){
        Preconditions.checkNotNull(dto,"Trying to save a null product");
        Product product = ProductAdapter.toEntity(dto);
        repository.save(product);
    }    
    
}
