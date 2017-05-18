import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.List;

import org.junit.Before;
import org.junit.Test;
import game.*;

public class ItemTest {

	Item i;

	@Before
	public void setUp() throws Exception {
		i = new Item('c', Color.CYAN, "Pickaxe", "Diamond?");
	}

	@Test
	public void testGlyph() {
		assertTrue(i.glyph() == 'c');
	}

	@Test
	public void testColor() {
		assertTrue(i.color().equals(Color.CYAN));
	}

	@Test
	public void testName() {
		assertTrue(i.name().equals("Pickaxe"));
	}

	@Test
	public void testAppearance() {
		assertTrue(i.appearance().equals("Diamond?"));
	}

	@Test
	public void testModifyFoodValue() {
		i.modifyFoodValue(0);
		assertTrue(i.foodValue() == 0);
	}

	@Test
	public void testModifyAttackValue() {
		i.modifyAttackValue(20);
		assertTrue(i.attackValue() == 20);
	}

	@Test
	public void testModifyDefenseValue() {
		i.modifyDefenseValue(5);
		assertTrue(i.defenseValue() == 5);
	}

	@Test
	public void testModifyThrownAttackValue() {
		i.modifyThrownAttackValue(10);
		assertTrue(i.thrownAttackValue() == 11); //Thrown attack value is 1 by default
	}

	@Test
	public void testModifyRangedAttackValue() {
		i.modifyRangedAttackValue(0);
		assertTrue(i.rangedAttackValue() == 0);
	}

	@Test
	public void testQuaffEffect() {
		Effect e = new Effect(10);
		i.setQuaffEffect(e);
		assertTrue(i.quaffEffect().equals(e));
	}


	@Test
	public void testWrittenSpells() {
		Effect e = new Effect(10);
		i.addWrittenSpell("Power slam", 3, e);
		assertNotNull(i.writtenSpells());
	}
}
