package com.kumar.tasks.mappers;

import com.kumar.tasks.domain.dto.TaskDto;
import com.kumar.tasks.domain.dto.TaskListDto;
import com.kumar.tasks.domain.entities.TaskList;

public interface TaskListMapper {
   TaskList fromDto(TaskListDto taskListDto);
  TaskListDto toDto(TaskList taskList);
}
