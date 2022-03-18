package kodlamaio.sanalMarket.business.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.PaymentService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.PaymentDao;
import kodlamaio.sanalMarket.entities.concretes.Payment;

@Service
public class PaymentManager implements PaymentService{
	

	private PaymentDao paymentDao;

	public PaymentManager(PaymentDao paymentDao) {
		super();
		this.paymentDao = paymentDao;
	}

	@Override
	public DataResult<Payment> getByOrderId(int orderId) {
		return new SuccessDataResult<Payment>(this.paymentDao.getByOrderId(orderId));
	}

	
}
