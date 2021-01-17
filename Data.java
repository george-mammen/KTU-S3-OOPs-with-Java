import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Queue :");
        int n = scan.nextInt();
        Queue obj = new Queue(n);

        do {
            System.out.println("Operations to perform using Queue :");
            System.out.println("\n \t 1.Enqueue \n \t 2.Dequeue \n \t 3.Display \n \t 4.Exit");
            System.out.println("\n \n Enter the required option :");
            option = scan.nextInt();

            switch (option) {
                case 1: {
                    obj.enqueue();
                    break;
                }

                case 2: {
                    obj.dequeue();
                    break;
                }

                case 3: {
                    obj.display();
                    break;
                }

                case 4: {
                    break;
                }

                default: {
                    System.out.println("\n Enter a valid option !");
                }
            }
        } while (option != 4);

        scan.close();
    }
}

class Queue {
    int front, rear, n;
    int[] queue;

    Queue(int n) {
        front = -1;
        rear = -1;
        this.n = n;
        queue = new int[n];
    }

    void enqueue() {
        if (rear == n - 1) {
            System.out.println("The Queue is full.");
        } else {
            System.out.println("Enter the element required to add to the Queue :");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (front == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
            queue[rear] = x;
            System.out.println("The element has been added to the queue.");
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("The Queue is empty.");
        } else {
            System.out.println("The deleted element from the Queue is %d" + queue[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("The Queue is empty.");
        } else {
            System.out.println("The Elements of the Queue are :");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
