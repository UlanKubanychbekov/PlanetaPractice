package peaksoft;

public enum Planet {
    URANUS(30687),
    EARTH(365),
    JUPITER(4333),
    MERCURY(88),
    MARS(687),
    NEPTUNE(60200),
    SATURN(10759),
    VENUS(225);

    private final int dayOfAYear;

    Planet(int dayOfAYear) {
        this.dayOfAYear = dayOfAYear;
    }

    static int minDayItIsPlanet(Planet[] planets) {
        int counter = -1;
        int counter1 = planets[0].getDayOfAYear();



        for (int i = 0; i < planets.length; i++) {
            if (planets[i].getDayOfAYear() > counter1) {
                counter1 = planets[i].getDayOfAYear();
            }
            for (int i1 = 0; i1 < planets.length; i1++) {
                if (planets[i1].getDayOfAYear() == counter1) {
                    counter = planets[i1].getDayOfAYear();
                }

            }

        }return counter1;
    }
    static int maxDayItIsPlanet(Planet[] planets) {
        int counter = -1;
        int counter1 = planets[0].getDayOfAYear();


        for (int i = 0; i < planets.length; i++){
            if(planets[i].getDayOfAYear() < counter1){
                counter1 = planets[i].getDayOfAYear();
            }
            for (int j = 0; j < planets.length; j++){
                if(planets[j].getDayOfAYear()<=counter1){
                    counter = planets[j].getDayOfAYear();
                }
            }
        }return counter;

    }


    public int getDayOfAYear() {
        return dayOfAYear;
    }


}
