package com.training.smservices.impl;

import com.training.datastore.SocialMediaDataStore;
import com.training.sm.dto.SocialMedia;
import com.training.smservices.SocialMediaServices;

import java.time.LocalDate;

import static java.util.Collections.max;

public class SocialMediaServicesImpl implements SocialMediaServices {
    private int idGenerator(){
        int id;
        if(SocialMediaDataStore.getMap().size() == 0){
            id = 1;
        }
        else{
            id = max(SocialMediaDataStore.getMap().keySet())+1;
        }
        return id;
    }

    public int createContent(SocialMedia socialMedia){
        int id = idGenerator();
        SocialMediaDataStore.getMap().put(id,socialMedia);
        return id;
    }
    public void deleteContent(int key ){
        SocialMediaDataStore.getMap().remove(key);
    }

    public void viewContent(int id) {
        if(SocialMediaDataStore.getMap().containsKey(id)){
            System.out.println(SocialMediaDataStore.getMap().get(id));
        }
        else{
            System.out.println("Key not found!");
        }
    }

    public void editContent(int id, SocialMedia sm) {
        if(SocialMediaDataStore.getMap().containsKey(id)){
            if(SocialMediaDataStore.getMap().equals(sm)){
                System.out.println("Content already exist");
            }
            else{
                SocialMediaDataStore.getMap().replace(id,sm);
            }
        }
    }
    public void searchContent(LocalDate a,LocalDate b){

        for( var i:SocialMediaDataStore.getMap().values()){
            if(i.getDate().isBefore(a) && i.getDate().isAfter(b)){
                System.out.println(i);
            }
        }
    }



}
