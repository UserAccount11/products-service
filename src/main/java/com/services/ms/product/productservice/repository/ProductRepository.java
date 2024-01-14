package com.services.ms.product.productservice.repository;

import com.services.ms.product.productservice.model.entity.Category;
import com.services.ms.product.productservice.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

  List<Product> findAllByCategory(Category category);

}
