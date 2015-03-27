package com.marc.skeleton.models;

public class SkeletonModel {

    private Integer id;
    private String name;
    private String adjective;

    public SkeletonModel(Integer id, String name, String adjective) {
        this.id = id;
        this.name = name;
        this.adjective = adjective;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }
}
