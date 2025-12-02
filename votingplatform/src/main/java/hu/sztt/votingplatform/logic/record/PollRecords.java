package hu.sztt.votingplatform.logic.record;

import hu.sztt.votingplatform.logic.id.Identifiable;
import hu.sztt.votingplatform.logic.poll.Poll;

import java.util.ArrayList;

public class PollRecords extends Recorder {
    public PollRecords(ArrayList<Identifiable> records) {
        super(new ArrayList<Poll>());
    }
}
