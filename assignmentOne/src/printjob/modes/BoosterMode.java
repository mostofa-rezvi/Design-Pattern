package printjob.modes;

import model.PrintSettings;
import printjob.modes.strategies.ColorBoostingStrategy;

public class BoosterMode implements ColorBoostingStrategy {
    private final double intensityThreshold;

    public BoosterMode(double intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }

    @Override
    public void boost(PrintSettings settings) {
        double boostedIntensity = Math.min(intensityThreshold, settings.getColorIntensity() * 1.25);
        settings.setColorIntensity(boostedIntensity);
        System.out.println("BoosterMode: Color intensity increased to " + String.format("%.2f", boostedIntensity) + ".");
    }
}