/*  Import2: An RPG
Copyright (C) 2008-2010 Eric Ahnell

Any questions should be directed to the author via email at: Import2@worldwizard.net
 */
package studio.ignitionigloogames.twistedtrek.import2.maze.objects;

import studio.ignitionigloogames.randomrange.RandomRange;
import studio.ignitionigloogames.twistedtrek.import2.Import2;
import studio.ignitionigloogames.twistedtrek.import2.game.GameLogicManager;
import studio.ignitionigloogames.twistedtrek.import2.maze.Maze;
import studio.ignitionigloogames.twistedtrek.import2.maze.abc.AbstractMPModifier;
import studio.ignitionigloogames.twistedtrek.import2.maze.effects.MazeEffectConstants;
import studio.ignitionigloogames.twistedtrek.import2.resourcemanagers.ObjectImageConstants;
import studio.ignitionigloogames.twistedtrek.import2.resourcemanagers.SoundConstants;
import studio.ignitionigloogames.twistedtrek.import2.resourcemanagers.SoundManager;

public class DarkGem extends AbstractMPModifier {
    // Constructors
    public DarkGem() {
	super();
    }

    @Override
    public int getBaseID() {
	return ObjectImageConstants.OBJECT_IMAGE_DARK_GEM;
    }

    @Override
    public String getName() {
	return "Dark Gem";
    }

    @Override
    public String getPluralName() {
	return "Dark Gems";
    }

    @Override
    public String getDescription() {
	return "Dark Gems take MP away.";
    }

    @Override
    public void postMoveAction(final boolean ie, final int dirX, final int dirY) {
	Import2.getApplication().showMessage("Your power withers!");
	Import2.getApplication().getGameManager().activateEffect(MazeEffectConstants.EFFECT_POWER_WITHER);
	SoundManager.playSound(SoundConstants.SOUND_FOCUS);
	GameLogicManager.decay();
    }

    @Override
    public boolean shouldGenerateObject(final Maze maze, final int row, final int col, final int floor, final int level,
	    final int layer) {
	// Generate Dark Gems at 30% rate
	final RandomRange reject = new RandomRange(1, 100);
	return reject.generate() < 30;
    }
}
