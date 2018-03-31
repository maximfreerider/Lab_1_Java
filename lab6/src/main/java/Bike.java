public class Bike extends Equipment {

    private int gearsNumber;
    private int numberOfBrake;

    public Bike(String ProduceName, double weight, SportType sportType, int gearsNumber, int numberOfBrake) {
        super(ProduceName, weight, sportType);
        this.gearsNumber = gearsNumber;
        this.numberOfBrake = numberOfBrake;
    }

    public int getGearsNumber() {
        return gearsNumber;
    }

    public void setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    public int getNumberOfBrake() {
        return numberOfBrake;
    }

    public void setNumberOfBrake(int numberOfBrake) {
        this.numberOfBrake = numberOfBrake;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "gearsNumber = " + gearsNumber +
                ", numberOfBrake = " + numberOfBrake + " " +
                super.toString() +
                "}\n";
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()+ "," + "gearsOfNumber" + "," + "numberOfBreak";
    }
    public String toCSV(){
        return super.toCSV() + getGearsNumber() + getNumberOfBrake();
    }
}

