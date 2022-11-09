package spring.kodlama.io.Devs.business.abstracts;

import java.util.List;

import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.CreateLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.DeleteLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.UpdateLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.response.LanguageTechnologyResponse.GetAllLanguageTechnologyResponse;
import spring.kodlama.io.Devs.business.response.LanguageTechnologyResponse.GetByIdLanguageTechnologyResponse;

public interface LanguageTechnologyService {

	List<GetAllLanguageTechnologyResponse> getAll();
	
	GetByIdLanguageTechnologyResponse getById(int id);
	
	void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest);
	
	void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest);
	
	void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest);
}
