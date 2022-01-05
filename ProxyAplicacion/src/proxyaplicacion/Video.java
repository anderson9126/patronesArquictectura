/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxyaplicacion;

public class Video {

    private String  peque;
    private String grande;
    private String video;

    public Video(String peque, String grande, String video) {
        this.peque = peque;
        this.grande = grande;
        this.video = video;
    }



    public String getPeque() {
        return peque;
    }

    public void setPeque(String peque) {
        this.peque = peque;
    }

    public String getGrande() {
        return grande;
    }

    public void setGrande(String grande) {
        this.grande = grande;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }



}
