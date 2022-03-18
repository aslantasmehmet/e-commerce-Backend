package kodlamaio.sanalMarket.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.sanalMarket.business.abstracts.CityService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.City;


@RestController
@RequestMapping("/api/cities/")
@CrossOrigin
public class CitiesController {
	
	private CityService cityService;

	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("getbycountry")
	public DataResult<List<City>> getByCountry(int countryId) {
		return this.cityService.getByCountryId(countryId);
	}

}
