package net.pritesh.patterns.creational.prototype;


import java.util.HashMap;
import java.util.Map;

/**
 * Objects to be cloned are stored in here.
 * Base objects need to be created in loadItems(), then use createItem to create new clones of them.
 */
public class Registry
{
    private Map<CharacterType, GameCharacter> items = new HashMap<>();

    public Registry()
    {
        loadItems();
    }

    public GameCharacter createItem(CharacterType type)
    {
        GameCharacter aChar = null;

        try
        {
            aChar = (GameCharacter) items.get(type).clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }


        return aChar;
    }

    /**
     * Initialise
     */
    private void loadItems()
    {
        Warrior warrior = new Warrior();
        warrior.setAgility(7);
        warrior.setDiscipline(4);
        warrior.setIntellect(1);
        warrior.setStrength(10);
        warrior.setShield("Wood");
        warrior.setSword("Wood");

        items.put(CharacterType.Warrior, warrior);

        Warlock warlock = new Warlock();
        warlock.setAgility(6);
        warlock.setDiscipline(7);
        warlock.setIntellect(9);
        warlock.setStrength(1);
        warlock.setStaff("wood");
        warlock.setDemon("bat");

        items.put(CharacterType.Warlock, warlock);
    }
}
