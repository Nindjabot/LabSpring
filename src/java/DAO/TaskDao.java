
package DAO;

import Model.Task;
import java.util.List;

public interface TaskDao {

    List<Task> listAllTasks();

    Task getTaskById(Integer taskId);

    Task addTask(Task task);

    boolean deleteTask(Task task);

    public boolean editTask(Task task);
}
