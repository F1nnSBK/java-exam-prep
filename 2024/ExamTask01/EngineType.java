public enum EngineType {
    ELECTRO('E'),
    HYDROGEN('H'),
    DIESEL('D'),
    PETROL('P');

    private char type;

    EngineType(char type) {
        this.type = type;
    }

    public char getType() {
        return this.type;
    }

    public boolean canBeSustainable() {
        return (this == EngineType.ELECTRO || this == EngineType.HYDROGEN);
    }
}
