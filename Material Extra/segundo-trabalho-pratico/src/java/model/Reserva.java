/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.validation.constraints.Future;

/**
 *
 * @author tunnes (Ayrton Felipe)
 * @author gmoraiz (Gabriel Morais)
 * @author tarcisioLima (Tarcisio Lima)
 * 
 */

public class Reserva{

    private String destino;
    private String horario;
    private Double preco;
    private String nome;
    private CPF documento;
    @Future
    private Date data;

    public Reserva() {
        
    }
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getPreco() {
        switch (this.destino) {
            case "SAO":
                if("H0".equals(this.horario)){ this.preco = 250.65; } else { this.preco = 343.67; }
                break;
            case "RIO":
                if("H0".equals(this.horario)){ this.preco = 380.50; } else { this.preco = 425.70; }                
                break;
            case "CAM":
                if("H0".equals(this.horario)){ this.preco = 298.00; } else { this.preco = 383.30; }                
                break;
            case "CUR":
                if("H0".equals(this.horario)){ this.preco = 469.70; } else { this.preco = 570.20; }                
                break;                
        }        
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CPF getDocumento() {
        return documento;
    }

    public void setDocumento(CPF documento) {
        this.documento = documento;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
