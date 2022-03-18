package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.entities.concretes.Order;

public interface OrderService {
	
Result add(Order order);
	
	Result wasDelivered(int id);
	
	DataResult<Order> getById(int id);
	
	DataResult<List<Order>> getByUserId (int userId);
	
	DataResult<List<Order>> getByIsDeliveredIsTrue();
	
	DataResult<List<Order>> getByIsDeliveredIsFalse();


}
