package jdbc.advanced.users;

public enum DBUtil1 {
        URL("jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC ssg ssg");

        private final String value;

        DBUtil1(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
    }
}
