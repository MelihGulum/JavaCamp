package spring.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.kodlama.io.Devs.business.abstracts.LanguageTechnologyService;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.CreateLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.DeleteLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests.UpdateLanguageTechnologyRequest;
import spring.kodlama.io.Devs.business.response.LanguageTechnologyResponse.GetAllLanguageTechnologyResponse;
import spring.kodlama.io.Devs.business.response.LanguageTechnologyResponse.GetByIdLanguageTechnologyResponse;


@RestController
@RequestMapping("api/LanguageTechnologies")
public class LanguageTechnologyController {

	private LanguageTechnologyService languageTechnologyService;

	@Autowired
	public LanguageTechnologyController(
			LanguageTechnologyService languageTechnologyService) {
		super();
		this.languageTechnologyService = languageTechnologyService;
	}
	
	@PostMapping("/add")
    public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		languageTechnologyService.add(createLanguageTechnologyRequest);
    }

    @PutMapping("update")
    public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {
    	languageTechnologyService.update(updateLanguageTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void remove(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) {
    	languageTechnologyService.delete(deleteLanguageTechnologyRequest);
    }

    @GetMapping("/getAll")
    List<GetAllLanguageTechnologyResponse> getAll(){
    	return languageTechnologyService.getAll();
    }
    
    @GetMapping("getById")
    GetByIdLanguageTechnologyResponse getByIdLanguageTechnologyResponse(int id) {
        return languageTechnologyService.getById(id);
    }
	
	
	
}