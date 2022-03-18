package kodlamaio.sanalMarket.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.sanalMarket.entities.concretes.Town;

public interface TownDao extends JpaRepository<Town, Integer> {
	
	List<Town> getByCityId (int cityId);

}
