package com.colibear.create.builder._02_after;


import java.time.LocalDate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder tourPlanBuilder = new DefaultTourBuilder();
        TourPlan plan = tourPlanBuilder.title("칸쿤")
                .startDate(LocalDate.of(2022, 9, 10))
                .nightsAndDays(1, 2)
                .whereToStay("리조트")
                .addPlan(1, "체크인")
                .addPlan(1, "잠자기")
                .addPlan(2, "체크아웃")
                .getPlan();


        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan longBeachTrip = tourDirector.longBeachTrip();
        TourPlan cancunTrip = tourDirector.cancunTrip();

        Stream.builder();
    }
}
