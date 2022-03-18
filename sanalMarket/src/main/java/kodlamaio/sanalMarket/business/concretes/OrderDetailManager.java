package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.OrderDetailService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.OrderDetailDao;
import kodlamaio.sanalMarket.entities.concretes.OrderDetail;

@Service
public class OrderDetailManager implements OrderDetailService {
	
	private OrderDetailDao orderDetailDao;

	public OrderDetailManager(OrderDetailDao orderDetailDao) {
		super();
		this.orderDetailDao = orderDetailDao;
	}

	@Override
	public DataResult<List<OrderDetail>> getByOrderId(int orderId) {
		return new SuccessDataResult<List<OrderDetail>>(this.orderDetailDao.getAllByOrderId(orderId));
	}

	

}
