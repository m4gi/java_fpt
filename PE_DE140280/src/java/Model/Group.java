package Model;


public class Group {

    private int id_group;
    private String name;
    private String description;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Group(int id_group, String name, String description) {
        this.id_group = id_group;
        this.name = name;
        this.description = description;
    }

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
