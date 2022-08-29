package com.training.datastore;

import com.training.sm.dto.SocialMedia;

import java.util.HashMap;

public class SocialMediaDataStore {
    private static HashMap<Integer, SocialMedia> map= new HashMap<Integer, SocialMedia>();

    private SocialMediaDataStore() {}

    public static HashMap <Integer, SocialMedia> getMap(){
        return map;
    }
}
