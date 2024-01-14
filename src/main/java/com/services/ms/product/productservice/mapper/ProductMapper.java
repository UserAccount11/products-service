package com.services.ms.product.productservice.mapper;

import com.services.ms.product.productservice.model.dto.ProductResponse;
import com.services.ms.product.productservice.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static com.services.ms.product.productservice.utils.Constants.ACTIVE_STATUS;
import static com.services.ms.product.productservice.utils.Constants.INACTIVE_STATUS;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface ProductMapper {

  @Mapping(target = "status", expression = "java(mapStatus(product))")
  ProductResponse toProductResponse(Product product);

  default String mapStatus(Product product) {
    return product.getStatus() ? ACTIVE_STATUS :  INACTIVE_STATUS;
  }

}
