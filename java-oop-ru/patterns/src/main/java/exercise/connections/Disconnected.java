package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection tcpConnection;
    private String currentState;

    public Disconnected(TcpConnection tcpConnection, String currentState) {
        this.currentState = currentState;
        this.tcpConnection = tcpConnection;
    }

    public String getCurrentState() {
        return this.currentState;
    }

    @Override
    public void connect() {
        this.currentState = "connected";
        this.tcpConnection.setCurrentState(new Connected(this.tcpConnection, "connected"));
    }

    @Override
    public void disconnect() {
        System.out.println("Error");
    }
}
// END
