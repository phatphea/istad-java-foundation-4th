package todolist;

import java.util.List;

public interface TodoManagerServices {

    boolean addTask(String title, String description);

    List<Task> viewAllTasks();

    boolean markTaskAsCompleted(Long id);

    boolean deleteTask(Long id);


}
