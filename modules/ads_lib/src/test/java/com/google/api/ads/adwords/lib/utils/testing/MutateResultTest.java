// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

import javax.annotation.Nullable;

/**
 * Base class for testing {@code MutateResult} and its properties.
 */
@RunWith(JUnit4.class)
public abstract class MutateResultTest<
    GeneratedMutateResultT, UtilMutateResultT, GeneratedErrorListT, UtilErrorListT> {

  private Class<GeneratedMutateResultT> generatedMutateResultClass;
  private Class<UtilMutateResultT> utilMutateResultClass;
  private Class<GeneratedErrorListT> generatedErrorListClass;
  private Class<UtilErrorListT> utilErrorListClass;

  protected MutateResultTest(
      Class<GeneratedMutateResultT> generatedMutateResultClass,
      Class<UtilMutateResultT> utilMutateResultClass,
      Class<GeneratedErrorListT> generatedErrorListClass,
      Class<UtilErrorListT> utilErrorListClass) {
    this.generatedMutateResultClass = generatedMutateResultClass;
    this.utilMutateResultClass = utilMutateResultClass;
    this.generatedErrorListClass = generatedErrorListClass;
    this.utilErrorListClass = utilErrorListClass;
  }

  /**
   * Asserts that the set of fields on {@code UtilMutateResultT} matches the set of fields on
   * {@code GeneratedMutateResultT}.
   */
  @Test
  public void testMutateResultMatchesGeneratedClass() throws Exception {
    assertMatchesGeneratedClass(
        generatedMutateResultClass,
        utilMutateResultClass,
        Sets.newHashSet("index", "operand", "errorList"));
  }

  /**
   * Asserts that the set of fields on {@code UtilErrorListResultT} matches the set of fields on
   * {@code GeneratedErrorListResultT}.
   */
  @Test
  public void testErrorListMatchesGeneratedClass() throws Exception {
    assertMatchesGeneratedClass(
        generatedErrorListClass, utilErrorListClass, Sets.newHashSet("errors"));
  }

  /**
   * Asserts that the generated class and the utility class have the same set of fields, and that
   * they match the field names in {@code expectedFields}. This will catch the case where new
   * attributes were added to the generated class but not to the utility class, which is important
   * because each {@code BatchJobHelper} assumes that the fields on the two classes are identical.
   */
  private <GeneratedT, UtilT> void assertMatchesGeneratedClass(
      Class<GeneratedT> generatedClass, Class<UtilT> utilityClass, Set<String> expectedFields) {
    Field[] utilClassFields = utilityClass.getFields();
    Field[] cmClassFields = generatedClass.getFields();
    assertEquals(
        "Number of fields on utility class and generated class does not match",
        utilClassFields.length,
        cmClassFields.length);
    Ordering<Field> fieldOrdering =
        new Ordering<Field>() {
          @Override
          public int compare(@Nullable Field left, @Nullable Field right) {
            return left.getName().compareTo(right.getName());
          }
        };
    Arrays.sort(utilClassFields, fieldOrdering);
    Arrays.sort(cmClassFields, fieldOrdering);
    for (int i = 0; i < utilClassFields.length; i++) {
      Field utilField = utilClassFields[i];
      Field cmField = cmClassFields[i];
      assertEquals("Field names don't match", cmField.getName(), utilField.getName());
      assertThat("Unexpected field encountered", cmField.getName(), Matchers.isIn(expectedFields));
    }
  }
}
