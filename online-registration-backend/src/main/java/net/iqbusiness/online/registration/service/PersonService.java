package net.iqbusiness.online.registration.service;

import net.iqbusiness.online.registration.dto.RegistrationForm;
import net.iqbusiness.online.registration.model.IqPerson;
import net.iqbusiness.online.registration.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public IqPerson register(RegistrationForm form) {
        if (StringUtils.isEmpty(form.getFullName())) {
            throw new IllegalArgumentException("full name is invalid");
        }

        if (StringUtils.isEmpty(form.getIdNumber())) {
            throw new IllegalArgumentException("Id number is invalid");
        }

        IqPerson person = new IqPerson();
        person.setFullName(form.getFullName());
        person.setIdNumber(form.getIdNumber());
        person.setTelephoneNumber(form.getTelephoneNumber());
        return personRepository.save(person);
    }
}
