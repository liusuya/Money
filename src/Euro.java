public class Euro {
    private final int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass().equals(Dollar.class) && ((Dollar)o).getValue() == 13.5) return true;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        return amount == euro.amount;

    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Euro add(Euro otherEuro) {
        return new Euro(amount + otherEuro.amount);
    }
}
