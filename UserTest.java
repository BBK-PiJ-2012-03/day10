import org.junit.*;
import static org.junit.Assert.*;
public class UserTest {
	private UserImpl myUser;
	
	@Before
	public void buildUp() {
	// A file is created here to be used in every test.
	myUser = new UserImpl("John");
	}
	
	@After
	public void cleanUp() {
	// The file is deleted here, after each test ends
	myUser = null;
	}
	
	@Test
	public void testUser() {
		myUser.setId(1);
		assertEquals("John", myUser.getName());
		assertEquals(1, myUser.getId());
	
	}
}