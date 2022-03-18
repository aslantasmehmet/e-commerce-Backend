package kodlamaio.sanalMarket.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.sanalMarket.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {
	
		
	List<City> getByCountryId (int countryId);
}
