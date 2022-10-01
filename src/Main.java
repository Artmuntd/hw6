public class Main {
    public static void main(String[] args) {
        /// дз1
        int clientIOS = 1;
        if ( clientIOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //дз2
        int clientIOS1 = 0;
        int yearsDevice = 2020;
        if (clientIOS1 == 0) {
            if (yearsDevice < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS");
            } else {
                System.out.println("Установите  версию приложения для IOS");
            }
            //дз3
            int year = 2020;
            if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)  {
                System.out.println(year + " является весокосным");
            } else {
                System.out.println(year + " не является весокоснтным");
            }
        }
        // дз4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20); {
            deliveryDay++;
        }
        if ( deliveryDistance > 60){
            deliveryDay++;
        }
        System.out.println("потребуется дней " + deliveryDay);
        /// дз5
        int monthNumber = 12;
        switch ( monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень ");
                break;
            default:
                System.out.println("некоректный месяц" + monthNumber);
        }
    }
}