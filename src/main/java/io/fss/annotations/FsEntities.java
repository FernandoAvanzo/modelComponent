package io.fss.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FsEntity{

    String MANY_TO_MANY="@ManyToMany";
    String MANY_TO_ONE="@ManyToOne";
    String ONE_TO_MANY="@OneToMany";
    String ONE_TO_ONE="@OneToOne";

    Class    classEntity()                             default Object.class;
    Class[]  entityFieldsType()                        default {};
    String[] entityFieldsName()                        default {};
    String[] entityColumnsName()                       default {};
    String[] entityColumnsType()                       default {};
    String   tableName()                               default "";
    String   queryAliasTable()                         default "";
    boolean  entityHasAnyCloumn()                      default true;
    boolean  entityHasEqualsNumberOfFieldsAndColumns() default false;
    int      entityNumbersOfColumns()                  default 0;
    int      entityNumbersOfFields()                   default 0;

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsEntityField{
        Class    validJoinQueryVarType()    default Object.class;
        Class    fieldType()                default Object.class;
        Class    compostFieldType()         default Object.class;
        Class    compostFieldClass()        default Object.class;
        Class    cursorJoinValueType()      default Object.class;
        Class    collectionElementType()    default Object.class;
        String[] compostFieldNames()        default {};
        String[] compostFieldAlias()        default {};
        String[] compostQueryVarName()      default {};
        String[] compostColumnsName()       default {};
        String[] compostColumnsType()       default {};
        String[] compostMethodGetNames()    default {};
        String[] compostMethodSetNames()    default {};
        String   fieldTypeName()            default "";
        String   fieldName()                default "";
        String   columnName()               default "";
        String   columnType()               default "";
        String   columnParam()              default "";
        String   columnSize()               default "";
        String   aliasName()                default "";
        String   queryVarName()             default "";
        String   validJoinQueryVarName()    default "";
        String   cursorJoinColumnName()     default "";
        String   nameMethodGet()            default "";
        String   nameMethodSet()            default "";
        boolean  compostFieldIsEntityType() default false;
        boolean  fieldHaveAlias()           default false;
        boolean  fieldHaveCardinality()     default false;
        boolean  hasCollectionType()        default false;
        boolean  hasColumnsInTable()        default true;
        boolean  hasVarsInQuery()           default false;
        boolean  isCompostType()            default false;
        boolean  isPimitive()               default false;
        boolean  isPrimaryKey()             default false;
        boolean  isForeginKey()             default false;
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface   FsCompostField{
        Class    compostFieldClass()          default Object.class;
        Class[]  compostMethodsSetParameter() default {};
        Class[]  compostMethodsGetReturn()    default {};
        String[] compostMethodsGet()          default {};
        String[] compostMethodsSet()          default {};
        String   compostFieldName()           default "";
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsFieldWhere{
        Class   fieldType()  default Object.class;
        String  fieldName()  default "";
        String  columnName() default "";
        String  columnType() default "";
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsEntityMethod{
        Class   methodReturn()        default void.class;
        Class   methodParamType()     default Object.class;
        String  methodReturnName()    default "";
        String  methodCategory()      default "";
        String  methodName()          default "";
        String  methodParamTypeName() default "";
        boolean haveReturn()          default false;
        boolean haveParameter()       default false;
        boolean isPrimitiveReturn()   default false;
        boolean isPrimitiveParam()    default false;
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsManyToMany{String cardinality() default MANY_TO_MANY;}

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsManyToOne{String cardinality() default MANY_TO_ONE;}

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsOneToMany{String cardinality() default ONE_TO_MANY;}

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FsOneToOne{String cardinality() default ONE_TO_ONE;}
}