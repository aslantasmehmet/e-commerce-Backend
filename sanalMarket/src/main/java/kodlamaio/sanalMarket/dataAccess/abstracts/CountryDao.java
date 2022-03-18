package kodlamaio.sanalMarket.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.sanalMarket.entities.concretes.Country;

public interface CountryDao extends JpaRepository<Country, Integer> {
	

}
