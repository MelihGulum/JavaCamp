package spring.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.kodlama.io.Devs.business.abstracts.LanguageService;
import spring.kodlama.io.Devs.business.request.LanguageRequests.CreateLanguageRequest;
import spring.kodlama.io.Devs.business.request.LanguageRequests.DeleteLanguageRequest;
import spring.kodlama.io.Devs.business.request.LanguageRequests.UpdateLanguageRequest;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetAllLanguagesResponse;
import spring.kodlama.io.Devs.business.response.LanguageResponse.GetByIdLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService lanuageService) {
		super();
		this.languageService = lanuageService;
	}
	
	
	@GetMapping("/getAll")
	public List<GetAllLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getById")
	public GetByIdLanguageResponse getById(int id){
		return languageService.getById(id);
	}
	
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest){
		languageService.add(createLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest){
	languageService.update(updateLanguageRequest);
	}
	
	@DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageService.delete(deleteLanguageRequest);
    }
	
}
