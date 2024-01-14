package com.services.ms.product.productservice.mapper;

import com.services.ms.product.productservice.model.dto.CategoryResponse;
import com.services.ms.product.productservice.model.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

  CategoryResponse toCategoryResponse(Category category);

}
