package com.google.api.ads.adwords.lib.selectorfields;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation to mark a field as "filterable".
 *
 * The annotation is present to allow the creation of selectors automatically if the user decides
 * to do so.
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface Filterable {
}
