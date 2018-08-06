package win.yellowpal.mall.domain;

import java.util.Date;

/**
 * 订单
 * @author Yellow
 *
 */
public class Order {
	
	
	private long id;
	
	private long userId;
	
	private long itemId;
	
	private long saleStock;
	
	private Date orderTime;
	
	private Date payTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getSaleStock() {
		return saleStock;
	}

	public void setSaleStock(long saleStock) {
		this.saleStock = saleStock;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
}
