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
    // Check if list is empty, then if index is 0, then if index is greater than 0. If index is 1 more than length of list, append to end. Anything greater, index out of range. 

    // Set a previous node equal to head and runner equal to head.next
    // Start at position 1 and loop while curr != null
    // If index equals location, insert and return. After while loop, check same conditions for last node in list
    public void addAtIndex(int value, int index){
        Node newNode = new Node(value);
        if (head == null){
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
        else {
            head = head.next;
        }
    }

    public void deleteFromBack(){
        if (head == null || head.next == null){
            head = null;
            return;
        }
        else {
            Node runner = head;
            while (runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    // Check empty list or list size 1 first, then if index is 0, then prev=head curr=head.next and iterate with start position 1 (while curr.next != null), then check last element (reason for curr.next). Else, out of range.
    public void deleteAtIndex(int index){
        if (head == null || head.next == null){
            head = null;
            return;
        }

        else if (index == 0){
            head = head.next;
        }

        else {
            Node prev = head;
            Node curr = head.next;
            int position = 1;
            while (curr.next != null){
                if (position == index){
                    prev.next = curr.next;
                    return;
                }
                position++;
                curr = curr.next;
                prev = prev.next;
            }
            if (position == index)
                prev.next = null;
            else
                System.out.println("Index out of range");
        }
    }

    // Check if head / head.next null first, else set min to head.value with prev and curr pointers, find min for all values - 1, then last value, start comparing min with last value first, then first value, then everything in the middle with another while loop
    public void deleteMin(){
        if (head == null || head.next == null){
            head = null;
            return;
        }

        else {
            int min = head.value;
            Node prev = head;
            Node curr = head.next;
            while(curr.next != null){
                if(curr.value < min){
                    min = curr.value;
                }
                prev = prev.next;
                curr = curr.next;
            }
            if(curr.value < min){
                prev.next = null;
                return;
            }

            if(head.value == min){
                head = head.next;
                return;
            }

            else {
                Node prev2 = head;
                Node curr2 = head.next;
                while(curr2.next != null){
                    if (curr2.value == min){
                        prev2.next = curr2.next;
                        return;
                    }
                    prev2 = prev2.next;
                    curr2 = curr2.next;
                }
            }
        
        }
    }

    public void moveMinToFront(){
        if (head == null || head.next == null){
            head = null;
            return;
        }

        else {
            int min = head.value;
            Node prev = head;
            Node curr = head.next;
            while(curr.next!=null){
                if (curr.value < min){
                    min = curr.value;
                }
                prev = prev.next;
                curr = curr.next;
            }
            if (curr.value < min){
                curr.next = head;
                prev.next = null;
                head = curr;
                return;
            }

            if (head.value == min)
                return;
            else {
                Node prev2 = head;
                Node curr2 = head.next;
                while(curr2.next != null){
                    if (curr2.value == min){
                        Node temp = curr2;
                        prev2.next = curr2.next;
                        temp.next = head;
                        head = temp;
                        return;
                    }
                    prev2 = prev2.next;
                    curr2 = curr2.next;
                }
            }
        }
    }

    // Unfinished
    public void reverseList(){
        if (head == null || head.next == null){
            return;
        }
        else {
            Node prev = head;
            Node curr = head.next;
            while(curr != null){
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
                      
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