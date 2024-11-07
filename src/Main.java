import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println();
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }else{
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

        System.out.println();
        System.out.println("Задача 3");
        int year = 2001;
        if ((year > 1583) && (year%4 == 0) && ((year%100 != 0) || (year%400 == 0))){
            System.out.println(year + " год является высокосным");
        }else{
            System.out.println(year + " не является высокосным");
        }

        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance < 21){
            deliveryTime = 1;
        } else if (deliveryDistance < 61){
            deliveryTime = 2;
        } else if (deliveryDistance < 101) {
            deliveryTime = 3;
        }
        if (deliveryDistance < 101) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }else {
            System.out.println("Доставка недоступна");
        }

        System.out.println();
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Зима." );
                break;
            case 2:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Зима." );
                break;
            case 3:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Весна." );
                break;
            case 4:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Весна." );
                break;
            case 5:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Весна." );
                break;
            case 6:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Лето." );
                break;
            case 7:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Лето." );
                break;
            case 8:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Лето." );
                break;
            case 9:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Осень." );
                break;
            case 10:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Осень." );
                break;
            case 11:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Осень." );
                break;
            case 12:
                System.out.println("Месяц под номером " + monthNumber + " относится к сезону: Зима." );
                break;
            default:
                System.out.println("Такого месяца еще не существует");





        }


    }
    }

