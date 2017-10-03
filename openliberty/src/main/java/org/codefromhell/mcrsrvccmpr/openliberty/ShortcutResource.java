package org.codefromhell.mcrsrvccmpr.openliberty;

import org.codefromhell.mcrsrvccmpr.model.ShortcutRepository;

import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("shortcuts")
public class ShortcutResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray getShortcuts() {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

        ShortcutRepository.getInstance().getAll().stream()
                .forEach(s -> arrayBuilder.add(Json.createObjectBuilder()
                        .add("tool", s.getTool())
                        .add("keystroke", s.getKeystroke())
                        .add("desc", s.getDesc())
                        .add("source", s.getSource())));

        return arrayBuilder.build();
    }

}
