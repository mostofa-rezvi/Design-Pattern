package printjob.modes;

import model.PrintSettings;
import printjob.modes.strategies.TonerSavingStrategy;

public class TonerSaveMode implements TonerSavingStrategy {
    public enum TonerSavingLevel {
        LOW, MEDIUM, HIGH
    }

    private final TonerSavingLevel tonerSavingLevel;

    public TonerSaveMode(TonerSavingLevel level) {
        this.tonerSavingLevel = level;
    }

    @Override
    public void saveToner(PrintSettings settings) {
        switch (tonerSavingLevel) {
            case HIGH:
                settings.setColorIntensity(settings.getColorIntensity() * 0.5);
                System.out.println("TonerSaveMode (HIGH): Color intensity reduced using standard algorithm.");
                break;
            case MEDIUM:
                settings.setColorIntensity(settings.getColorIntensity() * 0.7);
                System.out.println("TonerSaveMode (MEDIUM): Color intensity reduced using a different algorithm.");
                break;
            case LOW:
                settings.setColorIntensity(settings.getColorIntensity() * 0.9);
                System.out.println("TonerSaveMode (LOW): Color intensity reduced using another algorithm.");
                break;
        }
    }
}