package br.edu.utfpr.magneira.gastandopouco.gastandopoucoapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;

@Entity(tableName = "tipos",
        indices = @Index(value = {"descricao"}, unique = true))
public class Tipo {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private String descricao;

    private Date dataCadastro;

    /* Para utilizar o Room, caso exista construtor com parâmetros as variáveis dos parâmetros
       devem ter o mesmo nome dos atributos persistidos da classe.

       Caso um atributo persistido não sejm público, deve existir os métodos get e set
       apropriadas para este atributo, e o nome dos métodos devem seguir as Convenções de código
       do Java

       É recomendável criar indices para os campos que armazenam chaves extrangeiras, caso não
       faça é gerado um warning*/

    public Tipo(String descricao){
        setDescricao(descricao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NonNull String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString(){
        return getDescricao();
    }
}
