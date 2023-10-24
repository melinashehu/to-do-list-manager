public class ToDoList {

    String name;
    Task[] tasks; //objekti klases task
    int taskCount;

    public ToDoList(String name, int max_number) {
        this.name = name;
        tasks = new Task[max_number];
    }

    public void addTask(Task task) {
        if (taskCount < tasks.length) {
            tasks[taskCount] = task;//tek indeksi qe ka vleren e taskcount shtojme elemetin task te ri
            taskCount++;
        } else {
            System.out.println("keni arritur limitin ");
        }

    }

    public void removeTask(int index) {
        if (index >= 0 && index < taskCount) {
            for (int i = index; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[taskCount - 1] = null;
            taskCount--;
        }

    }

    public void displayTask() {
        System.out.println("tasks in the: " + name + " are: ");
        for (int i = 0; i < taskCount; i++) {
            System.out.println((i + 1) + tasks[i].getName());
        }

    }

    public Task getTask(int index) {
        if (index >= 0 && index < taskCount) {
            return tasks[index];
        } else {
            return null;
        }
    }


}
