package com.shagil.siddiqui.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gauravgarg on 19/7/17.
 */
@Entity
public class OptionResponse implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;
    @Column(name = "option_text",nullable = false)
    private String optionText;
    @Column(name = "qid",nullable = false)
    private Integer qid;
//    @Column(name = "rid",nullable = false)
//    private Integer rid;
    //@GeneratedValue(generator = "response_table_seq",strategy = GenerationType.TABLE)
    //@TableGenerator(name = "response_table_seq",table = "response_table",pkColumnName = "id",valueColumnName = "rid",pkColumnValue = "id")
    @ManyToOne()
    @JoinColumn(name = "rid", nullable = false)
    @JsonBackReference
    private Response response;

    public OptionResponse() {
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


//    public Integer getRid() {
//        return rid;
//    }
//
//    public void setRid(Integer rid) {
//        this.rid = rid;
//    }


    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "OptionResponse{" +
                "id=" + id +
                ", optionText='" + optionText + '\'' +
                ", qid=" + qid +
                ", response=" + response +
                '}';
    }
}
