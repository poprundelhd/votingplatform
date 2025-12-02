package hu.sztt.votingplatform.logic.record;

import hu.sztt.votingplatform.logic.id.Identifiable;
import hu.sztt.votingplatform.logic.vote.Vote;

import java.util.ArrayList;

public class VoteRecords extends Recorder {
    public VoteRecords(ArrayList<Identifiable> records) {
        super(new ArrayList<Vote>());
    }
}
