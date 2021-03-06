package kodlamaio.sanalMarket.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.sanalMarket.business.abstracts.CountryService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.Country;

@RestController
@RequestMapping("/api/countries/")
@CrossOrigin
public class CountriesController {
	
	private CountryService countryService;

	public CountriesController(CountryService countryService) {
		super();
		this.countryService = countryService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Country>> getAll() {
		return this.countryService.getAll();
	}

}
