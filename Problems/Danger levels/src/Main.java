enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int pos;

    DangerLevel(int sections) {
        this.pos = sections;
    }

    int getLevel() {
        return pos;
    }
}