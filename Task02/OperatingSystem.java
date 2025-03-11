public enum OperatingSystem {
    WINDOWS('W'),
    ANDROID('A'),
    MACOS('M'),
    IOS('I'),
    LINUX('L');

    private char name;

    OperatingSystem(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public boolean isMobile() {
        return this == ANDROID || this == IOS;
    }
}
