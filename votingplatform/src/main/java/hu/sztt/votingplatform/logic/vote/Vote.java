package hu.sztt.votingplatform.logic.vote;

import hu.sztt.votingplatform.logic.id.Identifiable;

import java.util.Date;

public class Vote implements Identifiable {
    private String voteId;
    private String pollId;
    private String userId;
    private String optionId;
    private Date timestamp;

    @Override
    public char idIndicatorCharacter() {
        return 'V';
    }
}
