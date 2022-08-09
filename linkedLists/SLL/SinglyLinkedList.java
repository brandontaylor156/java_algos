public class SinglyLinkedList{
    public Node head;
    public SinglyLinkedList(){
        head = null;
    }

    // Add node to front of list
    public void addToFront(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Add node to back of list
    public void addToBack(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Add node at a specified index
    // Check for invalid input (less than 0), then if list is empty, then if index is 0, then if index is greater than 0. If index is more than length of list, append to end. Anything greater, index out of range. 

    // Set a previous node equal to head and runner equal to head.next
    // Start at position 1 and loop while curr != null
    // If index equals location, insert and return. After while loop, check same conditions for last node in list
    public void addAtIndex(int value, int index){
        Node newNode = new Node(value);
        // Input validation
        if (index < 0){
            System.out.println("Index must be at least 0");
            return;
        }

        // If list is empty
        else if (head == null){
            head = newNode;
            return;
        }

        // If index is 0
        else if (index == 0){
            newNode.next = head;
            head = newNode;
        }

        // If index is greater that 0
        else {
            Node prev = head;
            Node curr = head.next;
            int position = 1;
            while (curr != null){
                if (position == index){
                    prev.next = newNode;
                    newNode.next = curr;
                    return;
                }
                position++;
                curr = curr.next;
                prev = prev.next;
            }
            if (position == index)
                prev.next = newNode;
            else 
                System.out.println("Index out of range");
        }
    }

    public void deleteFromFront(){
        if (head == null)
            return;
        else if (head.next == null)
            head = null;
        else {
            
        }
    }
    
    public void printList(){
        Node runner = head;
        while(runner != null){
            System.out.print(runner.value + " => ");
            runner = runner.next;
        }
    }

}