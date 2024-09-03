class Homework {
    public static int years(int [] numbers){
        int  years = 0;
    for (int i = 0; i < numbers.length; i++) {
        years += numbers[i];
     if ((years % 4 == 0 && years % 100 > 0) || years % 400 == 0) {
        System.out.println(years + " год является високосным");
    } else {
        System.out.println(years + " год не является високосным");
     } }
    return years;
}
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] year  = {2021};
        int yearsVis = years(year);}
}


class task {

    public static int telephone (int [] numbers){
        int telephone = 0;
        for (int i = 0; i < numbers.length; i++) {
            telephone += numbers[i];
            int operator =0;
            if (operator == 0 && telephone < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (operator == 0 && telephone >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (operator == 1 && telephone>= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }}
        return telephone;
    }

    public static void main (String[] args) {
        System.out.println("task 2");
        int[] clientDeviceYear = {2013};
        int[] OS = {0};
        int DeviceYear = telephone(clientDeviceYear);}
}



