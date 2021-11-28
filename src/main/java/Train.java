public class Train {

    //свойства класса
    String startingPoint;
    String endPoint;
    private int speed = 59;
    private int time;
    private boolean carriageRestaurant;
    static String type = "passenger";

    //статический вложенный класс
    static class RailwayCarriage {
        String typeCarriage;
        int numberSeats;

        //конструктор для статического вложенного класса
        public RailwayCarriage(String typeCarriage, int numberSeats) {
            this.typeCarriage = typeCarriage;
            this.numberSeats = numberSeats;
        }

        //статический метод об имени класса
        public static void sayClassName() {
            System.out.println(RailwayCarriage.class.getName());
        }
    }

    //конструктор
    public Train(String startingPoint, String endPoint, int time, boolean carriageRestaurant) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
        this.time = time;
        this.carriageRestaurant = carriageRestaurant;
    }

    //статические методы класса
    public static void goTrain() {
        System.out.println("Поезд едет");
    }

    public static void sayClassName() {
        System.out.println(Train.class.getName());
    }

    //сеттер и геттер для speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    //геттер и сеттер для time
    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    //геттер и сеттер для carriageRestaurant
    public void setCarriageRestaurant(boolean carriageRestaurant) {
        this.carriageRestaurant = carriageRestaurant;
    }

    public boolean isCarriageRestaurant() {
        return carriageRestaurant;
    }

    //проверка наличия вагона- ресторана в поезде
    public void checkCarriageRestaurant() {
        if (carriageRestaurant == true) {
            System.out.println("В поезде есть вагон-ресторан");
        } else {
            System.out.println("В поезде нет вагона-ресторана");
        }
    }

    //расчет расстояния,которое проходит поезд
    public int distanceCalculation(int speed) {
        int distance = speed * time;
        return distance;
    }


}
