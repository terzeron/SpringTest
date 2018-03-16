package net.terzeron.spring.resourceloading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ProductService {
    @Autowired
    private ResourceLoader resourceLoader;

    public Resource getResource(String location) {
        return resourceLoader.getResource(location);
    }
}
