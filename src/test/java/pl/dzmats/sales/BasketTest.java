package pl.dzmats.sales;

import org.junit.Test;
import org.junit.Assert;
import dao.ProductDao;
import service.BasketServiceImp;
import util.IdGenerator;

import java.math.BigDecimal;

public class BasketTest {

	ProductDao productDao;
	@Test
	public void itAllowAddProductToBasket() {

		Product product1 = new Product(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(12.22),"Do słuchania", "odtwarzacz");
		Basket basket1 = new Basket(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(220.40));
		BasketServiceImp basket = new BasketServiceImp();
		BasketItem lineItem = new BasketItem(product1, 2, BigDecimal.valueOf(12.22));
		Integer q = lineItem.getQuantity();
		basket.add(basket1.getIdBasket(),product1.getIdProduct());
		Assert.assertFalse(basket.isEmpty());


//		Product product1 = new Product("lego 9293");
//		Basket basket = new Basket();
//
//		basket.add(product1);
//
//		Assert.assertFalse(basket.isEmpty());
	}

	@Test
	public void itAllowAddMultipleProduct() {
		Product product1 = new Product(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(12.22),"Do słuchania", "odtwarzacz");
		Product product2 = new Product(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(32.33),"Do pisania prac", "długopis");
		Product product3 = new Product(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(102.54),"Do oglądania programów", "telewizor");
		//Product product1 = new Product("lego 9293");
		//Product product2 = new Product("lego 1311");
		//Product product3 = new Product("lego 1312");

		Basket basket1 = new Basket(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(220.40));
		BasketServiceImp basketS1 = new BasketServiceImp();
		BasketItem lineItem1 = new BasketItem(product1, 2, BigDecimal.valueOf(12.22));
		Integer q1 = lineItem1.getQuantity();
		Basket basket2 = new Basket(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(220.40));
		BasketServiceImp basketS2 = new BasketServiceImp();
		BasketItem lineItem2 = new BasketItem(product2, 2, BigDecimal.valueOf(12.22));
		Integer q2 = lineItem2.getQuantity();
		Basket basket3 = new Basket(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(220.40));
		BasketServiceImp basketS3 = new BasketServiceImp();
		BasketItem lineItem3 = new BasketItem(product3, 2, BigDecimal.valueOf(12.22));
		Integer q3 = lineItem3.getQuantity();
		//Basket basket = new Basket();

		basketS1.add(basket1.getIdBasket(),product1.getIdProduct());
		basketS2.add(basket2.getIdBasket(),product2.getIdProduct());
		basketS3.add(basket3.getIdBasket(),product3.getIdProduct());
		//basket.add(product1);
		//basket.add(product2);
		//basket.add(product3);

		Assert.assertEquals(
				3,
				(int)basketS1.productsCount()
		);

		/*Assert.assertEquals(
				3,
				(int)basket.productsCount()
				);
				*/
	}

	@Test
	public void itAllowAddMultipleProductSameType() {
		Product product1 = new Product(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(12.22),"Do słuchania", "odtwarzacz");
		//Product product1 = new Product("lego 9293");

		Basket basket1 = new Basket(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(220.40));
		BasketServiceImp basketS1 = new BasketServiceImp();
		BasketItem lineItem1 = new BasketItem(product1, 2, BigDecimal.valueOf(12.22));
		Integer q1 = lineItem1.getQuantity();
		///////////Basket basket = new Basket();

		basketS1.add(basket1.getIdBasket(),product1.getIdProduct());
		//basket.add(product1);
		//basket.add(product1);
		//basket.add(product1);

		Assert.assertEquals(1, (int)basketS1.productsCount());
	}

	@Test
	public void itCouldBeEmpty() {
		Basket basket = new Basket(IdGenerator.getnextAvailLongId(), BigDecimal.valueOf(220.40));
		Assert.assertTrue(basket.isEmpty());
	}
}
