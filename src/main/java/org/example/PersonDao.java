package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Integer> {

}
