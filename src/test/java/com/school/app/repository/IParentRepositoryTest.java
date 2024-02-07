package com.school.app.repository;

import com.school.app.model.Parent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class IParentRepositoryTest {

  @Autowired IParentRepository parentRepository;

  @Test
  void testFindById() {
    Optional<Parent> parentOptional = parentRepository.findById(3L);

    assertNotNull(parentOptional);
    assertTrue(parentOptional.isPresent());
    assertEquals("Marcela", parentOptional.orElseThrow().getName());
    assertEquals("López", parentOptional.orElseThrow().getLastName());
  }

  @Test
  void testFindByIdError() {
    Optional<Parent> parentOptional = parentRepository.findById(100L);

    assertFalse(parentOptional.isPresent());
    assertTrue(parentOptional.isEmpty());
    assertNotNull(parentOptional);
  }
}
