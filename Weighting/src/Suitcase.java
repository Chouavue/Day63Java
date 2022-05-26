import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Items> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Items Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }
        this.Items.add(Item);
    }

    public int totalWeight() {
        return this.Items.stream()
            .map(item -> item.getWeight())
            .reduce(0, (prev, next) -> prev += next)
            .intValue();
        }

    public void printItems() {
        this.Items.forEach(System.out::println);
        }

    public Items heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}