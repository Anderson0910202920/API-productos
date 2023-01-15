package facturation.product.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired ProductRepository productRepository;

    public Product save(Product entity){
        return productRepository.save(entity);
    }

    public Product findById( Long id){
        return productRepository.findById(id).orElse(new Product());
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
