package org.example.patterns.templateMethod;

public abstract class DataRenderer {
    public String render() {
        String data = readData();
        String processData = processData(data);
        return processData;
    }

    public abstract String readData();

    public abstract String processData(String data);
}
