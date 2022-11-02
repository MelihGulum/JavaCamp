package spring.kodlama.io.Devs.business.abstracts;

import java.util.List;

import spring.kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	
	String insert(Language language);
	String update(Language language);
	List<Language> getAll();
	Language getById(int id);
	void delete(Language language);
	
}