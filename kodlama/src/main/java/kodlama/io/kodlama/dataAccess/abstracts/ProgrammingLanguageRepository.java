package kodlama.io.kodlama.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage programmingLanguage);
	void delete(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage);
	
	ProgrammingLanguage getById(int id);

	List<ProgrammingLanguage> getAll();
}
