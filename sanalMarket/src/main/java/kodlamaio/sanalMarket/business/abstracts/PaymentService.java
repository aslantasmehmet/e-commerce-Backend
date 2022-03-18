package kodlamaio.sanalMarket.business.abstracts;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.Payment;

public interface PaymentService {
	
	DataResult<Payment> getByOrderId (int orderId);

}
