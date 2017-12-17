package pl.dzmats.sales;

import java.math.BigDecimal;

public class Product {
	private Long idProduct;
	private String name;
	private String description;
	private BigDecimal price;

	//private final Integer stockQty;

	public Product(Long idProduct, BigDecimal price, String description, String name) {
		//this.stockQty = stockQty;
		this.idProduct = idProduct;
		this.price = price;
		this.description = description;
		this.name = name;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

//	public Product(String name) {
//		this.stockQty = 0;
//	}

//	public boolean isInStock() {
//		return stockQty > 0;
//	}
}

