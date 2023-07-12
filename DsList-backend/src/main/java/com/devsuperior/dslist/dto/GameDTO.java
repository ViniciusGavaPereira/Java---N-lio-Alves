package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import org.springframework.beans.BeanUtils;

public class GameDTO {
     
   
    private Long id;
    private String title;

    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

  
    private String shortDescription;

    
    private String longDescription;

    public GameDTO(){

    }

    public GameDTO(Game entity){
        //Forma diferente de transformar uma entidade em dto sem ter que ficar escrevendo demais.
       BeanUtils.copyProperties(entity,this);
    }

    public Long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

   

    public Integer getYear() {
        return year;
    }


    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }


}
