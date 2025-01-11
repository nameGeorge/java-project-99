package hexlet.code.specification;

import hexlet.code.dto.Task.TaskParamsDTO;
import hexlet.code.model.Task;
import hexlet.code.repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.data.jpa.domain.Specification;

@Component
public class TaskSpecification {
    @Autowired
    private LabelRepository labelRepository;

    public Specification<Task> build(TaskParamsDTO params) {
        return withTitleCont(params.getTitleCont())
                .and(withAssigneeId(params.getAssigneeId()))
                .and(withStatus(params.getStatus()))
                .and(withLabelId(params.getLabelId()));
    }

    private Specification<Task> withTitleCont(String titleCont) {
        return (root, query, cb) ->
                titleCont == null ? cb.conjunction() : cb.like(cb.lower(root.get("name")),
                        "%" + titleCont.toLowerCase() + "%");
    }

    private Specification<Task> withAssigneeId(Long assigneeId) {
        return (root, query, cb) ->
                assigneeId == null ? cb.conjunction() : cb.equal(root.get("assignee").get("id"), assigneeId);
    }

    private Specification<Task> withStatus(String status) {
        return (root, query, cb) ->
                status == null ? cb.conjunction() : cb.equal(root.get("taskStatus").get("slug"), status);
    }

    private Specification<Task> withLabelId(Long labelId) {
        return (root, query, cb) -> labelId == null
                ? cb.conjunction() : cb.equal(root.get("labels").get("id"), labelId);
    }
}
