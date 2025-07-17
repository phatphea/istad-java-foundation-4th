package todolist;

import collectionframeworks.pms.Product;

import java.util.ArrayList;
import java.util.List;

public class TodoManagerImpl implements TodoManagerServices{

    List<Task> tasks = new ArrayList<>();

    @Override
    public boolean addTask(String title, String description) {
        Task task = new Task(title, description, false);
        return tasks.add(task);
    }

    @Override
    public List<Task> viewAllTasks() {
        return tasks;
    }

    @Override
    public boolean markTaskAsCompleted(Long id) {

        for (Task foundTask : tasks) {
            if (foundTask.getId().equals(id)) {
                foundTask.setCompleted(true);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean deleteTask(Long id) {

        for(Task foundTask : tasks){
            if(foundTask.getId().equals(id)){
                return tasks.removeIf(task -> task.getId().equals(id));
            }
        }
        return false;
    }
}
