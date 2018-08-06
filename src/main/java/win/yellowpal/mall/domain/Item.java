package win.yellowpal.mall.domain;

/**
 * 商品
 * @author Yellow
 *
 */
public class Item {
	
	private long id;
	
	private String name;
	
	private long stock;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}
	
	
}
