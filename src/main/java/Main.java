import org.konkvistador.server.Server;

public class Main {
    public static int port = 9999;
    public static int poolSize = 64;

    public static void main(String[] args) {
        //запускаем сам сервер на 64 потока
        Server server = new Server(poolSize);
        server.listen(port);
    }
}
