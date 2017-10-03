package org.codefromhell.mcrsrvccmpr.model;

public class Shortcut {
    private String tool;
    private String keystroke;
    private String desc;
    private String source;

    public Shortcut() {}

    public Shortcut(String tool, String keystroke, String desc, String source) {
        this.tool = tool;
        this.keystroke = keystroke;
        this.desc = desc;
        this.source = source;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getKeystroke() {
        return keystroke;
    }

    public void setKeystroke(String keystroke) {
        this.keystroke = keystroke;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
