public interface User {
	/**
	*A getter for the name of the user
	*/
	String getName();
	
	/**
	*A getter for the Library ID of the user
	*/
	int getId();
	
	/**
	*A setter for the Library ID of the user
	*/
	void setId(int id);
	
	/**
	*A method which allows users registering with a library and getting a user-ID
	*/
	void register(Library library);
	
	/**
	*A getter which returns the name of the library
	*/
	MockLibrary getLibrary();
}

	