package io.fss.model.entities.properties;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static io.fss.model.entities.properties.DefaultEntitiesProperties.CONST_ENTITIES_PROPERTIES;

public interface FsEntitiesProperties{

    FsEntitiesProperties ENTITIES_PROPERTIES=CONST_ENTITIES_PROPERTIES;

    EntityScheme makeScheme();

    interface EntityScheme{
        void addEntity(Class entityClass);
        void addFields(Field[] fields);
        void addMethods(Method[] methods);
        void addField(Field field);
        void addField(String fieldName);
        void addGetMethod(Method method);
        void addGetMethod(String methodName);
        void addSetMethod(Method method);
        void addSetMethod(String methodName);
    }
}
