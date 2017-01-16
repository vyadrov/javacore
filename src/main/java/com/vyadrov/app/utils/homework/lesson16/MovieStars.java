package com.vyadrov.app.utils.homework.lesson16;

public enum MovieStars {
    BRAD_PITT("Brad Pitt", 53),
    AL_PACINO("Al Pacino", 76),
    ROBERT_DE_NIRO("Robert De Niro", 73),
    LEONARDO_DICAPRIO("Leonardo DiCaprio", 42),
    BEN_AFFLECK("Ben Affleck", 44),
    BRUCE_WILLIS("Bruce Willis", 61),
    JOHN_MALKOVICH("John Malkovich", 63),
    ANTHONY_HOPKINS("Anthony Hopkins", 79),
    MARLON_BRANDO("Marlon Brando", 80),
    TOM_HARDY("Tom Hardy", 39);

    private String actor;
    private int yearsOld;

    MovieStars(String actor, int yearsOld) {
        this.actor = actor;
        this.yearsOld = yearsOld;
    }

    public String getActor() {
        return actor;
    }

    public int getYearsOld() {
        return yearsOld;
    }
}
