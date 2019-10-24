package com.okellosoftwarez.train;

import java.util.ArrayList;

public class Application extends android.app.Application {

    public static ArrayList<Train> trains;
    @Override
    public void onCreate() {
        super.onCreate();

        trains = new ArrayList<>();
        trains.add(new Train("Enos Okello","0288", "Enos"));
        trains.add(new Train("Sasha Alope","035", "Sasha"));
        trains.add(new Train("Ryan Pierce","321", "Ryan"));
        trains.add(new Train("Dinah Mpali","895", "Dinah"));
    }
}
