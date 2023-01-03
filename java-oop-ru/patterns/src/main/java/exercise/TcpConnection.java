package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private String ip;
    private Integer port;
    private Connection state;

    public TcpConnection(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
        this.state = new Disconnected(this, "disconnected");
    }

    public void setCurrentState(Connection state) {
        this.state = state;
    }

    public void connect() {
        this.getState().connect();
    }

    public void disconnect() {
        this.getState().disconnect();
    }

    public void write(String string) {
        if (this.getCurrentState().equals("disconnected")) {
            System.out.println("Error");
        }
    }

    public String getCurrentState() {
        return this.state.getCurrentState();
    }

    private Connection getState() {
        return this.state;
    }
}
// END
