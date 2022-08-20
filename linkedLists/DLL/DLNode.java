public class DLNode {
    public Integer value;
    public DLNode prev;
    public DLNode next;

    public DLNode(Integer value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}