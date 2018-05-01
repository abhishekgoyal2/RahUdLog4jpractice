package alpha1;
import org.apache.logging.log4j.*;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

public class Demolog {

	private static Logger log=LogManager.getLogger(Demolog.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.debug("this is debugging");

if(3>2)
{
	log.info("object is there");	
	log.error("object is not present");
	log.fatal("this is fatal");
}
	}

}
