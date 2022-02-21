package com.ngoc.northwind;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Sales_reports implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String group_by;
    private String display;
    private String title;
    private String filter_row_source;
    // default TINYINT(1)

    public Sales_reports(){

    }

    public Sales_reports(String group_by, String display, String title, String filter_row_source) {
        this.group_by = group_by;
        this.display = display;
        this.title = title;
        this.filter_row_source = filter_row_source;
    }

    public String getGroup_by() {
        return group_by;
    }

    public void setGroup_by(String group_by) {
        this.group_by = group_by;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilter_row_source() {
        return filter_row_source;
    }

    public void setFilter_row_source(String filter_row_source) {
        this.filter_row_source = filter_row_source;
    }
    @Override
    public String toString(){
        return "Sales_reports{" +
                "group_by=" + group_by + '\'' +
                ", display='" + display+ '\'' +
                ", title='" + title + '\'' +
                ", filter_row_source='" + filter_row_source + '\'' +
                '}';
    }
}
