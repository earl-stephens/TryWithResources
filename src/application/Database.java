package application;

public class Database implements AutoCloseable {
	private String connectionString;
	/* when connecting to a DB, usually have a connection string
	 * that has the info for connecting to the DB.  And usually have 
	 * a close method to close the connection as well.
	 */
	
	public Database(String connectionString) throws Exception {
		System.out.println("Opening connection to " + connectionString);
		
		if(connectionString == null) {
			throw new Exception("Cannot connect to db " + connectionString);
		}
		this.connectionString = connectionString;
		
		System.out.println("Connected to " + connectionString);
	}
	
	public void getData() throws Exception {
		System.out.println("Getting data from " + connectionString);
		
		if(connectionString.length() < 3) {
			throw new Exception("Cannot get data from db " + connectionString);
		}
	}
	
	public void close() throws Exception {

		System.out.println("Closing connection....");
		
		
		if(connectionString == null) {
			throw new Exception("Cannot close connection to " + connectionString);
		}
		
		System.out.println("Connection closed");
	}
	
}
