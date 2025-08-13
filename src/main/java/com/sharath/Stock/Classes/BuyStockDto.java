package com.sharath.Stock.Classes;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BuyStockDto {


	private Integer id;

	private String symbol;

	private Integer quantity;


	private Double totalPrice;

	private Integer userId;


	private LocalDateTime createTime;

	private String status;
}



