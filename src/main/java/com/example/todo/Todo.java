package com.example.todo;

public class Todo {
    private int todoId;
    private String todoTask;
    private String priority;
    private String status;

    public Todo(int todoId, String todoTask, String priority, String status) {
        this.todoId = todoId;
        this.todoTask = todoTask;
        this.priority = priority;
        this.status = status;
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(String todoTask) {
        this.todoTask = todoTask;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}