/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instantegram;

/**
 *
 * @author proae
 */
public class Usuario {
    private final String nome;
    private final String sobrenome;
    private final String sexo;

    public Usuario(String nome, String sobrenome, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }
    
}
