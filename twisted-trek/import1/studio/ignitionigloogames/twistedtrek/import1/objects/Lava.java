/* Import1: A Maze-Solving Game */
package studio.ignitionigloogames.twistedtrek.import1.objects;

import studio.ignitionigloogames.twistedtrek.import1.Application;
import studio.ignitionigloogames.twistedtrek.import1.Import1;
import studio.ignitionigloogames.twistedtrek.import1.Messager;
import studio.ignitionigloogames.twistedtrek.import1.PreferencesManager;
import studio.ignitionigloogames.twistedtrek.import1.game.ObjectInventory;
import studio.ignitionigloogames.twistedtrek.import1.generic.GenericField;

public class Lava extends GenericField {
    // Constructors
    public Lava() {
	super(new FireBoots());
    }

    @Override
    public void postMoveAction(final boolean ie, final int dirX, final int dirY, final ObjectInventory inv) {
	final Application app = Import1.getApplication();
	if (app.getPrefsManager().getSoundEnabled(PreferencesManager.SOUNDS_GAME)) {
	    this.playMoveSuccessSound();
	}
    }

    @Override
    public void moveFailedAction(final boolean ie, final int dirX, final int dirY, final ObjectInventory inv) {
	final Application app = Import1.getApplication();
	Messager.showMessage("You'll burn");
	if (app.getPrefsManager().getSoundEnabled(PreferencesManager.SOUNDS_GAME)) {
	    this.playMoveFailedSound();
	}
    }

    @Override
    public String getName() {
	return "Lava";
    }

    @Override
    public String getPluralName() {
	return "Squares of Lava";
    }

    @Override
    public byte getObjectID() {
	return (byte) 3;
    }

    @Override
    public String getMoveFailedSoundName() {
	return "lava";
    }

    @Override
    public String getMoveSuccessSoundName() {
	return "walklava";
    }

    @Override
    public boolean overridesDefaultPostMove() {
	return true;
    }

    @Override
    public String getDescription() {
	return "Lava is too hot to walk on without Fire Boots.";
    }
}