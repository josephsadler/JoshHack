import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import game.*;


public class InventoryTest {

	Inventory inv;
	
	@Before
	public void setUp() throws Exception {
		inv = new Inventory(2);
	}

	@Test
	public void testGetItems() {
		Item i = new Item('a', Color.BLUE, "sword", "shiny");
		Item i2 = new Item('b', Color.RED, "staff", "it's magic!");
		inv.add(i);
		inv.add(i2);
		
		Item items[] = inv.getItems();
		
		assertTrue(items[0].color().equals(Color.BLUE));
		assertTrue(items[1].color().equals(Color.RED));
	}

	@Test
	public void testAdd() {
		inv.add(new Item('a', Color.BLUE, "sword", "shiny"));
		assertTrue(inv.get(0).color().equals(Color.BLUE));
	}

	@Test
	public void testRemove() {
		Item i = new Item('a', Color.BLUE, "sword", "shiny");
		inv.add(i);
		inv.remove(i);
		assertFalse(inv.contains(i));
	}

	@Test
	public void testIsFull() {
		Item i = new Item('a', Color.BLUE, "sword", "shiny");
		Item i2 = new Item('b', Color.RED, "staff", "it's magic!");
		inv.add(i);
		inv.add(i2);
		assertTrue(inv.isFull());
	}

	@Test
	public void testContains() {
		Item i = new Item('a', Color.BLUE, "sword", "shiny");
		inv.add(i);
		assertTrue(inv.contains(i));
	}

}
