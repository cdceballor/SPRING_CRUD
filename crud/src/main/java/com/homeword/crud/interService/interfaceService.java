package com.homeword.crud.interService;
import java.util.List;
import java.util.Optional;

import com.homeword.crud.model.Person;

public interface interfaceService {
	public List<Person> list();
	public Optional<Person>listPersonById(int id);
	public int save(Person person);
	public void delete(int id);
}
