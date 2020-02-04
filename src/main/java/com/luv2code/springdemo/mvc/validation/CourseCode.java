package com.luv2code.springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Chayanika Ghosh
 */
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String[] value() default {"LUV","TOPS"};

    public String message() default "must start with LUV";

    public Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default{};

}
