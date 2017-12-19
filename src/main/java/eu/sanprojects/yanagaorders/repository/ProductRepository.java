package eu.sanprojects.yanagaorders.repository;

import eu.sanprojects.yanagaorders.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sanjeya
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
}
