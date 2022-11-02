package spring.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.kodlama.io.Devs.business.abstracts.LanguageService;
import spring.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import spring.kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public String insert(Language language) {
		if(this.checkName(language.getName())) return "A language with this name already exists.";
		
		if(language.getName().isBlank()|| language.getName().isEmpty()) return "Name field cannot be empty.";
		
		this.languageRepository.insertLanguage(language);
		return "Language successfully added.";
	}

	@Override
	public String update(Language language) {
		
		if(this.checkName(language.getName())) 
			return "A language with the name you want to update already exists.";
		
		if(language.getName().isBlank()|| language.getName().isEmpty()) 
			return "Name field to be updated cannot be empty.";
		
		this.languageRepository.updateLanguage(language,language.getName());
		return "Successful";
	}

	@Override
	public List<Language> getAll() {
		return this.languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return this.languageRepository.getById(id);
	}

	@Override
	public void delete(Language language) {
		languageRepository.deleteLanguage(language);
	}
	
	private boolean checkName(String languageName) {
		List<Language> languages = this.languageRepository.getAll();
		boolean result = false;
		
		for(Language language:languages) {
			if(language.getName().equalsIgnoreCase(languageName)) {
				result = true;
			}
		}
		return result;
	}
}