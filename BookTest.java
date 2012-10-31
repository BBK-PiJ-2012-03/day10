import org.junit.*;
import static org.junit.Assert.*;
public class BookTest {
	private	BookImpl myBook;
	
	@Before
	public void buildUp() {
	// A file is created here to be used in every test.
	myBook = new BookImpl("author1" , "title1");
	}
	@After
	public void cleanUp() {
	// The file is deleted here, after each test ends
	myBook = null;
	}
	
	@Test
	public void testBook() {	
		assertEquals("author1", myBook.getAuthor());
		assertEquals("title1", myBook.getTitle());
		}
}