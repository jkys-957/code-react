package me.jkys.mallapi.service;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;
import me.jkys.mallapi.dto.TodoDTO;

@SpringBootTest
@Log4j2
public class TodoServiceTests {

  @Autowired
  private TodoService todoService;

  @Test
  public void testRegister() {
    TodoDTO todoDTO = TodoDTO.builder()
      .title("서비스 테스트")
      .writer("tester")
      .dueDate(LocalDate.of(2024, 10, 21))
      .build();

      Long tno = todoService.register(todoDTO);

      log.info("TNO: " + tno);
  }

  @Test
  public void testGet() {
    Long tno = 301L;

    TodoDTO todoDTO = todoService.get(tno);

    log.info(todoDTO);
  }
}
