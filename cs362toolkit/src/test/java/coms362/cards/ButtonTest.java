package coms362.cards;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Button;
import model.Location;

/**
 * 
 * @author Zoe Sanders
 *
 */
public class ButtonTest {

	private Button b;
	@Before
	public void Setup()
	{
		Location l = new Location(3,2);
		b = new Button("whatup","my","friend", l);
	}
	@Test
	public void test1()
	{
		b.setId("ID1");
		assertEquals("ID1", b.getRemoteId());
	}
}
