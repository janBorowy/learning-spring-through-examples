package pl.student.properties;

import java.util.Map;

public class PropertyManager {

    private static PropertyManager instance;

    private PropertyManager() {
        initProperties();
    }

    public static PropertyManager getInstance() {
        if(instance == null) {
            instance = new PropertyManager();
        }

        return instance;
    }

    private Map<String, String> paths;

    private void initProperties() {
        paths = Map.ofEntries(
                Map.entry("foo", "foo_properties")
        );
    }

    public String getPropertiesPath(String className) {
        return paths.get(className);
    }

}
