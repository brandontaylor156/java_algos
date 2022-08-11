public class ListTester{
    public static void main(String[] args){
        SinglyLinkedList newList = new SinglyLinkedList();
        newList.addToFront(14);
        newList.addToBack(5);
        newList.addToBack(62);
        newList.addToBack(0);
        newList.addToBack(1);
        newList.addToBack(25);
        newList.addToBack(2);
        newList.addToBack(58);
        

        newList.reverseList();

        newList.printList();
    }
}