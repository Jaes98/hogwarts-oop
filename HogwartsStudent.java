public class HogwartsStudent extends Student {
    House house;
    boolean prefect;
    String[] teams;

        public HogwartsStudent(String name, int enrollmentYear, House house) {
            super(name, enrollmentYear);
            this.house = house;
        }

        public House getHouse() {
            return this.house;
        }

        public void setHouse(House house) {
            this.house = house;
        }

        public boolean isPrefect() {
            return this.prefect;
        }

        public void setPrefect(boolean prefect) {
            this.prefect = prefect;
        }

        public String[] getTeams() {
            return this.teams;
        }

        public void setTeams(String[] teams) {
            this.teams = teams;
        }
}

