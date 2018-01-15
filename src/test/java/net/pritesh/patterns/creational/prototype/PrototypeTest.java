package net.pritesh.patterns.creational.prototype;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class PrototypeTest
{
    public static Registry registry;

    private final String BASIC_SWORD = "Wood";
    private final String BETTER_SWORD = "Titanium";
    private final String BASIC_SHIELD = "Wood";
    private final String BETTER_SHIELD = "Steel";

    @BeforeClass
    public static void setUp() throws Exception
    {
        registry = new Registry();
    }

    @Test
    public void createPrototypes()
    {
        // Given
        assertNotNull(registry);
        Warrior defensiveWarrior = (Warrior) registry.createItem(CharacterType.Warrior);
        defensiveWarrior.setShield("Steel");

        // When
        Warrior attackingWarrior = (Warrior) registry.createItem(CharacterType.Warrior);
        attackingWarrior.setSword("Titanium");

        // Then
        assertEquals(BASIC_SWORD, defensiveWarrior.getSword() );
        assertEquals(BETTER_SHIELD, defensiveWarrior.getShield());
        assertEquals(BETTER_SWORD, attackingWarrior.getSword());
        assertEquals(BASIC_SHIELD, attackingWarrior.getShield());
    }

}
