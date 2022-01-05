/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proxyaplicacion;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProxyVideo implements IYouKonrad{

    private RealVideo rvideo;

    public ProxyVideo() {
        rvideo = new RealVideo();
    }

    @Override
    public String videoPeque(int indice) {
        
        return rvideo.videoPeque(indice);
        
    }

    @Override
    public String Videogrande(int indice) {
        return rvideo.Videogrande(indice);
    }

    @Override
    public String playVideo(int indice) {
        return null;
    }

}
