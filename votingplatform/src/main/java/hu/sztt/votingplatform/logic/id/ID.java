package hu.sztt.votingplatform.logic.id;

public abstract class ID {

    public static String generate(Identifiable identifiable) {
        return identifiable.idIndicatorCharacter() + "";
    }

}
