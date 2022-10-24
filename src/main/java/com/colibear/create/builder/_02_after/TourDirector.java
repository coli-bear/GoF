package com.colibear.create.builder._02_after;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤")
                .startDate(LocalDate.of(2022, 9, 10))
                .nightsAndDays(1, 2)
                .whereToStay("리조트")
                .addPlan(1, "체크인")
                .addPlan(1, "잠자기")
                .addPlan(2, "체크아웃")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder
                .title("롱비치")
                .startDate(LocalDate.of(2022, 10, 10))
                .getPlan();
    }
}
