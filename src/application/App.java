package application;

public class App {

	public static void main(String[] args) {
		//Database db = null;
		
		try(Database db = new Database("db")) {
			//db = new Database("db");
			db.getData();
			/*Constructors don't have any return type, but they can
			 * throw exceptions
			 */
			//db.close();
			//this removes the resource leak warning
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
/*Challenge is to make sure that close is always called, even if
 * getData throws an exception.  Do this by moving db.close() into
 * a finally block
 */
/*		finally {
			try {
				db.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			}
			Can get rid of all of this using try with resources
			Can only use try with resources if it is used with
			a class that implements the AutoCloseable interface
			*/
		
	}
}
