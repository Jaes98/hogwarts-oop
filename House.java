public class House extends HogwartsPerson{
    String houseName;
    String founder;
    String[] colors;

    public House(String houseName, String founder, String[] colors) {
        this.houseName = houseName;
        this.founder = founder;
        this.colors = colors;
    }
    public House() {}
}
