import java.util.Comparator;

public class Equipment {

    private String ProduceName;
    private double weight;

    public Equipment( String ProduceName , double weight ){
        this.ProduceName=ProduceName;
        this.weight=weight;
    }

    public class ProduceName implements Comparator<Equipment>{

        @Override
        public int compare(Equipment o1, Equipment o2) {
            return 0;
        }
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProduceName() {
        return ProduceName;
    }

    public void setProduceName(String produceName) {
        ProduceName = produceName;
    }

}
