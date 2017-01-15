package com.vyadrov.app.utils.homework.lesson16;

public enum MovieStars {
    BRAD_PITT("Brad Pitt", 53),
    AL_PACINO("Al Pacino", 76),
    ROBERT_DE_NIRO("Robert De Niro", 73);
    private String actor;
    private int yearsOld;

    MovieStars(String actor, int yearsOld) {
        this.actor = actor;
        this.yearsOld = yearsOld;
    }
}
