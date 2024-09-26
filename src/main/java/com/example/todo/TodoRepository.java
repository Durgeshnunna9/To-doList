
package com.example.todo;

import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodo();

    Todo getTodoById(int todoId);

    Todo addTodo(Todo todo);

    Todo updateTodo(int TodoId, Todo todo);

    void deleteTodo(int TodoId);
}