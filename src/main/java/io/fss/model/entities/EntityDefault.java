package io.fss.model.entities;

import io.fss.model.entities.properties.FsEntitiesProperties;
import io.fss.model.entities.properties.FsEntitiesProperties.EntityScheme;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class EntityDefault implements FsEntity{

    private EntityScheme rootEntityScheme;
    private EntityScheme defaultEntityScheme;

    public EntityDefault(){super();}

    EntityDefault(Class clazz, Field[] fields, Method[] methods){
        super();
        loadDefaultScheme(clazz,fields,methods);
    }

    @Override
    public EntityScheme makeScheme(){return ENTITIES_PROPERTIES.makeScheme();}

    @Override
    public FsEntity getDefault(){return null;}

    @Override
    public void setDefault(FsEntity entity){}

    final void loadDefaultScheme(Class clazz, Field[] fields, Method[] methods){
        defaultEntityScheme=makeScheme();
        processScheme(defaultEntityScheme,clazz,fields,methods);
    }

    final void loadRootScheme(Class clazz, Field[] fields, Method[] methods){
        rootEntityScheme=makeScheme();
        processScheme(rootEntityScheme,clazz,fields,methods);
    }

    private final void processScheme(EntityScheme entityScheme, Class clazz, Field[] fields, Method[] methods){
        entityScheme.addEntity(clazz);
        entityScheme.addFields(fields);
        entityScheme.addMethods(methods);
    }
}