package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class DataCalc {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String name;
private Integer result ;
private Integer formula;
private String edit;

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Integer getResult() {
    return result;
}
public void setResult(Integer result) {
    this.result = result;
}
public Integer getFormula() {
    return formula;
}
public void setFormula(Integer formula) {
    this.formula = formula;
}
public String getEdit() {
    return edit;
}
public void setEdit(String edit) {
    this.edit = edit;
}
@Override
public String toString() {
    return "DataCalc [id=" + id + ", name=" + name + ", result=" + result + ", formula=" + formula + ", edit=" + edit + "]";
}
}