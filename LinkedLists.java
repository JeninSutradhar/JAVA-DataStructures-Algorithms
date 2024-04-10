// jeninsutradhar@gmail.com
// Linked List Data Structures
/*
 * A linked list is a linear data structure consisting of a 
 * sequence of elements where each element points to the 
 * next element in the sequence
 */

class Task {
    String name; // Name of task
    Task next; // Path to the next Task

    // Task Constructor
    public Task(String name) {
        this.name = name;
        this.next = null;
    }
}

/**
 * TaskList
 */
class TaskList {
    // head representing first task in the list
    Task head;

    // Method to insert a new task at the end of the List
    public void insert(String taskName) {
        Task newTask = new Task(taskName);

        // If the list is empty, it sets the new task as the head
        if (head == null) {
            head = newTask;
        } else {
            // It traverses the list until it reaches the last node and adds the new task there.
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    // Method to display all task in the List
    public void display() {
        Task current = head;
        // prints all the tasks in the list by traversing the list from the head to the last node.
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }

    // Method to delete a task by name
    public void delete(String taskName) {
        /*
         * If the task is found, it updates the next reference 
         * of the previous task to skip the task to be deleted.
         */
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.name.equals(taskName)) {
            head = head.next;
            return;
        }
        Task current = head;
        Task prev = null;
        while (current != null && !current.name.equals(taskName)) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Task not found.");
            return;
        }
        prev.next = current.next;
    }

    // Method to insert a task at a specific position
    public void insertAtPosition(String taskName, int position) {

        // If the position is 0, it inserts the task at the beginning
        /*
         * Otherwise, it traverses the list to find the node at 
         * the specified position and inserts the new task after it.
         */
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        Task newTask = new Task(taskName);
        if (position == 0) {
            newTask.next = head;
            head = newTask;
            return;
        }
        Task current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }
        newTask.next = current.next;
        current.next = newTask;
    }
}

// Main Class
public class LinkedLists {

    // 'main' method demonstrates the functionality of the 'TaskList'
    public static void main(String[] args) {
        
        /*
         * creates an instance of TaskList and inserts 
         * three tasks into the list using the insert method.
         */
        TaskList taskList = new TaskList();

        // Inserting tasks
        taskList.insert("Drink Water");
        taskList.insert("Eat Food");
        taskList.insert("Ride Bicycle");
        taskList.insert("Go to Sleep");

        System.out.println("Tasks in the list:");
        taskList.display();

        // Deleting a task
        taskList.delete("Ride Bicycle");
        System.out.println("Tasks after deleting 'Task 2':");
        taskList.display();

        // Inserting a task at a specific position
        taskList.insertAtPosition("Make Cookies", 1);
        System.out.println("Tasks after inserting 'New Task' at position 1:");
        taskList.display();
    }
}
