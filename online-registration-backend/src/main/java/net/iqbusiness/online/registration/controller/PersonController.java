package net.iqbusiness.online.registration.controller;

import net.iqbusiness.online.registration.dto.RegistrationForm;
import net.iqbusiness.online.registration.dto.RegistrationResponse;
import net.iqbusiness.online.registration.model.IqPerson;
import net.iqbusiness.online.registration.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/persons"})
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public RegistrationResponse register(@RequestBody RegistrationForm form) {
        IqPerson person = personService.register(form);
        RegistrationResponse response = new RegistrationResponse();
        response.setId(person.getId());
        response.setSuccess(true);
        return response;
    }
}