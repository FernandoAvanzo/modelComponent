package io.fss.model.entities.properties;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

enum DefaultEntitiesProperties implements FsEntitiesProperties{
    CONST_ENTITIES_PROPERTIES;

    @Override
    public EntityScheme makeScheme(){return new DefaultEntityScheme();}
}