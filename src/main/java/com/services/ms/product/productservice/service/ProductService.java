package com.services.ms.product.productservice.service;

import com.services.ms.product.productservice.model.dto.CreateProductRequest;
import com.services.ms.product.productservice.model.dto.ProductResponse;

import java.util.List;

public interface ProductService {

  ProductResponse findById(Long id);
  List<ProductResponse> findAll();
  List<ProductResponse> findAllByCategoryId(Long categoryId);
  ProductResponse save(CreateProductRequest request);
  ProductResponse update(Long id, CreateProductRequest request);
  void deleteById(Long id);

}
