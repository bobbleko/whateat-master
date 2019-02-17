package anunpongi.th.ac.rmutl.whateat;

import java.util.ArrayList;

public class Calculater {

    public static ArrayList<FoodMenu> Allnum = new ArrayList<>();
    public static Double dailyEnergy = 0.0;
    public static Double dailyActivityEnergy = 0.0;

    public static String name = "";
    public static String surname = "";
    public static int tall = 0;
    public static int weight = 0;
    public static int active = 0;
    public static int age = 0;
    public static boolean isMale = true;

    public static void calculateDaily(int tall, int Age, int Kg, boolean isMale, int activityNum) {
        Calculater.tall = tall;
        Calculater.age = Age;
        Calculater.weight = Kg;
        Calculater.isMale = isMale;
        Calculater.active = activityNum;
        if (isMale) {
            dailyEnergy = 66 + (13.7 * Kg) + (5 * tall) - (6.8 * Age);
        } else {
            dailyEnergy = 665 + (9.6 * Kg) + (1.8 * tall) - (4.7 * Age);
        }

        if (activityNum == 0) {
            dailyActivityEnergy = dailyEnergy * 1.2;
        } else if (activityNum == 1) {
            dailyActivityEnergy = dailyEnergy * 1.375;
        } else if (activityNum == 2) {
            dailyActivityEnergy = dailyEnergy * 1.55;
        } else if (activityNum == 3) {
            dailyActivityEnergy = dailyEnergy * 1.725;
        } else {
            dailyActivityEnergy = dailyEnergy * 1.9;
        }

    }

    public static int getAllEnergy() {
        int all = 0;
        for (FoodMenu f : Allnum) {
            all += f.energy;
        }
        return all;
    }

    public static int getSumEnergy(){
        return (int) (dailyActivityEnergy - getAllEnergy());
    }

    public static int getPercent(){
        return (int) (getAllEnergy()/dailyActivityEnergy*100);
    }

}
