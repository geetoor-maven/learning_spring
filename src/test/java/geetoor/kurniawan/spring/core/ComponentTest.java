package geetoor.kurniawan.spring.core;

import geetoor.kurniawan.spring.core.repo.CategoryRepo;
import geetoor.kurniawan.spring.core.repo.ProductRepo;
import geetoor.kurniawan.spring.core.service.CategoryService;
import geetoor.kurniawan.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService",ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInject() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepo productRepo = applicationContext.getBean(ProductRepo.class);

        Assertions.assertSame(productService.getProductRepo(), productRepo);
    }

    @Test
    void testSetterDependencyInject() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepo categoryRepo = applicationContext.getBean(CategoryRepo.class);

        Assertions.assertSame(categoryRepo, categoryService.getCategoryRepo());
    }
}
