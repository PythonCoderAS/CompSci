import java.util.ArrayList;

public class DailyWeightTracker {
    public static ArrayList<Double> getWeightChanges(ArrayList<Double> weights) {
        ArrayList<Double> difference = new ArrayList<Double>();
        for (int i = 0; i < weights.size() - 1; i++) {
            difference.add(weights.get(i + 1) - weights.get(i));
        }
        return difference;
    }

    public static ArrayList<Double> getWeights(double initialWeight, ArrayList<Double> differences) {
        ArrayList<Double> weights = new ArrayList<Double>();
        weights.add(initialWeight);
        for (int i = 0; i < differences.size(); i++) {
            weights.add(weights.get(i) + differences.get(i));
        }
        return weights;
    }

    public static ArrayList<Double> getWeightRuns(ArrayList<Double> weights) {
        ArrayList<Double> runData = new ArrayList<Double>();
        int currentRunStart = 0;
        boolean isPositive = weights.get(1) - weights.get(0) > 0;
        for (int i = 1; i < weights.size() - 1; i++) {
            if ((weights.get(i + 1) - weights.get(i) > 0) != isPositive && (weights.get(i + 1) - weights.get(i) != 0)) {
                if (weights.get(i) - weights.get(currentRunStart) != 0) {
                    runData.add(weights.get(i) - weights.get(currentRunStart));
                }
                currentRunStart = i;
                isPositive = !isPositive;
            }
        }
        return runData;
    }
}
