package io.fss.model.entities;

import io.fss.annotations.FsEntities;
import io.fss.annotations.FsEntities.FsEntityField;
import io.fss.annotations.FsEntities.FsCompostField;
import io.fss.annotations.FsEntities.FsFieldWhere;
import io.fss.annotations.FsEntities.FsEntityMethod;

@FsEntities
public class PessoaEtn extends EntityDefault{
    private static final Class clz=PessoaEtn.class;

    private Long idPessoa;

    public PessoaEtn(){
        super(clz,clz.getDeclaredFields(),clz.getDeclaredMethods());
    }
}