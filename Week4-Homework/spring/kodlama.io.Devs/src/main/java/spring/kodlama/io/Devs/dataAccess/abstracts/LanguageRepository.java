package spring.kodlama.io.Devs.dataAccess.abstracts;


import java.util.List;

import spring.kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll(); 
	Language getById(int id);  
	void insertLanguage(Language language); 
	void deleteLanguage(Language language); 
	void updateLanguage(Language language,String newName); 
}
