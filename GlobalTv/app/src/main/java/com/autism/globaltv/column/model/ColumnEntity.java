package com.autism.globaltv.column.model;

/**
 * Author：i5 on 2017/4/6 11:34
 * Used:GlobalTv
 */
public class ColumnEntity {

    /**
     * first_letter : L
     * id : 1
     * image : http://image.quanmin.tv/4518e1f7c347c3e78fc5fd9bba6cb6b2png
     * name : 英雄联盟
     * priority : 0
     * prompt : 1
     * screen : 0
     * slug : lol
     * status : 0
     * thumb : http://image.quanmin.tv/ca3d8b85f3b19ef7171f4435ce03ebcapng
     */

    private String first_letter;
    private int id;
    private String image;
    private String name;
    private int priority;
    private int prompt;
    private int screen;
    private String slug;
    private int status;
    private String thumb;

    public String getFirst_letter() {
        return first_letter;
    }

    public void setFirst_letter(String first_letter) {
        this.first_letter = first_letter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPrompt() {
        return prompt;
    }

    public void setPrompt(int prompt) {
        this.prompt = prompt;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
