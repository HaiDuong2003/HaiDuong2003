public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        store.addDVD("Pearl");
        store.addDVD("The Platform");
        store.addDVD("X");

        System.out.println("DVDs in the store: " + store.getItemsInStore());
        store.removeDVD("Pearl");
        System.out.println("DVDs in the store after removal: " + store.getItemsInStore());
        store.removeDVD("God father");
    }
}
