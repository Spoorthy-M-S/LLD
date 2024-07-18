package LLD.S1SOLIDprinciples;

public class Library {
    // Total value of the library item
    LibraryItems items[];

    public Library(LibraryItems item[]) {
        this.items = item;
    }

    public double calculateTotalValue() {
        double v = 0;
        for (LibraryItems i : items) {
            v += i.getValue();
        }
        return v;
    }
}
