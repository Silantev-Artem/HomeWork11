import java.time.LocalDate;

public class Main {


    public static void analyzeLeapYear (int year) {
            if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year >= 1584 && year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else if (year >= 1584) {
                System.out.println(year + " год не является високосным");
            } else {
                System.out.println(year + " год до разделения на високосный и невисокосный");
            }
    }

    public static void analyzeOS (int clientDeviceYear, int clientOS) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if  (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void analyzeDeliveryDistance (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance <20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <60) {
            deliveryDay = deliveryDay +1;
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if (deliveryDistance >= 60 && deliveryDistance <100){
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if (deliveryDistance > 100) {
            System.out.println("Нет доставки на такое расстояние");
        }
    }


    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year = 2025;
        analyzeLeapYear(year);

        System.out.println("\nЗадание 2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        analyzeOS(clientDeviceYear, clientOS);

        ////int currentYear = LocalDate.now().getYear(); - получить текущий год.


        System.out.println("\nЗадание 3");
        int deliveryDistance = 95;
        analyzeDeliveryDistance(deliveryDistance);


    }

}