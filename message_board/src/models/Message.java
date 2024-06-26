package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Message {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInteger;
    
    @Column(name="title",length=255,nullable=false)
    private String title;
    
    @Column(name = "content", length = 255, nullable = false)
    private String content;
    
    @Column(name="created_at",nullable=false)
    private Timestamp created_at;
    
    @Column(name="update_at",nullable=false)
    private Timestamp updated_at;
    
    public Integer getId() {
        return idInteger;
    }
    public void setId(Integer id) {
        this.idInteger=id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}