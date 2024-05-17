public class Main {
    public static void main(String[] args) {
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperatureWeather = 3;
        if (temperatureWeather < 5) {
            System.out.println("На улице " + temperatureWeather + " гдрадуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureWeather + " гдрадуса, можно идти без шапки");
        }
    int speed = 68;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");}
        else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");}
    int ageMan = 78;
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");}
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("Если возраст челоека равен " + ageMan + ", то ему нужно ходить в школу");}
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете");}
        else {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему пора ходить на работу");}
   int ageChild = 8;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");}
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");}
        else  {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого");}
    int capacityTrain = 102;
        int peopleInTrain = 64;
        int seatingPlaces = 60;
        int standingPlaces = capacityTrain - seatingPlaces;
        if (peopleInTrain <= 102) {
            System.out.println("Если количество занятых мест составляет " + peopleInTrain + ", то в вагоне имеются сидячие или стоячие места");}
        else {
            System.out.println("Если количество занятых мест составляет " + peopleInTrain + ", то вагон уже полностью забит");}
int one = 7;
        int two = 3;
        int three = 46;
        if (one >= two && one >= three) {
            System.out.println(one);}
        if (two >= one && two >= three) {
            System.out.println(two);}
        else {
            System.out.println(three);}
    }
}