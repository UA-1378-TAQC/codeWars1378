package org.academy.util;

import org.academy.kata.IEight;
import org.academy.kata.IFive;
import org.academy.kata.ISeven;
import org.academy.kata.ISix;

import java.util.HashMap;
import java.util.Map;

public enum Authors {
    KOSIAK_IVANNA(1, "keepCalmGirl", "Ivanna Kosiak"),
    FYLYK_VIKTORIIA(2, "viktoriiafylyk", "Viktoriia Fylyk"),
    MARTYNOVA_KHRYSTYNA(3, "KhrystynaTs", "Khrystyna Martynova"),
    MYKHAILENKO_MARIIA(4, "MMykha", "Mariia Mykhailenko"),
    ZUBENKO_DMYTRO(5, "dima123493", "Dmytro Zubenko"),
    ORYNCHAK_ANATOLII(6, "Anat0li1", "Anatolii Orynchak"),
    TARASIUK_NAZAR(7, "adidvar", "Nazar Tarasiuk"),
    KMET_ROMAN(8, "RomanKmet", "Roman Kmet"),
    HRUSHA_NATALIIA(9, "HrushaNataliia", "Nataliia Hrusha"),
    SLOBODIANIUK_DMYTRO(10, "DMSlobodianiuk", "Dmytro Slobodianiuk"),
    KOVALETS_BOHDAN(11, "BohdanKovalets", "Bohdan Kovalets"),
    VEREMIIENKO_BOHDAN(12, "novitskiiy", "Bohdan Veremiienko"),
    FEDKO_ROMAN(13, "roman50021", "Roman Fedko");

    private final int id;
    private final String githubUser;
    private final String name;
    private final Map<Class<?>, Object> implementations = new HashMap<>();

    Authors(int id, String githubUser, String name) {
        this.id = id;
        this.githubUser = githubUser;
        this.name = name;
        loadImplementations();
    }

    private void loadImplementations() {
        String basePath = "org.academy.kata.implementation." + githubUser + ".";
        try {
            implementations.put(IEight.class, Class.forName(basePath + "EightImpl").getDeclaredConstructor().newInstance());
            implementations.put(ISeven.class, Class.forName(basePath + "SevenImpl").getDeclaredConstructor().newInstance());
            implementations.put(ISix.class, Class.forName(basePath + "SixImpl").getDeclaredConstructor().newInstance());
            implementations.put(IFive.class, Class.forName(basePath + "FiveImpl").getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.err.printf("Failed to load implementations for %s (%s): %s%n", name, githubUser, e);
        }
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

    @SuppressWarnings("unchecked")
    public <T> T getImplementation(Class<T> type) {
        return (T) implementations.get(type);
    }

    public IEight getEight() {
        return getImplementation(IEight.class);
    }

    public ISeven getSeven() {
        return getImplementation(ISeven.class);
    }

    public ISix getSix() {
        return getImplementation(ISix.class);
    }

    public IFive getFive() {
        return getImplementation(IFive.class);
    }

    @Override
    public String toString() {
        return id + ". " + name + " (" + githubUser + ")";
    }

    public static Authors getById(int id) {
        for (Authors author : values()) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public static void printAll() {
        System.out.println("Available authors:");
        for (Authors author : values()) {
            System.out.println(author);
        }
    }
}