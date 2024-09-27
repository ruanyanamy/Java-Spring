package com.systex.eBiz.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:4200"})
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
