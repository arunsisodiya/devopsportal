package com.accenture.devops.beans;

import javax.persistence.*;
import java.util.List;

/**
 * Created by arun.singh.sisodiya on 2/21/2017.
 */
@Entity
@Table(name="tool_list")
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name = "category")
    private String category;
    @Column(name="tools_list")
    private String toolList;

    public Tools() {
    }

    public Tools(String category, String toolList) {
        this.category = category;
        this.toolList = toolList;
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getToolList() {
        return toolList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setToolList(String toolList) {
        this.toolList = toolList;
    }
}
