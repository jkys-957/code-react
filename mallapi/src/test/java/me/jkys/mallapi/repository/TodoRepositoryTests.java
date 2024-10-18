package me.jkys.mallapi.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;

import lombok.extern.log4j.Log4j2;
import me.jkys.mallapi.domain.Todo;

@SpringBootTest
@Log4j2
public class TodoRepositoryTests {

  @Autowired
  private TodoRepository todoRepository;

  @Test
  public void testInsert() {
    for (int i = 1; i <= 100; i++){
      Todo todo = Todo.builder()
      .title("Title..." + i)
      .dueDate(LocalDate.of(2023,12,31))
      .writer("user00")
      .build();

      todoRepository.save(todo);
    }
  }
}
