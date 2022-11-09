package spring.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.kodlama.io.Devs.business.abstracts.LanguageService;
import spring.kodlama.io.Devs.business.abstracts.LanguageTechnologyService;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.CreateLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.DeleteLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.UpdateLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetByIdLanguageResponse;
import spring.kodlama.io.Devs.business.response.LanguageTechnologyResponse.GetAllLanguageTechnologyResponse;
import spring.kodlama.io.Devs.business.response.LanguageTechnologyResponse.GetByIdLanguageTechnologyResponse;
import spring.kodlama.io.Devs.dataAccess.abstracts.LanguageTechnologyRepository;
import spring.kodlama.io.Devs.entities.concretes.Language;
import spring.kodlama.io.Devs.entities.concretes.LanguageTechnology;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {

	
	private LanguageService languageService;
	private LanguageTechnologyRepository languageTechnologyRepository;
			

	public LanguageTechnologyManager(LanguageService languageService,
			LanguageTechnologyRepository languageTechnologyRepository) {
		super();
		this.languageService = languageService;
		this.languageTechnologyRepository = languageTechnologyRepository;
	}

	@Override
	public List<GetAllLanguageTechnologyResponse> getAll() {
		
		List<LanguageTechnology> languageTechnologies = languageTechnologyRepository.findAll();
		
		List<GetAllLanguageTechnologyResponse> getAllLanguageTechnologyResponses = new ArrayList<GetAllLanguageTechnologyResponse>();
		
		for (LanguageTechnology languageTechnology : languageTechnologies) {
			GetAllLanguageTechnologyResponse languageTechnologyItem = new GetAllLanguageTechnologyResponse();
			languageTechnologyItem.setId(languageTechnology.getId());
			languageTechnologyItem.setName(languageTechnology.getName());
			getAllLanguageTechnologyResponses.add(languageTechnologyItem);
		}
		
		return getAllLanguageTechnologyResponses;
	}

	@Override
	public GetByIdLanguageTechnologyResponse getById(int id) {
		LanguageTechnology languageTechnology = languageTechnologyRepository.getReferenceById(id);
		GetByIdLanguageTechnologyResponse languageTechnologyItem = new GetByIdLanguageTechnologyResponse();
		
		languageTechnologyItem.setId(languageTechnology.getId());
		languageTechnologyItem.setName(languageTechnology.getName());
		
		return languageTechnologyItem;
	}

	@Override
	public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		LanguageTechnology languageTechnology = new LanguageTechnology();
		Language language = new Language();
		
		GetByIdLanguageResponse getByIdLanguageResponse = languageService.getById(createLanguageTechnologyRequest.getLanguageId());
		language.setId(getByIdLanguageResponse.getId());
		language.setName(getByIdLanguageResponse.getName());
		
		languageTechnology.setName(createLanguageTechnologyRequest.getName());
		languageTechnology.setLanguage(language);
		
		languageTechnologyRepository.save(languageTechnology);
		
	}

	@Override
	public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {
		LanguageTechnology languageTechnology = new LanguageTechnology();
		Language language = new Language();
		
		GetByIdLanguageResponse getByIdLanguageResponse = languageService.getById(updateLanguageTechnologyRequest.getLanguageId());
		language.setId(getByIdLanguageResponse.getId());
		language.setName(getByIdLanguageResponse.getName());
		
		languageTechnology.setName(updateLanguageTechnologyRequest.getName());
		languageTechnology.setId(updateLanguageTechnologyRequest.getId());
		languageTechnology.setLanguage(language);
		
		languageTechnologyRepository.save(languageTechnology);
		
	}

	@Override
	public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) {
		
		languageTechnologyRepository.deleteById(deleteLanguageTechnologyRequest.getId());
	}




}
