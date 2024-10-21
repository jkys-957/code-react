package me.jkys.mallapi.service;

import me.jkys.mallapi.dto.PageRequestDTO;
import me.jkys.mallapi.dto.PageResponseDTO;
import me.jkys.mallapi.dto.TodoDTO;

public interface TodoService {

  Long register(TodoDTO todoDTO);

  TodoDTO get(Long tno);

  void modify(TodoDTO todoDTO);

  void remove(Long tno);

  PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);
}
