package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private TcpConnection tcpConnection;
    private String currentState;

    public Connected(TcpConnection tcpConnection, String currentState) {
        this.tcpConnection = tcpConnection;
        this.currentState = currentState;
    }

    public String getCurrentState() {
        return this.currentState;
    }

    @Override
    public void connect() {
        System.out.println("Error");
    }

    @Override
    public void disconnect() {
        this.currentState = "disconnected";
        this.tcpConnection.setCurrentState(new Disconnected(this.tcpConnection, "disconnected"));
    }
}
// END
