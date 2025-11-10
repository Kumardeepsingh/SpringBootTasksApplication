package com.kumar.tasks.controller;

import com.kumar.tasks.domain.dto.TaskListDto;
import com.kumar.tasks.domain.entities.TaskList;
import com.kumar.tasks.mappers.TaskListMapper;
import com.kumar.tasks.services.TaskListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/task-lists")
public class TaskListController {

    private final TaskListService taskListService;
    private final TaskListMapper taskListMapper;

    public TaskListController(TaskListService taskListService, TaskListMapper taskListMapper) {
        this.taskListService = taskListService;
        this.taskListMapper = taskListMapper;
    }

    @GetMapping
    public List<TaskListDto> listTaskLists(){
       return taskListService.listTaskLists()
               .stream()
               .map(taskListMapper::toDto)
               .toList();
    }

    @PostMapping
    public TaskListDto createTaskList(@RequestBody TaskListDto taskListDto){
        TaskList createdTaskList = taskListService.createTaskList(
                taskListMapper.fromDto(taskListDto)
        );
        return taskListMapper.toDto(createdTaskList);
    }

    @GetMapping(path = "/{task_list_id}")
    public Optional<TaskListDto> getTaskLlist(@PathVariable("task_list_id") UUID taskListId){
        return taskListService.getTaskList(taskListId).map(taskListMapper::toDto);
    }
}
