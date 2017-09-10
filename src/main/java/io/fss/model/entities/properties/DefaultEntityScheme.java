package io.fss.model.entities.properties;

import io.fss.annotations.FsEntities;
import io.fss.annotations.FsEntities.FsEntityField;
import io.fss.annotations.FsEntities.FsCompostField;
import io.fss.annotations.FsEntities.FsFieldWhere;
import io.fss.annotations.FsEntities.FsEntityMethod;
import io.fss.model.entities.properties.FsEntitiesProperties.EntityScheme;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class DefaultEntityScheme implements EntityScheme{

    @Override
    public void addEntity(Class entityClass){}
    @Override
    public void addFields(Field[] fields){}
    @Override
    public void addMethods(Method[] methods){}
    @Override
    public void addField(Field field){}
    @Override
    public void addField(String fieldName){}
    @Override
    public void addGetMethod(Method method){}
    @Override
    public void addGetMethod(String methodName){}
    @Override
    public void addSetMethod(Method method){}
    @Override
    public void addSetMethod(String methodName){}
}