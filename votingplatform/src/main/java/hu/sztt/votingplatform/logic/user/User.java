package hu.sztt.votingplatform.logic.user;

import hu.sztt.votingplatform.logic.id.Identifiable;

import java.util.Date;

public class User implements Identifiable {
    protected String userId;
    protected String username;
    protected UserRole role;
    protected boolean banned;
    protected Date until;

    @Override
    public char idIndicatorCharacter() {
        return 'U';
    }
}
