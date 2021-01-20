package net.iqbusiness.online.registration.repository;

import net.iqbusiness.online.registration.model.IqPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<IqPerson, Long> {
}