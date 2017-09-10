package io.fss.model.entities;

import io.fss.model.entities.properties.FsEntitiesProperties;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface FsEntity extends FsEntitiesProperties{
    void setDefault(FsEntity entity);
    FsEntity getDefault();
}