package DZ6;

public class LapTop {
    int ram;
    int hdd;
    String oc;
    String color;


    public LapTop(int ram, int hdd, String oc, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.oc = oc;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOc() {
        return oc;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "LapTop {" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", oc='" + oc + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
