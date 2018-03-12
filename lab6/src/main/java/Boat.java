public class Boat extends Equipment {

    private int peopleCount;
    private int vesla;
    private int chairs;
    private int vest;

    public Boat(String ProduceName, double weight, int peopleCount,SportType sportType, int vesla, int chairs, int vest) {
        super(ProduceName, weight, SportType.KIAYKI);
        this.peopleCount = peopleCount;
        this.vesla = vesla;
        this.chairs = chairs;
        this.vest = vest;

    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getVesla() {
        return vesla;
    }

    public void setVesla(int vesla) {
        this.vesla = vesla;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getVest() {
        return vest;
    }

    public void setVest(int vest) {
        this.vest = vest;
    }

    @Override
    public String toString() {
        return "Boat {" +
                "peopleCount = " + peopleCount +
                ", vesla = " + vesla +
                ", chairs = " + chairs +
                ", vest = " + vest + " " +
                super.toString() +
                "}\n";
    }

}
