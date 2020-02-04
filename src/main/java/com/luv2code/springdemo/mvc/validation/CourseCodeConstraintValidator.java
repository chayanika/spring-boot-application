package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.Annotation;

/**
 * @author Chayanika Ghosh
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String[] coursePrefixes;


    public void initialize(CourseCode theCourseCode) {
        coursePrefixes = theCourseCode.value();
    }

    public  boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext){
        boolean result = false;

        if (theCode != null) {

        for (String tempPrefix : coursePrefixes) {
            result = theCode.startsWith(tempPrefix);
            if (result) {
                break;
            }
        }
        }else{
            result = true;
        }
        return result;
    }

    public String value() {
        return null;
    }

    public String message() {
        return null;
    }

    public Class<?>[] groups() {
        return new Class[0];
    }

    public Class<? extends Payload>[] payload() {
        return new Class[0];
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
