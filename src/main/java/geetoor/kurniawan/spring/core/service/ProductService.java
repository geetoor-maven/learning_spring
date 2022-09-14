package geetoor.kurniawan.spring.core.service;

import geetoor.kurniawan.spring.core.repo.ProductRepo;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }
}
