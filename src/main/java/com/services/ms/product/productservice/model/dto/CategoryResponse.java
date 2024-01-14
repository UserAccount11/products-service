package com.services.ms.product.productservice.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryResponse {

  private Long id;
  private String name;

}
