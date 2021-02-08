package in.pbehre.server;

import in.pbehre.service.TodoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TodoServer {
    public static final Logger logger = Logger.getLogger(TodoServer.class.getName());

    private final int port;
    private final Server server;

    public TodoServer(int port) {
        this.port = port;
        TodoService service = new TodoService();
        server = ServerBuilder.forPort(port)
                .addService(service)
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Starting server on port: " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.err.println("shut down gRPC server because JVM shuts down");
                try {
                    TodoServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("server shut down");
            }
        });
    }

    public void stop() throws InterruptedException {
        if(server != null)
        {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}
