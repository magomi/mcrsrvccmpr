package org.codefromhell.mcrsrvccmpr.model;

import java.util.ArrayList;
import java.util.List;

public class ShortcutRepository {

    private static ShortcutRepository instance;

    private List<Shortcut> shortcuts = new ArrayList<Shortcut>();

    public static ShortcutRepository getInstance() {
        if (null == instance) {
            instance = new ShortcutRepository();
        }
        return instance;
    }

    private ShortcutRepository() {
        shortcuts.add(new Shortcut("Chrome", "F6", "Focuses the address bar.",
                "https://support.google.com/chrome/answer/157179?hl=en"));
        shortcuts.add(new Shortcut("IntelliJ IDEA", "ALT+9", "Goto version control window.", ""));
    }

    public List<Shortcut> getAll() {
        return shortcuts;
    }
}
