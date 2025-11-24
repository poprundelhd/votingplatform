package hu.sztt.votingplatform.logic.user;

import hu.sztt.votingplatform.logic.id.Identifiable;

public class User implements Identifiable {
    protected String userId;
    protected String username;
    protected UserRole role;
    protected boolean pollCreatePermission;

    @Override
    public char idIndicatorCharacter() {
        return 'U';
    }
}
