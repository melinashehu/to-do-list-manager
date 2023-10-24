public class Task {
    String name;
    String description;
    String date;
    String priority_level;
    boolean isComplited;

    public Task(String name, String date, String priority_level, String description) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.priority_level = priority_level;
        this.isComplited = false;
    }

    public void taskComplited() {//update
        isComplited = true;
    }

    public String getName() {
        return name;
    }

    public boolean getIsComplited() {//update
        return isComplited;
    }

    public void display() {
        System.out.println("Name: " + name + " Descriprion: " + description + " Date " + date + " Priority " + priority_level);
        if (isComplited) {
            System.out.print(" Is copmleted: yes");
        } else {
            System.out.print(" Is copmleted: no");
        }

    }
}
