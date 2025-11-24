package hu.sztt.votingplatform.logic.poll;

import hu.sztt.votingplatform.logic.id.Identifiable;

public class PollOption implements Identifiable {
    private String optionId;
    private String content;

    @Override
    public char idIndicatorCharacter() {
        return ' ';
    }
}
