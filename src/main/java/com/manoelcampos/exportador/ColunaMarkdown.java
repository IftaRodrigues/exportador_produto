/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manoelcampos.exportador;

import java.util.function.Function;

/**
 *
 * @author iftar
 */
class ColunaMarkdown extends AbstractColuna {

    public ColunaMarkdown(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "|";
    }

    @Override
    public String fechar() {
        return "";
    }

}
