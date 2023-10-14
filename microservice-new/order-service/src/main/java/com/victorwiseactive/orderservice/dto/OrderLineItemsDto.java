package com.victorwiseactive.orderservice.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link com.victorwiseactive.orderservice.model.OrderLineItems} entity
 */
@Data
public class OrderLineItemsDto implements Serializable {
    private final Long id;
    private final String skuCode;
    private final BigDecimal price;
    private final Integer quantity;
}