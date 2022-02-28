package peaksoft;

import static peaksoft.Planet.maxDayItIsPlanet;
import static peaksoft.Planet.minDayItIsPlanet;

public class Main {

    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet a: planets){
            System.out.println(a);

        }System.out.println(minDayItIsPlanet(Planet.values()));
        System.out.println(maxDayItIsPlanet(Planet.values()));



}}
