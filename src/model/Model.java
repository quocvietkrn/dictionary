
package model;

import controller.Manager;


public class Model {
 String english;
 String vietnam;
 
 public      Model() {
     
 }
 
  public Model(String english, String vietnam) {
        this.english = english;
        this.vietnam = vietnam;
  }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnam() {
        return vietnam;
    }

    public void setVietnam(String vietnam) {
        this.vietnam = vietnam;
    }
}
