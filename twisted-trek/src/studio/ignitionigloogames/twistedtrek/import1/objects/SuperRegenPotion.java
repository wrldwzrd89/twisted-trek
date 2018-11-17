/*  Import1: A Maze-Solving Game
Copyright (C) 2008-2010 Eric Ahnell

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

Any questions should be directed to the author via email at: fantastle@worldwizard.net
 */
package studio.ignitionigloogames.twistedtrek.import1.objects;

import studio.ignitionigloogames.twistedtrek.import1.creatures.PCManager;
import studio.ignitionigloogames.twistedtrek.import1.creatures.StatConstants;
import studio.ignitionigloogames.twistedtrek.import1.generic.GenericPotion;

public class SuperRegenPotion extends GenericPotion {
    // Constructors
    public SuperRegenPotion() {
	super(StatConstants.STAT_CURRENT_MP, false);
    }

    @Override
    public String getName() {
	return "Super Regen Potion";
    }

    @Override
    public String getPluralName() {
	return "Super Regen Potions";
    }

    @Override
    public byte getObjectID() {
	return (byte) 14;
    }

    @Override
    public int getEffectValue() {
	return PCManager.getPlayer().getMaximumMP();
    }

    @Override
    public String getDescription() {
	return "Super Regen Potions regenerate your magic completely when picked up.";
    }
}