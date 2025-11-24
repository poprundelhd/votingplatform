package hu.sztt.votingplatform.logic.poll;

import hu.sztt.votingplatform.logic.id.Identifiable;

import java.util.ArrayList;
import java.util.Date;

public abstract class Poll implements Identifiable {
    private String pollId;
    private String creatorId;
    private String title;
    private String description;
    private Date createdAt;
    private Date deadline;
    private PollStatus status;
    private ArrayList<PollOption> options;

    @Override
    public char idIndicatorCharacter() {
        return 'P';
    }
}
