package eu.sanprojects.yanagaorders.domain;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String description;

    ProductCode code;

    private Product(ProductCode code, String description) {
        this.description = description;
        this.code = code;
    }

    public static Product of(ProductCode code, String description) {
        return new Product(code, description);
    }

    public String getDescription() {
        return description;
    }

    public ProductCode getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }
    
    private Product(){} //default constructor used by hibernate
    
}
