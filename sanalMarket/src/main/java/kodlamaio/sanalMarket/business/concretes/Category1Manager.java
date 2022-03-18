package kodlamaio.sanalMarket.business.concretes;


import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.Category1Service;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.Category1Dao;
import kodlamaio.sanalMarket.entities.concretes.Category1;

@Service
public class Category1Manager implements Category1Service{

	private Category1Dao category1Dao;

	public Category1Manager(Category1Dao category1Dao) {
		super();
		this.category1Dao = category1Dao;
	}

	@Override
	public DataResult<List<Category1>> getAll() {
		return new SuccessDataResult<List<Category1>>(this.category1Dao.findAll(),"Kategorileri Getirme İşlemi Başarılı");
	}

	@Override
	public DataResult<Category1> getById(int id) {
		return new SuccessDataResult<Category1>(this.category1Dao.getById(id));
	}

	@Override
	public Result add(Category1 category1) {
		this.category1Dao.save(category1);
		return new SuccessResult("Kategori ekleme işlemi başarılı");
	}

	@Override
	public Result delete(int id) {
		this.category1Dao.deleteById(id);
		return new SuccessResult("Kategori silme işlemi başarılı");
	};


}
