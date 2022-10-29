package kodlama.io.kodlama.webApi.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import kodlama.io.kodlama.entities.concretes.ProgrammingLanguage;
import kodlama.io.kodlama.business.abstracts.ProgrammingLanguageServis;

public class ProgrammingLanguagesController {
	private ProgrammingLanguageServis programmingLanguagesService;
	
	@Autowired
	public ProgrammingLanguagesController (ProgrammingLanguageServis programmingLanguageServis) {
		this.programmingLanguagesService = programmingLanguageServis;
	}
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguagesService.add(programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguagesService.delete(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguagesService.add(programmingLanguage);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguagesService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return programmingLanguagesService.getById(id);
	}
}
