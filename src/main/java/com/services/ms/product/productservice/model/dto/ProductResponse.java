package com.services.ms.product.productservice.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class ProductResponse {

  private Long id;
  private String name;
  private String description;
  private BigDecimal price;
  private CategoryResponse category;
  private String status;

}
