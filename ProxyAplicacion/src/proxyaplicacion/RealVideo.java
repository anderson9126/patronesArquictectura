/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxyaplicacion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RealVideo implements IYouKonrad {

    private ArrayList<Video> videos;

    public RealVideo() {
        videos = new ArrayList<Video>();
        llenarVideos();
    }

    @Override
    public String videoPeque(int indice) {
        return videos.get(indice).getPeque();
    }

    @Override
    public String Videogrande(int indice) {
        return videos.get(indice).getGrande();
    }

    @Override
    public String playVideo(int indice) {
        return videos.get(indice).getVideo();
    }

    public void llenarVideos() {
        String archivo;
        File directorio;
        try {
            directorio = new File("src");
            archivo = directorio.getCanonicalPath();

            String peque = "/assets/miniaturas/img1.png";
            String grande = "/assets/images/vid1.gif";
            String video = archivo + "/assets/videos/video1.mp4";

            videos.add(new Video(peque, grande, video));

            peque = "/assets/miniaturas/img2.png";
            grande = "/assets/images/vid2.gif";
            video = archivo + "/assets/videos/video2.mp4";

            videos.add(new Video(peque, grande, video));

            peque = "/assets/miniaturas/img3.png";
            grande = "/assets/images/vid3.gif";
            video = archivo + "/assets/videos/video3.mp4";

            videos.add(new Video(peque, grande, video));

        } catch (IOException e) {
            System.out.println("Error al cargar los archivos");
        }
    }
}
