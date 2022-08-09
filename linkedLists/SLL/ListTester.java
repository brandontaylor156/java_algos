public class ListTester{
    public static void main(String[] args){
        SinglyLinkedList newList = new SinglyLinkedList();
        newList.addToFront(4);
        newList.addToFront(6);
        newList.addToFront(9);
        newList.addToBack(10);
        newList.addAtIndex(99, 4);
        newList.deleteFromFront();
        newList.deleteFromBack();

        newList.printList();
    }
}