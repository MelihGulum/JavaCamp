package spring.kodlama.io.Devs.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import spring.kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository  extends JpaRepository<Language, Integer> {
}
