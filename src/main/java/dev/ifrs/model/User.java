package dev.ifrs.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class User extends PanacheEntity {
    
    private String name;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Message> messages;

    @ManyToMany
    private List<Channel> channels;

    public void addMessage (Message message){
        this.messages.add(message);
    }

     
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

}    

