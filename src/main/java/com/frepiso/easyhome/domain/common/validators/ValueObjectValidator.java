package com.frepiso.easyhome.domain.common.validators;

import com.frepiso.easyhome.domain.common.anotations.ValueObject;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValueObjectValidator implements ConstraintValidator<ValueObject, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        Class<?> clazz = value.getClass();
        return clazz.isRecord();
    }
}
