package hu.sztt.votingplatform.logic.record;

import hu.sztt.votingplatform.logic.id.Identifiable;

import java.util.ArrayList;

public abstract class Recorder {

    protected static ArrayList<? extends Identifiable> records;

    public Recorder(ArrayList<? extends Identifiable> records) {
        Recorder.records = records;
    }

    public static ArrayList<? extends Identifiable> get() {
        return records;
    }

}
