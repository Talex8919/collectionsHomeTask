package kg.megacome.course;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ss secondsInHour = new ss(30, 7, 24, 60, 60);
        ss secondsInWeek = new ss(30, 7, 24, 60, 60);
        ss secondsMonth = new ss(30, 7, 24, 60, 60);
        ss secondsInMin = new ss(60);
        ss secondsInDay = new ss(30, 7, 24, 60, 60);


        ArrayList<ss> months = new ArrayList<>();
        months.add(secondsInHour);
        months.add(secondsInWeek);
        months.add(secondsInMin);
        months.add(secondsMonth);
        months.add(secondsInDay);

        List<Long> secondsW = new ArrayList<>();
        secondsW.add(secondsInDay.secInDay());
        secondsW.add(secondsInWeek.secInWeek());
        secondsW.add((long) secondsInMin.secInMin());
        secondsW.add(secondsMonth.secInMonth());
        secondsW.add((long) secondsInHour.secInHour());



        System.out.println(" ____________________  ");

        Collections.sort(secondsW);
secondsW.forEach(System.out::println);
        System.out.println(" ____________________  ");

    int reversec=Collections.binarySearch(secondsW,(long)secondsInHour.secInHour());
        System.out.println(reversec);
        System.out.println(" ____________________  ");


    Collections.reverse(secondsW);
    secondsW.forEach(System.out::println);
        System.out.println(" ____________________  ");

        Collections.shuffle(secondsW);
        secondsW.forEach(System.out::println);
        System.out.println(" ____________________  ");
       long maximum= Collections.max(secondsW);
        System.out.println(maximum);
         long minimum=Collections.min(secondsW);
        System.out.println(minimum);
        System.out.println(" ____________________  ");

        Collections.fill(secondsW,(long)42);
        secondsW.forEach(System.out::println);
        System.out.println(" ____________________  ");
    }

}




    class ss {
        int daysInMonth = 30;
        int daysInWeek = 7;
        int hoursInDay = 24;
        int min = 60;
        int hour = 60;


       public int secInHour() {
          int secondsInHour = min * hour;
           System.out.println( secondsInHour);
         return min * hour;
    }
      public long secInWeek() {
           long SecondsInWeeks=hoursInDay*(hour*min)*daysInWeek;
          System.out.println( SecondsInWeeks);
          return SecondsInWeeks;
       }

     public long secInDay() {
          long secondsInDay = hoursInDay * ((long) hour * min);
         System.out.println(secondsInDay);
      return secondsInDay;}

      public long secInMonth() {
          long secondsInMonth =  hoursInDay*(min*hour)*daysInMonth;
          System.out.println( secondsInMonth);
           return (secondsInMonth);
       }

       public int secInMin() {
           int secondsInMin = min;
           System.out.println(secondsInMin);
          return min;
       }


        public ss(int daysInMonth, int daysInWeek, int hoursInDay, int hour, int min) {
            this.daysInMonth = daysInMonth;
            this.daysInWeek = daysInWeek;
            this.hoursInDay = hoursInDay;
            this.hour = hour;
            this.min = min;

        }

        public ss(int min) {
            this.min = min;
        }


        @Override
        public String toString() {
            return "ss{" +
                    "daysInMonth=" + daysInMonth +
                    ", daysInWeek=" + daysInWeek +
                    ", hoursInDay=" + hoursInDay +
                    ", min=" + min +
                    ", hour=" + hour +
                    '}';
        }

        public ss() {

        }
    }






