package in.pbehre;

import in.pbehre.server.TodoServer;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final Logger logger = Logger.getLogger(App.class.getName());
    public static final int port = 8080;
    public static void main( String[] args ) throws IOException, InterruptedException {
        logger.info("Starting Todo Server");
        TodoServer todoServer = new TodoServer(port);
        todoServer.start();
        todoServer.blockUntilShutdown();
    }
}
