package com.training.smservices.impl;

import com.training.datastore.SocialMediaDataStore;
import com.training.sm.dto.SocialMedia;
import com.training.smservices.SocialMediaServices;
import org.junit.jupiter.api.*;


import javax.swing.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)

class SocialMediaServicesImplTest {
    @Test
    @DisplayName("1")
    void createContent(){
        System.out.println("Add content");
        System.out.println("--------------------------------------");
        LocalDate date = LocalDate.now();
        LocalDate a = LocalDate.parse("2021-08-27");
        LocalDate b = LocalDate.parse("2023-08-27");
        SocialMediaServices ins = new SocialMediaServicesImpl();
        SocialMedia SM = new SocialMedia("facebook","post","food",a);
        SocialMedia SM2 = new SocialMedia("youtube","video","travel",date);
        SocialMedia SM3 = new SocialMedia("instagram","video","travel",date);
        SocialMedia SM4 = new SocialMedia("snap","post","food",b);
        SocialMedia SM5 = new SocialMedia("youtube","video","sports",a);
        SocialMedia SM6 = new SocialMedia("instagram","video","food",date);
        ins.createContent(SM);
        ins.createContent(SM2);
        ins.createContent(SM3);
        ins.createContent(SM4);
        ins.createContent(SM5);
        ins.createContent(SM6);
        SocialMediaDataStore.getMap().forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
    @Test
    @DisplayName("2")
    void viewContent(){
        System.out.println("---------------------------------------");
        System.out.println("Display");
        SocialMediaServices view = new SocialMediaServicesImpl();
        view.viewContent(3);
    }

    @Test
    @DisplayName("3")
    void deleteContent(){
        System.out.println("----------------------------------------------");
        System.out.println("Delete");
        SocialMediaServices del = new SocialMediaServicesImpl();
        del.deleteContent(10);
        SocialMediaDataStore.getMap().forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
    @Test
    @DisplayName("4")
    void editContent(){
        System.out.println("-----------------------------------------------");
        System.out.println("update");
        LocalDate date = LocalDate.now();
        SocialMediaServices edit = new SocialMediaServicesImpl();
        int id1 = 1;
//        int id2 =3;
        SocialMedia SM1 = new SocialMedia("YouTube","video","sports",date);
//        SocialMedia SM2 = new SocialMedia("Instagram","video","travel",date);
        edit.editContent(id1,SM1);
        SocialMediaDataStore.getMap().forEach((key,value)->{
            System.out.println(key+" "+value);
        });

//        edit.editContent(id2,SM2);
     }
     @Test
     @DisplayName("5")
    void searchContent(){
         System.out.println("--------------------------------------");
         System.out.println("Search");
         LocalDate a = LocalDate.parse("2022-08-28");
         LocalDate b = LocalDate.parse("2022-08-26");
//         System.out.println("Date :" + a);
         SocialMediaServices search = new SocialMediaServicesImpl();
         search.searchContent(a,b);
     }



}