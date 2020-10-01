package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little kids"),
    OLDER_KIDS("Older Kids", 7),
    TEENS("Teens", 12),
    MATURE("Mature", 16);


    private String displayName;
    private int age;

    Rating(String displayName, int age) {
        this.displayName = displayName;
    }
    Rating(String displayName) {
        this(displayName, 0);
    }

    public String getDisplayName() {
        return displayName;
    }
}
