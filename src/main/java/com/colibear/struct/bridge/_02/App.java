package com.colibear.struct.bridge._02;

import com.colibear.struct.bridge._01.Champion;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Champion kda_ari = new 아리(new KDA());
        kda_ari.skillQ();
        kda_ari.skillR();

        Champion poolParty_ari = new 아리(new PoolParty());
        poolParty_ari.skillQ();
        poolParty_ari.skillR();

    }
}
