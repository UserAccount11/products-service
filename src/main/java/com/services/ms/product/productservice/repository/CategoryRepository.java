package com.services.ms.product.productservice.repository;

import com.services.ms.product.productservice.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
