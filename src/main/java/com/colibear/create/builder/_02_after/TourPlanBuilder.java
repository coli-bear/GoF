package com.colibear.create.builder._02_after;

import java.time.LocalDate;

public interface TourPlanBuilder {
    // 빌더를 통한 메서드 체이닝을 위해 TourPlanBuilder 리턴
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder whereToStay(String stay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
