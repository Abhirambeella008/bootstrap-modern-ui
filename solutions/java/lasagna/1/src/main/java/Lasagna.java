public class Lasagna {

    // Expected cooking time in the oven
    public int expectedMinutesInOven() {
        return 40;
    }

    // Remaining cooking time
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // Preparation time: 2 minutes per layer
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Total time: preparation time + time spent in oven
    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}