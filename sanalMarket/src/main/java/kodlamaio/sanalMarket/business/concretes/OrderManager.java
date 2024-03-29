package kodlamaio.sanalMarket.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.OrderService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.CartDao;
import kodlamaio.sanalMarket.dataAccess.abstracts.OrderDao;
import kodlamaio.sanalMarket.dataAccess.abstracts.OrderDetailDao;
import kodlamaio.sanalMarket.entities.concretes.Order;
import kodlamaio.sanalMarket.entities.concretes.OrderDetail;
import kodlamaio.sanalMarket.entities.dtos.CartDto;

@Service
public class OrderManager implements OrderService {

	private OrderDao orderDao;
	private CartDao cartDao;
	private OrderDetailDao orderDetailDao;
 
	public OrderManager(OrderDao orderDao, CartDao cartDao, OrderDetailDao orderDetailDao) {
		super();
		this.orderDao = orderDao;
		this.cartDao = cartDao;
		this.orderDetailDao = orderDetailDao;
	}

	@Override
	public DataResult<List<Order>> getByUserId(int userId) {
		return new SuccessDataResult<List<Order>>(this.orderDao.getByUserId(userId));
	}

	@Override
	public Result add(Order order) {
		LocalDate now = LocalDate.now();
		CartDto cart= this.cartDao.getByUserIdTotalCartPrice(order.getUserId());
		
		order.setDate(now);
		order.setTotalPrice(cart.getTotalCartPrice());
		order.setDelivered(false);
		this.orderDao.save(order);
		
		var cartItems= this.cartDao.getAllByUserIdAndCartStatusIsTrue(order.getUserId());
		for (int i = 0; i < cartItems.stream().count() ; i++) {
			OrderDetail orderDetail = new OrderDetail();
			var item = cartItems.get(i).getItemId();
			orderDetail.setItemId(item);
			orderDetail.setOrderId(order.getId());
			orderDetail.setCount(cartItems.get(i).getCount());
			this.orderDetailDao.save(orderDetail);
		}
		for (int i = 0; i < cartItems.stream().count() ; i++) {
			cartItems.get(i).setCartStatus(false);
			this.cartDao.save(cartItems.get(i));
		}
		
		
		
		
		return new SuccessResult("Siparişiniz alındı.");
		
		
	}

	@Override
	public DataResult<List<Order>> getByIsDeliveredIsTrue() {
		return new SuccessDataResult<List<Order>>(this.orderDao.getByIsDeliveredIsTrueOrderByDateDesc());
	}

	@Override
	public DataResult<List<Order>> getByIsDeliveredIsFalse() {
		return new SuccessDataResult<List<Order>>(this.orderDao.getByIsDeliveredIsFalse());
	}

	@Override
	public DataResult<Order> getById(int id) {
		return new SuccessDataResult<Order>(this.orderDao.getById(id));
	}

	@Override
	public Result wasDelivered(int id) {
		Order order = this.orderDao.getById(id);
		order.setDelivered(true);
		this.orderDao.save(order);
		return new SuccessResult("Siparişin teslim edildiği kaydedildi.");
	}
 

}
