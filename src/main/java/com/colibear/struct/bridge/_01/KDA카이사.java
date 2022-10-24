package com.colibear.struct.bridge._01;

public class KDA카이사 implements Champion {
    @Override
    public void move() {
        System.out.println(KDA카이사.class.getSimpleName() + " move");
    }

    @Override
    public void skillQ() {
        System.out.println(KDA카이사.class.getSimpleName() + " skill q");
    }

    @Override
    public void skillW() {
        System.out.println(KDA카이사.class.getSimpleName() + " skill w");
    }

    @Override
    public void skillE() {
        System.out.println(KDA카이사.class.getSimpleName() + " skill e");
    }

    @Override
    public void skillR() {
        System.out.println(KDA카이사.class.getSimpleName() + " skill r");
    }
}
