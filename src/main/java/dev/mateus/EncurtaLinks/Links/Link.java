package dev.mateus.EncurtaLinks.Links;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "links")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlLonga;
    private String urlEncurtada;
    private String urlQrCode;
    private LocalDateTime urlcriadaEm;

    public Link() {
    }

    public Link(Long id, String urlLonga, String urlEncurtada, String urlQrCode, LocalDateTime urlcriadaEm) {
        this.id = id;
        this.urlLonga = urlLonga;
        this.urlEncurtada = urlEncurtada;
        this.urlQrCode = urlQrCode;
        this.urlcriadaEm = urlcriadaEm;
    }

    public Link(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlLonga() {
        return urlLonga;
    }

    public void setUrlLonga(String urlLonga) {
        this.urlLonga = urlLonga;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    public String getUrlQrCode() {
        return urlQrCode;
    }

    public void setUrlQrCode(String urlQrCode) {
        this.urlQrCode = urlQrCode;
    }

    public LocalDateTime getUrlcriadaEm() {
        return urlcriadaEm;
    }

    public void setUrlcriadaEm(LocalDateTime urlcriadaEm) {
        this.urlcriadaEm = urlcriadaEm;
    }
}
