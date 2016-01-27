package com.example.litra;

import java.util.ArrayList;
import java.util.List;

public class Work {
    private String name;
    private String author;

    public Work(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

        public class WorkStore {
            private static final WorkStore instance = new Work();
            private List<Work> works;

            private WorkStore() {
                works = new ArrayList<>();
                works.add(new Work("Автор1", "Название1"));
                works.add(new Work("Автор2", "Название2"));
            }

            public static WorkStore getInstance() {
                return instance;
            }

            public List<Work> getWorks() {
                return works;
            }
        }
    }
