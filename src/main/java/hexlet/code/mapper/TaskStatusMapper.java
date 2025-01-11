package hexlet.code.mapper;

import hexlet.code.dto.TaskStatus.TaskStatusCreateDTO;
import hexlet.code.dto.TaskStatus.TaskStatusDTO;
import hexlet.code.dto.TaskStatus.TaskStatusUpdateDTO;
import hexlet.code.model.TaskStatus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

//import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        uses = {JsonNullableMapper.class, ReferenceMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)

public abstract class TaskStatusMapper {

    // @Mapping(target = "author", source = "authorId")
//    public abstract TaskStatus map(TaskStatusCreateDTO dto);
//
//    //@Mapping(source = "author.id", target = "authorId")
//    public abstract TaskStatusDTO map(TaskStatus model);
//
//    //@Mapping(source = "authorId", target = "author.id")
//    public abstract TaskStatus map(TaskStatusDTO model);
//
//    public abstract void update(TaskStatusUpdateDTO dto, @MappingTarget TaskStatus model);

    public abstract TaskStatus map(TaskStatusCreateDTO taskStatusCreateDTO);

    public abstract TaskStatusDTO map(TaskStatus taskStatus);

    public abstract void update(TaskStatusUpdateDTO taskStatusUpdateDTO, @MappingTarget TaskStatus taskStatus);
}