import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year,nextDay,nextMonth,nextYear;
        do {
            System.out.println("-------------NEXT DAY-------------");
            System.out.println("1. Enter day");
            System.out.println("2. Thoát");
            System.out.println("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Enter day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter year: ");
                    year = Integer.parseInt(scanner.nextLine());

                    nextDay = getNextDay(day,month,year);
                    nextMonth = getNextMonth(day,month,year);
                    nextYear = getNextYear(day,month,year);

                    if(!checkExisted(day,month,year)) {
                        System.out.println("Ngày không tồn tại!!! Vui lòng nhập lại");
                    } else {
                        System.out.printf("\nThe next day is %d/%d/%d \n\n",nextDay,nextMonth,nextYear);
                    }
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại:");
            }
        } while (true);
    }

    public static Boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }
            else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static Boolean is30DayMonths(int month){
        if (month == 4 || month == 6 || month == 9 || month == 11){
            return true;
        }
        return false;
    }

    public static Boolean is31DayMonths(int month){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return true;
        }
        return false;
    }

    public static int getNextDay(int day,int month,int year){
        if((is30DayMonths(month) && day == 30) || (is31DayMonths(month) && day == 31)) return 1;
        if((isLeapYear(year) && day == 29) || (!isLeapYear(year) && day == 28)) return 1;
        return day+1;
    }

    public static int getNextMonth(int day,int month,int year){
        if((is30DayMonths(month) && day == 30) || (is31DayMonths(month) && day == 31)) return month+1;
        if((isLeapYear(year) && day == 29) || (!isLeapYear(year) && day == 28)) return month+1;
        if(month == 12 && day == 31) return 1;
        return month;
    }

    public static int getNextYear(int day,int month, int year){
        if(month == 12 && day == 31) return year+1;
        return year;
    }

    public static Boolean checkExisted(int day, int month, int year){
        if((!isLeapYear(year) && month == 2 && day > 28)
                || (isLeapYear(year) && month == 2 && day > 29)
                || (is30DayMonths(month) && day > 30)
                || (is31DayMonths(month) && day > 31)
                || month > 12 ) return false;
        return true;
    }
}