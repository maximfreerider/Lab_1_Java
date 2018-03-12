import java.util.Comparator;

public class Equipment {

    private String ProduceName;
    private double weight;
    private SportType type;


    public Equipment( String ProduceName , double weight, SportType type ){
        this.ProduceName=ProduceName;
        this.weight=weight;
        this.type = type;
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

    public SportType getSportType() {
        return type;
    }

    public void setSportType(SportType newType) {
      type = newType;
    }

    @Override
    public String toString() {
        return  " ProduceName = " + ProduceName +
                ", weight = " + weight +
                ", type = " + type +
                '}';
    }
}
