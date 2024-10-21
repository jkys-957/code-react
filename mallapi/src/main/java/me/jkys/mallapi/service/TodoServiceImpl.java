package me.jkys.mallapi.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import me.jkys.mallapi.dto.TodoDTO;

@Service
@Transactional
@Log4j2
public class TodoServiceImpl implements TodoService {
  @Override
  public Long register(TodoDTO todoDTO) {
      log.info("......");
    return null;
  }
  
}
