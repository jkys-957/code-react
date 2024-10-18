package me.jkys.mallapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.jkys.mallapi.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
