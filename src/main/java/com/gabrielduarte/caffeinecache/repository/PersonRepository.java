package com.gabrielduarte.caffeinecache.repository;

import com.gabrielduarte.caffeinecache.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
