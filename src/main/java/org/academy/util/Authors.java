package org.academy.util;

import org.academy.kata.IEight;
import org.academy.kata.IFive;
import org.academy.kata.ISeven;
import org.academy.kata.ISix;

public enum Authors {
    KOSIAK_IVANNA(1, "keepCalmGirl", "Ivanna Kosiak",
            new org.academy.kata.implementation.keepCalmGirl.EightImpl(),
            new org.academy.kata.implementation.keepCalmGirl.SevenImpl(),
            new org.academy.kata.implementation.keepCalmGirl.SixImpl(),
            new org.academy.kata.implementation.keepCalmGirl.FiveImpl()),

    FYLYK_VIKTORIIA(2, "viktoriiafylyk", "Viktoriia Fylyk",
            new org.academy.kata.implementation.viktoriiafylyk.EightImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.SevenImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.SixImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.FiveImpl()),

    MARTYNOVA_KHRYSTYNA(3, "KhrystynaTs", "Khrystyna Martynova",
            new org.academy.kata.implementation.KhrystynaTs.EightImpl(),
            new org.academy.kata.implementation.KhrystynaTs.SevenImpl(),
            new org.academy.kata.implementation.KhrystynaTs.SixImpl(),
            new org.academy.kata.implementation.KhrystynaTs.FiveImpl()),

    MYKHAILENKO_MARIIA(4, "MMykha", "Mariia Mykhailenko",
            new org.academy.kata.implementation.MMykha.EightImpl(),
            new org.academy.kata.implementation.MMykha.SevenImpl(),
            new org.academy.kata.implementation.MMykha.SixImpl(),
            new org.academy.kata.implementation.MMykha.FiveImpl()),

    ZUBENKO_DMYTRO(5, "dima123493", "Dmytro Zubenko",
            new org.academy.kata.implementation.dima123493.EightImpl(),
            new org.academy.kata.implementation.dima123493.SevenImpl(),
            new org.academy.kata.implementation.dima123493.SixImpl(),
            new org.academy.kata.implementation.dima123493.FiveImpl()),

    ORYNCHAK_ANATOLII(6, "Anat0li1", "Anatolii Orynchak",
            new org.academy.kata.implementation.Anat0li1.EightImpl(),
            new org.academy.kata.implementation.Anat0li1.SevenImpl(),
            new org.academy.kata.implementation.Anat0li1.SixImpl(),
            new org.academy.kata.implementation.Anat0li1.FiveImpl()),

    TARASIUK_NAZAR(7, "adidvar", "Nazar Tarasiuk",
            new org.academy.kata.implementation.adidvar.EightImpl(),
            new org.academy.kata.implementation.adidvar.SevenImpl(),
            new org.academy.kata.implementation.adidvar.SixImpl(),
            new org.academy.kata.implementation.adidvar.FiveImpl()),

    KMET_ROMAN(8, "RomanKmet", "Roman Kmet",
            new org.academy.kata.implementation.RomanKmet.EightImpl(),
            new org.academy.kata.implementation.RomanKmet.SevenImpl(),
            new org.academy.kata.implementation.RomanKmet.SixImpl(),
            new org.academy.kata.implementation.RomanKmet.FiveImpl()),

    HRUSHA_NATALIIA(9, "HrushaNataliia", "Nataliia Hrusha",
            new org.academy.kata.implementation.HrushaNataliia.EightImpl(),
            new org.academy.kata.implementation.HrushaNataliia.SevenImpl(),
            new org.academy.kata.implementation.HrushaNataliia.SixImpl(),
            new org.academy.kata.implementation.HrushaNataliia.FiveImpl()),

    SLOBODIANIUK_DMYTRO(10, "DMSlobodianiuk", "Dmytro Slobodianiuk",
            new org.academy.kata.implementation.DMSlobodianiuk.EightImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.SevenImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.SixImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.FiveImpl()),

    KOVALETS_BOHDAN(11, "BohdanKovalets", "Bohdan Kovalets",
            new org.academy.kata.implementation.BohdanKovalets.EightImpl(),
            new org.academy.kata.implementation.BohdanKovalets.SevenImpl(),
            new org.academy.kata.implementation.BohdanKovalets.SixImpl(),
            new org.academy.kata.implementation.BohdanKovalets.FiveImpl()),

    VEREMIIENKO_BOHDAN(12, "novitskiiy", "Bohdan Veremiienko",
            new org.academy.kata.implementation.novitskiiy.EightImpl(),
            new org.academy.kata.implementation.novitskiiy.SevenImpl(),
            new org.academy.kata.implementation.novitskiiy.SixImpl(),
            new org.academy.kata.implementation.novitskiiy.FiveImpl()),

    FEDKO_ROMAN(13, "roman50021", "Roman Fedko",
            new org.academy.kata.implementation.roman50021.EightImpl(),
            new org.academy.kata.implementation.roman50021.SevenImpl(),
            new org.academy.kata.implementation.roman50021.SixImpl(),
            new org.academy.kata.implementation.roman50021.FiveImpl());


    private final int id;
    private final String githubUser;
    private final String name;
    private final IEight eight;
    private final ISeven seven;
    private final ISix six;
    private final IFive five;


    Authors(int id, String githubUser, String name, IEight eight, ISeven seven, ISix six, IFive five) {
        this.id = id;
        this.githubUser = githubUser;
        this.name = name;
        this.eight = eight;
        this.seven = seven;
        this.six = six;
        this.five = five;
    }

    public int getId() {
        return id;
    }

    public String getGithubUser() {
        return githubUser;
    }

    public String getName() {
        return name;
    }

    public IEight getEight() {
        return eight;
    }

    public ISeven getSeven() {
        return seven;
    }

    public ISix getSix() {
        return six;
    }

    public IFive getFive() {
        return five;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", githubUser='" + githubUser + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static Authors getById(int id) {
        for (Authors authors : values()) {
            if (authors.getId() == id) {
                return authors;
            }
        }
        return null;
    }

    public static void print() {
        for (Authors authors : values()) {
            System.out.println(authors);
        }
    }

}
