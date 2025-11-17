package printjob.modes.strategies;

import model.PrintSettings;

public interface TonerSavingStrategy {
    void saveToner(PrintSettings settings);
}