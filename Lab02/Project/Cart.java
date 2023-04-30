import java.util.ArrayList;
import java.util.Comparator;
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<DigitalVideoDisc>();
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.add(disc);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.remove(disc);
    }

    public void clearCart() {
        itemsOrdered.clear();
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

   public int getQtyOrdered(DigitalVideoDisc disc) {
        int qty = 0;
        for (DigitalVideoDisc item : itemsOrdered) {
            if (item.equals(disc)) {
                qty++;
            }
        }
        return qty;
    }
}
