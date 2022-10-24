package com.colibear.create.builder._01_before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 12, 9));
        tourPlan.setWhereToStay("리조트");

        tourPlan.addPlan(0, "체크인 이후 짐 풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "산첵");
        tourPlan.addPlan(1, "점심");
        tourPlan.addPlan(1, "수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ");
        tourPlan.addPlan(2, "조식");
        tourPlan.addPlan(2, "체크아웃");
        tourPlan.addPlan(2, "귀가");


    }
}
