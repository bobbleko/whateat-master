package anunpongi.th.ac.rmutl.whateat;

public class FoodMenu {
    int id = 0;
    String name;
    int energy;
    String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public FoodMenu(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public FoodMenu(String name, int energy, String date) {
        this.name = name;
        this.energy = energy;
        this.date = date;
    }

    public FoodMenu(int id, String name, int energy, String date) {
        this.id = id;
        this.name = name;
        this.energy = energy;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
