package kodlamaio.sanalMarket.core.utilities.service;

public class NationalityIdValidation {
	
	public static boolean isRealPerson(String nationalityId) {	
		return FakeMernis.validate(nationalityId);
	}

}
