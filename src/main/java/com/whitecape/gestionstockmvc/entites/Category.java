package com.whitecape.gestionstockmvc.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;


@Entity
public class Category implements Serializable {
@Id
@GeneratedValue
        private Long idCategory;
        private String code;
        private String designation;



        @OneToMany(mappedBy = "category")
        public List <Article> articleList;


        public Long getIdCategory() {
                return idCategory;
        }

        public void setIdCategory(Long idCategory) {
                this.idCategory = idCategory;
        }

        public String getCode() {
                return code;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public String getDesignation() {

                return designation;
        }

        public void setDesignation(String designation) {

                this.designation = designation;
        }

        public List < Article > getArticleList() {
                return articleList;
        }

        public void setArticleList(List < Article > articleList) {

                this.articleList = articleList;
        }

        public Category() {
        }

        public Category(String code, String designation, List < Article > articleList) {
                this.code = code;
                this.designation = designation;
                this.articleList = articleList;
        }
}
