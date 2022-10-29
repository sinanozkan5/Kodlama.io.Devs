package kodlama.io.kodlama.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.kodlama.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.entities.concretes.ProgrammingLanguage;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguage> languages;
	
	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"Python"));
		languages.add(new ProgrammingLanguage(2,"C#"));
		languages.add(new ProgrammingLanguage(3,"Java"));
		languages.add(new ProgrammingLanguage(4,"Html"));
		languages.add(new ProgrammingLanguage(5,"Css"));
		languages.add(new ProgrammingLanguage(6,"JavaScript"));
	}
	
	
	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		languages.remove(programmingLanguage.getId() -1 );
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage){
		for (ProgrammingLanguage language : languages) {
			if (language.getId() == programmingLanguage.getId()) {
				language.setName(programmingLanguage.getName());
			}
		}
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		ProgrammingLanguage proglan = null;
		for(ProgrammingLanguage language : languages ) {
			if(language.getId() == id) {
				proglan = language;
			}
		}
		return proglan;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}

}
