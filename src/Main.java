class Homework {
    public static void main(String[] args){
        System.out.println("task 1");
        int year = 2023;
        years(year);
        System.out.println();
        System.out.println("task 2");
        int clientDeviceYear = 2013;
        int OS = 0;
        OSAndClientDeviceYear(OS, clientDeviceYear);
        System.out.println();
        System.out.println("task 3");
        int deliveryDistance = distance(95);
        System.out.println(deliveryDistance);
        }

    public static void years(int year){
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

public static void OSAndClientDeviceYear(int OS, int clientDeviceYear){
    if (OS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (OS == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите обычную версию приложения для iOS по ссылке");
    } else if (OS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите обычную версию приложения для Android по ссылке");
    } else {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
}
}

    public static int distance(int deliveryDistance){
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
    }
    }
}






