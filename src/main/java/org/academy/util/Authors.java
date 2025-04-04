package org.academy.util;

import org.academy.kata.IEight;
import org.academy.kata.IFive;
import org.academy.kata.ISeven;
import org.academy.kata.ISix;
import org.academy.kata.implementation.keepCalmGirl.EightImpl;
import org.academy.kata.implementation.keepCalmGirl.FiveImpl;
import org.academy.kata.implementation.keepCalmGirl.SevenImpl;
import org.academy.kata.implementation.keepCalmGirl.SixImpl;

public enum Authors {
    KOSIAK_IVANNA(1,
            "keepCalmGirl",
            "Ivanna Kosiak",
            new org.academy.kata.implementation.keepCalmGirl.EightImpl(),
            new org.academy.kata.implementation.keepCalmGirl.SevenImpl(),
            new org.academy.kata.implementation.keepCalmGirl.SixImpl(),
            new org.academy.kata.implementation.keepCalmGirl.FiveImpl());


    private final int id;
    private final String githubUser;
    private final String name;
    private final IEight eight;
    private final ISeven seven;
    private final ISix six;
    private final IFive five;


    Authors(int id, String githubUser, String name, EightImpl eight, SevenImpl seven, SixImpl six, FiveImpl five) {
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
        for (Authors author : values()) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }
    public static void print() {
        for (Authors author : values()) {
            System.out.println(author);
        }
    }

}
