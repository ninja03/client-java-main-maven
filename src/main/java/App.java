import com.kakomimasu.*;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        KakomimasuAPI client = new KakomimasuAPI("https://api.kakomimasu.com");
        client.setPlayerWithGuest("kinop");
        client.matchWithFree();
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
