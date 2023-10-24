import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList[] list = new ToDoList[10];
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("To do list Manager");
            System.out.println("1.Create a new to do list");
            System.out.println("2.View exiting to do list");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");

            int choice;
            choice = scan.nextInt();
            scan.nextLine();//returns a line of text that is read from the scanner object
            if (choice == 1) {
                if (count < list.length) {
                    System.out.println("Please enter your name: ");
                    String name;
                    name = scan.nextLine();
                    list[count] = new ToDoList(name, 10);
                    count++;
                    System.out.println("The list " + name + " created.");
                } else {
                    System.out.println("You are out of limit. ");
                }

            } else if (choice == 2) {
                System.out.println("This is the task list.");
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + " " + list[i].name);
                }
                int index2;
                System.out.println("Put the index of list you want to work: ");
                index2 = scan.nextInt();
                ToDoList list2 = list[index2 - 1];
                while (true) {
                    System.out.println("Selekto: ");
                    System.out.println("1. Add a task. ");
                    System.out.println("2. Remove a task. ");
                    System.out.println("3. Set a completed task.");
                    System.out.println("4. List the task ");
                    System.out.println("5. Return. ");

                    int choice2;
                    System.out.println("Set your second choice: ");
                    choice2 = scan.nextInt();
                    scan.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Put the name: ");
                            String name = scan.nextLine();
                            System.out.println("Put the description: ");
                            String description = scan.nextLine();
                            System.out.println("Put the date: ");
                            String date = scan.nextLine();
                            System.out.println("Put the priority level: ");
                            String priority_level = scan.nextLine();
                            Task task = new Task(name, description, date, priority_level);
                            list2.addTask(task);
                            System.out.println("Adding succesfully. ");
                            break;
                        case 2:
                            int indexremove;
                            System.out.println("Put the index you want to remove: ");
                            indexremove = scan.nextInt();
                            if (index2 == indexremove) {
                                list2.removeTask(index2 - 1);
                            }
                            break;
                        case 3:
                            list2.displayTask();
                            int index3;
                            System.out.println("Put the index you want to modify: ");
                            index3 = scan.nextInt();
                            Task task2 = list2.getTask(index3 - 1);
                            if (task2 != null) {
                                task2.getIsComplited();
                                System.out.println("The process done succesfully.");
                            } else {
                                System.out.println("The index is wrong.");

                            }
                            break;

                        case 4:
                            list2.displayTask();
                            break;
                        case 5:
                            break;
                    }

                }
            }
        }

    }
}


