package eu.sanprojects.yanagaorders.service;

/**
 *
 * @author sanjeya
 */
public class ProductDto {

    Long dbId;
    Integer code; // this should be integer because I bind it to a view
    String description;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private ProductDto() {
    }

    private ProductDto(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public static ProductDto of(Integer code, String description) {
        return new ProductDto(code, description);
    }    

}
