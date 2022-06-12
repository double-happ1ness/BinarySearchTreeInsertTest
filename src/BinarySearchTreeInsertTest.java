
public class BinarySearchTreeInsertTest {

    public static void main(String[] args) {
        SortedADT sorted = new BinarySearchTree();
        Integer value;
        do{
            value = Input.getInteger("value: ");
            try {
                sorted.insert(value);
                System.out.println("inserted");
            } catch (SortedADT.NotUniqueException e) {
                System.out.println("insert invalid - value not unique");
            }
            System.out.println(sorted);
        }while(Repeat.repeat());
    }
}
