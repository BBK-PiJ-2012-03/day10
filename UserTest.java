import org.junit.*;
import static org.junit.Assert.*;
public class UserTest {
	private User myUser;
	private Library myLibrary;
	
	@Before
	public void buildUp() {
	// A file is created here to be used in every test.
	myUser = new UserImpl("John");
	myLibrary = new MockLibrary();
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
	
	@Test
	public void testRegistration() {
	
		myUser.register(myLibrary);
		assertEquals(myLibrary.getName(), myUser.getLibrary());
		assertEquals(myLibrary.getId(), myUser.getId());
	}

}