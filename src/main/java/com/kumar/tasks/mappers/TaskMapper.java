package com.kumar.tasks.mappers;

import com.kumar.tasks.domain.dto.TaskDto;
import com.kumar.tasks.domain.entities.Task;

public interface TaskMapper {
   Task fromDto(TaskDto taskDto);
   TaskDto  toDto(Task task);
}
