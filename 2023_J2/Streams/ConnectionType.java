package Streams;

public enum ConnectionType {
    
    TYPC,
    THUNDERBOLT,
    MICRO;

    public boolean isModern() {
        return this == ConnectionType.TYPC || this == ConnectionType.THUNDERBOLT;
    }
}
