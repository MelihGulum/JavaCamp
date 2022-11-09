package spring.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.kodlama.io.Devs.business.abstracts.LanguageService;
import spring.kodlama.io.Devs.business.request.LanguageRequests.CreateLanguageRequest;
import spring.kodlama.io.Devs.business.request.LanguageRequests.DeleteLanguageRequest;
import spring.kodlama.io.Devs.business.request.LanguageRequests.UpdateLanguageRequest;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetAllLanguagesResponse;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetByIdLanguageResponse;
import spring.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import spring.kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}
	
    

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languageResponse = new ArrayList<GetAllLanguagesResponse>();
		
		for (GetAllLanguagesResponse getAllLanguagesResponse : languageResponse) {
			
			GetAllLanguagesResponse languageItem = new GetAllLanguagesResponse();
			
			languageItem.setId(getAllLanguagesResponse.getId());
			languageItem.setName(getAllLanguagesResponse.getName());
		}
		return languageResponse;
	}

	@Override
	public GetByIdLanguageResponse getById(int id) {
		
		Language language = languageRepository.getReferenceById(id);
		
		GetByIdLanguageResponse languageResponse = new GetByIdLanguageResponse();
		languageResponse.setId(language.getId());
		languageResponse.setName(language.getName());
		
		return languageResponse;
		
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		
		List<Language> languages = languageRepository.findAll();
		
		for (Language language : languages) {
			if (createLanguageRequest.getName().equals(language.getName())) {
				System.out.println(createLanguageRequest.getName() +" Bu programlama dili zaten mevcut.");
				return;
			}
		}
		
		if (createLanguageRequest.getName().equals("")) {
			System.out.println("Programlama dili boş geçilemez!");
		}
		
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		
		this.languageRepository.save(language);
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		
		Language language = new Language();
		
		language.setId(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		
		languageRepository.deleteById(deleteLanguageRequest.getId());
	}



}