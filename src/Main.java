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
    }
}