public class DLLTester{
    public static void main(String[] args){
        DoublyLinkedList newList = new DoublyLinkedList();

        newList.addToBack(65);
        newList.addToBack(68);
        newList.addToBack(45);
        newList.addToBack(45);
        newList.addToBack(68);
        newList.addToBack(65);
       
        //newList.removeAt(6);
        //System.out.println(newList.pop().value);
        newList.printDLL();
        System.out.println(newList.isPalindrome());
        //System.out.println(newList.contains(78));
    }
}