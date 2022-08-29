package com.training.smservices;

import com.training.sm.dto.SocialMedia;

import java.time.LocalDate;

public interface SocialMediaServices {

    public int createContent(SocialMedia sm);

    public void deleteContent(int key);

    public void viewContent(int id);

    public void editContent(int id, SocialMedia sm);

    public void searchContent(LocalDate a,LocalDate b);

}
