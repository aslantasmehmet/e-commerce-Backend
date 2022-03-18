package kodlamaio.sanalMarket.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.sanalMarket.business.abstracts.TownService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.Town;

@RestController
@RequestMapping("/api/towns/")
@CrossOrigin
public class TownsController {

	private TownService townService;

	public TownsController(TownService townService) {
		super();
		this.townService = townService;
	}
	
	@GetMapping("getbycity")
	public DataResult<List<Town>> getByCity(int cityId) {
		return this.townService.getByCityId(cityId);
	}
}
