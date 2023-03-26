package org.example.patterns.templateMethod;

public abstract class DataRenderer {
    public String render() {
        String data = readData();
        return processData(data);
    }

    public abstract String readData();

    public abstract String processData(String data);
}
