package org.codefromhell.mcrsrvccmpr.springboot;

import org.codefromhell.mcrsrvccmpr.model.Shortcut;
import org.codefromhell.mcrsrvccmpr.model.ShortcutRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shortcuts")
public class ShortcutController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Shortcut> getShortcuts() {

        return ShortcutRepository.getInstance().getAll();
    }
}
