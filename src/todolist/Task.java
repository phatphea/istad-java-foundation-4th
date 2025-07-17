package todolist;

public class Task {

    private static Long nextId = 1L; //declare auto generate id

    private Long id;
    private String title;
    private String description;
    private Boolean isCompleted;

    public Task(){
        this("N/A", "None", false);
    }

    public Task(String title, String description, Boolean isCompleted) {
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
