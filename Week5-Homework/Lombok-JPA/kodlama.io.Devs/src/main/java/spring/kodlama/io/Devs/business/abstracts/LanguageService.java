package spring.kodlama.io.Devs.business.abstracts;

import java.util.List;

import spring.kodlama.io.Devs.business.request.LanguageRequests.CreateLanguageRequest;
import spring.kodlama.io.Devs.business.request.LanguageRequests.DeleteLanguageRequest;
import spring.kodlama.io.Devs.business.request.LanguageRequests.UpdateLanguageRequest;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetAllLanguagesResponse;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetByIdLanguageResponse;



public interface LanguageService {
	
	List<GetAllLanguagesResponse> getAll();
	GetByIdLanguageResponse getById(int id);
	void add(CreateLanguageRequest createLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest);
	void delete(DeleteLanguageRequest deleteLanguageRequest);
	
}