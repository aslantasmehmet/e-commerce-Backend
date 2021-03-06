package kodlamaio.sanalMarket.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.sanalMarket.business.abstracts.OrderDetailService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.OrderDetail;

@RestController
@RequestMapping("/api/orderdetails/")
@CrossOrigin
public class OrderDetailsController {
	
	private OrderDetailService orderDetailService;

	public OrderDetailsController(OrderDetailService orderDetailService) {
		super();
		this.orderDetailService = orderDetailService;
	};
	
	@GetMapping("getbyorderid")
	public DataResult<List<OrderDetail>> getByOrderId(int id){
		return this.orderDetailService.getByOrderId(id);
	}
}
