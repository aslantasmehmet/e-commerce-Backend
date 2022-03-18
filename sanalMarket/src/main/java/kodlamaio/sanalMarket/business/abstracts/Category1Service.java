package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.entities.concretes.Category1;

public interface Category1Service {
	
	Result add (Category1 category1);
	
	Result delete (int id);
	
	DataResult<List<Category1>> getAll();
	
	DataResult <Category1> getById(int id);

}
