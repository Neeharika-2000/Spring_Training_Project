package com.knf.dev.request;

import com.knf.dev.models.Product;
import com.knf.dev.models.Product2;
import com.knf.dev.repository.Product2Repository;
import com.knf.dev.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

        import com.knf.dev.models.Product;
        import com.knf.dev.repository.ProductRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
@Service
public class Product2Service {
    @Autowired
    private  final Product2Repository repository;

    public Product2Service(  Product2Repository repository) {
        this.repository = repository;
    }
    public void addProduct2(Product2 data)
    {
        repository.save(data);
    }

    public Product2 product2byid(long Id)
    {

        return repository.findById(Id).get();
    }
    public void  delete2byid(long id)
    {
        repository.deleteById(id);
    }
    public Product2 update2byid(long id, Product2 update2byid)
    {
        update2byid.setId(id);
        return repository.save(update2byid);

    }

    public List<Product2> getProduct2List() {
        return repository.findAll();
    }
}
