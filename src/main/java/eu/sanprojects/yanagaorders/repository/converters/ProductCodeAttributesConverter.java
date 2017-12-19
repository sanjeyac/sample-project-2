package eu.sanprojects.yanagaorders.repository.converters;

import eu.sanprojects.yanagaorders.domain.OrderNumber;
import eu.sanprojects.yanagaorders.domain.ProductCode;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author sanjeya
 */
@Converter(autoApply = true)
public class ProductCodeAttributesConverter implements AttributeConverter<ProductCode, Integer>{

    @Override
    public Integer convertToDatabaseColumn(ProductCode code) {
        if (code == null ){
            return null;
        }
        return code.toInteger();
    }

    @Override
    public ProductCode convertToEntityAttribute(Integer value) {
        if ( value == null ){
            return null;
        }
        return ProductCode.of(value);
    }
    
}
