public class PyHandler {
    private int tabs;
    private int lines;
    private int spaces;

    public PyHandler(int prevTabs, int prevLines, int prevSpaces){
        this.tabs = prevTabs;
        this.lines = prevLines;
        this.spaces = prevSpaces;
    }

    public int getTabs() {
        return tabs;
    }

    public void setTabs(int tabs) {
        this.tabs = tabs;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }
}
