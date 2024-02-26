package br.com.byteup.hellodocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.byteup.hellodocker.model.Person;
import br.com.byteup.hellodocker.repository.PersonRepository;

@RequestMapping("/docker")
@RestController
public class PersonController{

	@Autowired
	public PersonRepository personRepository;

    @PostMapping("/create")
    public Person savePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
