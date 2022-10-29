package kodlama.io.kodlama.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageServis {
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
}
