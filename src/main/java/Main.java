import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Train firstTrain = new Train("Omsk", "Novosibirsk", 8, false);
        Train secondTrain = new Train("Moscow", "Sochi", 20, true);

        //проверяю наличие вагона-ресторана у поездов
        firstTrain.checkCarriageRestaurant();
        secondTrain.checkCarriageRestaurant();

        //нахожу расстояние, которое проходит первый поезд
        firstTrain.distanceCalculation(65);

        //нахожу расстояние, которое проходит первый поезд и вывожу результат на экран
        System.out.println("Поезд прошел " + secondTrain.distanceCalculation(70) + " км.");

        //вывожу на экран маршрут поездов
        System.out.println("Маршрут 1го поезда:" + firstTrain.startingPoint + " - " + firstTrain.endPoint);
        System.out.println("Маршрут 2го поезда:" + secondTrain.startingPoint + " - " + secondTrain.endPoint);

        //задаю скорость поезда
        firstTrain.setSpeed(70);

        //задаю время движения второго поезда
        secondTrain.setTime(30);

        //получаю время движения второго поезда
        System.out.println(secondTrain.getTime());

        //у первого поезда появился вагон-ресторан
        firstTrain.setCarriageRestaurant(true);
        //у второго поезда убрали вагон-ресторан
        secondTrain.setCarriageRestaurant(false);

        //проверка наличия вагона-ресторана в первом поезде
        System.out.println(firstTrain.isCarriageRestaurant());
        //проверка наличия вагона-ресторана во втором поезде
        System.out.println(secondTrain.isCarriageRestaurant());

        System.out.println(firstTrain.type);
        System.out.println(secondTrain.type);

        Train.type = "cargo";

        System.out.println(firstTrain.type);
        System.out.println(secondTrain.type);

        firstTrain.type = "Passenger";

        System.out.println(secondTrain.type);

        //вызвать статический метод метод goTrain
        Train.goTrain();

        //вызвать статический метод sayClassname
        Train.sayClassName();

        //создание объектов статического класса
        Train.RailwayCarriage carriage1 = new Train.RailwayCarriage("compartment", 40);
        Train.RailwayCarriage carriage2 = new Train.RailwayCarriage("seatReserved", 60);

        //вывести количество мест для первого вагона
        System.out.println(carriage1.numberSeats);

        //вывести конечный пункт первого поезда
        System.out.println(firstTrain.endPoint);

    }
}
