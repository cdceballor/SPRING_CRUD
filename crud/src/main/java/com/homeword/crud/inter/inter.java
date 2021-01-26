package com.homeword.crud.inter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homeword.crud.model.Person;

@Repository
public interface inter extends CrudRepository <Person, Integer>{

}
