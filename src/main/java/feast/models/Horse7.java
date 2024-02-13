package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Horse7 {
    private Camel8 camel;

    public Horse7(Camel8 camel) {
        this.camel = camel;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a camel, " + camel.toString();
    }

    @Autowired
    public void setCamel(Camel8 camel) {
        this.camel = camel;
    }
}
