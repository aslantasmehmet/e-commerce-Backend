package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.OrderDetail;

public interface OrderDetailService {
	
	DataResult<List<OrderDetail>> getByOrderId (int orderId);

}
