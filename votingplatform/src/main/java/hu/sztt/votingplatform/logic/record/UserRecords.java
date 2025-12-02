package hu.sztt.votingplatform.logic.record;

import hu.sztt.votingplatform.logic.id.Identifiable;
import hu.sztt.votingplatform.logic.user.User;

import java.util.ArrayList;

public class UserRecords extends Recorder {
    public UserRecords(ArrayList<Identifiable> records) {
        super(new ArrayList<User>());
    }
}
