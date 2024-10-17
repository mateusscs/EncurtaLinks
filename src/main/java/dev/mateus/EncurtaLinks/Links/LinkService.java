package dev.mateus.EncurtaLinks.Links;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LinkService {
    //URL encurtada
    private LinkRepository linkRepo;

    public LinkService(LinkRepository linkRepo)
    {
        this.linkRepo = linkRepo;
    }


    public String gerarUrlAleatoria(){
        return RandomStringUtils.randomAlphanumeric(5,10);
    }

    public Link encurtarURL(String urlOriginal){
        Link link = new Link();
        link.setUrlLonga(urlOriginal);
        link.setUrlEncurtada(gerarUrlAleatoria());
        link.setUrlcriadaEm(LocalDateTime.now());
        link.setUrlQrCode("QR CODE VAZIO");
        return linkRepo.save(link);
    }



    public Link obterUrlOriginal(String urlEncurtada){
        try{
            return linkRepo.findByUrlEncurtada(urlEncurtada);
        }catch (Exception e){
            throw new RuntimeException("URL nao existe",e);
        }
    }


}
