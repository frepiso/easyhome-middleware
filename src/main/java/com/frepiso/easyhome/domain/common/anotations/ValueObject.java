package com.frepiso.easyhome.domain.common.anotations;

import com.frepiso.easyhome.domain.common.validators.ValueObjectValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValueObjectValidator.class)
public @interface ValueObject {
    String message() default "Annotation @ValueObject can only be applied to record";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
