package com.homeword.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeword.crud.inter.inter;
import com.homeword.crud.interService.interfaceService;
import com.homeword.crud.model.Person;

@Service
public class service implements interfaceService {
	@Autowired
	private inter data;
	@Override
	public List<Person> list() {
		return (List<Person>)data.findAll();
	}

	@Override
	public Optional<Person> listPersonById(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Person p) {
		int res=0;
		Person person = data.save(p);
		if(!person.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
}