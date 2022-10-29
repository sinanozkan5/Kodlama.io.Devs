package kodlama.io.kodlama.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.business.abstracts.ProgrammingLanguageServis;
import kodlama.io.kodlama.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageServis{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager (ProgrammingLanguageManager programmingLanguagesManager, ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		for (ProgrammingLanguage language : this.programmingLanguageRepository.getAll()) {
			if (language.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isimde programlama dili var.");
			}
		}
		
		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
			programmingLanguageRepository.delete(programmingLanguage);

	}


	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
			programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}
	
}
