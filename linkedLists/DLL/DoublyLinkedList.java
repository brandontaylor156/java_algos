public class DoublyLinkedList{
    public DLNode head;
    public DLNode tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addToFront(Integer value){
        DLNode newNode = new DLNode(value);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addToBack(Integer value){
        DLNode newNode = new DLNode(value);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public DLNode pop(){
        if (head == null)
            return head;
        else if (head.next == null){
            DLNode temp = head;
            head = null;
            tail = null;
            return temp;
        }
        else {
            DLNode temp = tail;
            tail.prev.next = null;
            tail = tail.prev;
            temp.prev = null;
            return temp;
        }
    }

    public boolean contains(Integer value){
        DLNode runner = head;
        while (runner != null){
            if(runner.value == value){
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

    public int size(){
        DLNode runner = head;
        int count = 0;
        while(runner != null){
            runner = runner.next;
            count++;
        }
        return count;
    }

    public void insertAt(int value, int index){
        DLNode newNode = new DLNode(value);
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        if (index == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else {
            DLNode currNode = head.next;
            int count = 1;
            while(currNode != null){
                if (index == count){
                    currNode.prev.next = newNode;
                    newNode.next = currNode;
                    newNode.prev = currNode.prev;
                    currNode.prev = newNode;
                    return;
                }
                count++;
                currNode = currNode.next;
            }
            if (count == index){
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            else{
                System.out.println("Index out of range");
            }
        }
    }

    public void removeAt(int index){
        if (head == null){
            return;
        }
        if (index == 0){
            head = head.next;
            head.prev.next = null;
            head.prev = null;
        }
        else {
            DLNode currNode = head.next;
            int count = 1;
            while(currNode.next != null){
                if (count == index){
                    currNode.prev.next = currNode.next;
                    currNode.next.prev = currNode.prev;
                    currNode.prev = null;
                    currNode.next = null;
                    return;
                }
                currNode = currNode.next;
                count++;
            }
            if (count == index){
                tail = tail.prev;
                tail.next.prev = null;
                tail.next = null;
            }
            else{
                System.out.println("Index out of range");
            }
        }
    }

    public boolean isPalindrome(){
        DLNode runner1 = head;
        DLNode runner2 = tail;

        while(runner1 != null && runner1.prev != runner2){
            if (runner1.value != runner2.value){
                return false;
            }
            runner1 = runner1.next;
            runner2 = runner2.prev;
        }
        return true;
    }

    public void printDLL(){
        DLNode runner = head;
        while(runner != null){
            System.out.print(runner.value + " => ");
            runner = runner.next;
        }
    }

    public void printValuesBackward(){
        DLNode runner = tail;
        while(runner != null){
            System.out.print(runner.value + " => ");
            runner = runner.prev;
        }
    }
}