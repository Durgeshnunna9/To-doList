package com.example.todo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;

import com.example.todo.TodoService;

@RestController
public class TodoController {
  TodoService todoService = new TodoService();

  @GetMapping("/todos")
  public ArrayList<Todo> getTodo() {
    return todoService.getTodo();
  }

  @GetMapping("/todos/{todoId}")
  public Todo getTodoById(@PathVariable("todoId") int todoId) {
    return todoService.getTodoById(todoId);
  }

  @PostMapping("/todos")
  public Todo addTodo(@RequestBody Todo todo) {
    return todoService.addTodo(todo);
  }

  @PutMapping("/todos/{todoId}")
  public Todo getTodoById(@PathVariable("todoId") int todoId, @RequestBody Todo todo) {
    return todoService.updateTodo(todoId, todo);
  }

  @DeleteMapping("/todos/{todoId}")
  public void deleteTodo(@PathVariable("todoId") int todoId) {
    todoService.deleteTodo(todoId);
  }
}