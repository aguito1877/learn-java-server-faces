/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Future;
import model.Cartao;

/**
 *
 * @author ciro
 */
@Named(value = "pagamento")
@RequestScoped
public class Pagamento {
    private Double valor;
    private Cartao cartao;
    @Future
    private Date validade;

    /**
     * Creates a new instance of Pagamento
     */
    public Pagamento() {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
}
