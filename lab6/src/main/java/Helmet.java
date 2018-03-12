public class Helmet extends Equipment{

    private int size;

    public Helmet(String ProduceName, double weight, SportType sportType, int size) {
        super(ProduceName, weight, sportType);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Helmet {" +
                "size = " + size + " " +
                super.toString() +
                "}\n";
    }
}
