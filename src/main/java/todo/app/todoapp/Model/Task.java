package todo.app.todoapp.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private String id;
    private String name;
    private String priority;
    private String status;
    private String dueDate;

}
