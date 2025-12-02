package hu.sztt.votingplatform.data;

import hu.sztt.votingplatform.logic.user.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONHandler {

    private JSONWriter writer = new JSONWriter();
    private JSONReader reader = new JSONReader();
    private final String JSON_NAME = "data.json";
    private File jsonFile = new File(JSON_NAME);

    private class JSONWriter {
        public void write() {
        }
    }

    private class JSONReader {
        public void read() {}
    }


}
