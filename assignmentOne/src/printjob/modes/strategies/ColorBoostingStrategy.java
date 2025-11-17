package printjob.modes.strategies;

import model.PrintSettings;

public interface ColorBoostingStrategy {
    void boost(PrintSettings settings);
}