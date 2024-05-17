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
            System.out.println("\"На улице " + temperatureWeather + " гдрадуса, можно идти без шапки");
        }
    }
}