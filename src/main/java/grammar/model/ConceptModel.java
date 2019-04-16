package grammar.model;

public class ConceptModel {
    private String name;
    private String desc;
    private String[] tags;

    public ConceptModel(String name, String desc, String[] tags) {
        this.name = name;
        this.desc = desc;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public String[] getTags() {
        return tags;
    }    
}