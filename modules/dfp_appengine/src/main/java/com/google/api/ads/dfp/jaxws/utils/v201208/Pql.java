// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.jaxws.utils.v201208;

import com.google.api.ads.dfp.jaxws.v201208.BooleanValue;
import com.google.api.ads.dfp.jaxws.v201208.ColumnType;
import com.google.api.ads.dfp.jaxws.v201208.DateTime;
import com.google.api.ads.dfp.jaxws.v201208.DateTimeValue;
import com.google.api.ads.dfp.jaxws.v201208.NumberValue;
import com.google.api.ads.dfp.jaxws.v201208.ResultSet;
import com.google.api.ads.dfp.jaxws.v201208.Row;
import com.google.api.ads.dfp.jaxws.v201208.TextValue;
import com.google.api.ads.dfp.jaxws.v201208.Value;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

/**
 * A utility class for handling PQL objects. A typical use case is to combine
 * result sets from the PublisherQueryLanguageService to then create a CSV
 * such as:
 *
 * <pre>
 * <code>
 * ResultSet combinedResultSet = null
 * do {
 *   ResultSet resultSet = pqlService.select(pagedStatement);
 *   combinedResultSet = (combinedResultSet == null) ? resultSet :
 *       Pql.combineResultSet(combinedResultSet, resultSet);
 *   // ...
 * } while(!finishedCollectingResultSets)
 * //...
 * CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);
 * </code>
 * </pre>
 *
 * @author Adam Rogal.
 */
public final class Pql {

  /**
   * {@code Pql} is meant to be used statically.
   */
  private Pql() {}

  /**
   * Creates a {@link Value} from the value i.e. a {@link TextValue} for a
   * value of type {@code String}, {@link BooleanValue} for type
   * {@code Boolean}, {@link NumberValue} for type {@code Double},
   * {@code Long}, or {@code Integer}, and {@link DateTimeValue} for type
   * {@link DateTime}. If the value is a {@code Value}, the value is returned.
   * If the value is {@code null}, an empty {@link TextValue} is returned.
   *
   * @param value the value to convert
   * @return the constructed value of the appropriate type
   * @throws IllegalArgumentException if value cannot be converted
   */
  public static Value createValue(Object value) {
    if (value instanceof Value) {
      return (Value) value;
    } else if (value == null) {
      return new TextValue();
    } else {
      if (value instanceof Boolean) {
        BooleanValue booleanValue = new BooleanValue();
        booleanValue.setValue((Boolean) value);
        return booleanValue;
      } else if (value instanceof Double || value instanceof Long || value instanceof Integer) {
        NumberValue numberValue = new NumberValue();
        numberValue.setValue(value.toString());
        return numberValue;
      } else if (value instanceof String) {
        TextValue textValue = new TextValue();
        textValue.setValue((String) value);
        return textValue;
      } else if (value instanceof DateTime) {
        DateTimeValue dateTimeValue = new DateTimeValue();
        dateTimeValue.setValue((DateTime) value);
        return dateTimeValue;
      } else {
        throw new IllegalArgumentException("Unsupported Value type [" + value.getClass() + "]");
      }
    }
  }

  /**
   * Creates a String from the Value. DateTime values are converted
   * using the rules of {@link DateTimes#toStringWithTimeZone(DateTime)}.
   *
   * @param value the value to convert
   * @return the string representation of the value or an empty string for null
   * @throws IllegalArgumentException if value cannot be converted
   */
  public static String toString(Value value) {    
    Object unwrappedValue = getCsvValue(value);    
    if (unwrappedValue == null) {
      return "";
    } else {
      return unwrappedValue.toString();
    }
  }
  
  /**
   * Gets the underlying value of the {@code Value} object that's comparable
   * to what would be returned in any other API object (i.e. DateTimeValue
   * will return an API DateTime, not a Joda DateTime). 
   * 
   * @param value the value to convert
   * @returns the native value of {@code Value} or {@code null} if the
   *          underlying value is null    
   * @throws IllegalArgumentException if value cannot be converted
   */
  public static Object getApiValue(Value value) {       
    if (value instanceof BooleanValue) {
      return ((BooleanValue) value).isValue();
    } else if (value instanceof NumberValue) {
      if (((NumberValue) value).getValue() == null) {
        return null;
      } else {
        try {
          return NumberFormat.getInstance().parse(((NumberValue) value).getValue());
        } catch (ParseException e) {
          throw new IllegalStateException("Recieved invalid number format from API.");
        }
      }
    } else if (value instanceof TextValue) {
      return ((TextValue) value).getValue();
    } else if (value instanceof DateTimeValue) {
      return ((DateTimeValue) value).getValue();
    } else {
      throw new IllegalArgumentException("Unsupported Value type [" + value.getClass() + "]");
    }
  }
  
  /**
   * Gets the underlying value of the {@code Value} object that's considered
   * native to Java (i.e. DateTimeValue will return a Joda DateTime, not an API
   * DateTime).
   *
   * @param value the value to convert
   * @returns the native value of {@code Value} or {@code null} if the
   *          underlying value is null 
   * @throws IllegalArgumentException if value cannot be converted
   */
  public static Object getNativeValue(Value value) {
    Object apiValue = getApiValue(value);
    if (apiValue == null) {
      return null;
    } else if (apiValue instanceof DateTime) {
      return DateTimes.toDateTime((DateTime) apiValue);
    } else {
      return apiValue;
    }
  }
  
  /**
   * Gets the underlying value of the {@code Value} object that should be used
   * for CSV conversion (i.e. DateTimeValue will return a String representation,
   * but NumberValue will return a Long or Double).
   *    
   * @param value the value to convert
   * @returns the native value of {@code Value} or {@code null} if the
   *          underlying value is null 
   * @throws IllegalArgumentException if value cannot be converted
   */
  public static Object getCsvValue(Value value) {
    Object apiValue = getApiValue(value);
    if (apiValue == null) {
      return null;
    } else if (apiValue instanceof DateTime) {
      return DateTimes.toStringWithTimeZone((DateTime) apiValue);
    } else {
      return apiValue;
    }
  }
  
  /**
   * Gets the result set as list of string arrays, which can be transformed to
   * a CSV using {@code CsvFiles} such as
   * <pre>
   * <code>
   * ResultSet combinedResultSet = Pql.combineResultSet(resultSet1, resultSet2);
   * //...
   * combinedResultSet = Pql.combineResultSet(combinedResultSet, resultSet3);
   * CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);
   * </code>
   * </pre>
   *
   * @param resultSet the result set to convert to a CSV compatible format
   * @return a list of string arrays representing the result set
   */
  public static List<String[]> resultSetToStringArrayList(ResultSet resultSet) {
    List<String[]> stringArrayList = Lists.newArrayList();
    stringArrayList.add(getColumnLabels(resultSet).toArray(new String[] {}));
    if (resultSet.getRows() != null) {
      for (Row row : resultSet.getRows()) {
        try {
          stringArrayList.add(getRowStringValues(row).toArray(new String[] {}));
        } catch (IllegalArgumentException e) {
          throw new IllegalStateException("Cannot convert result set to string array list", e);
        }
      }
    }
    return stringArrayList;
  }

  /**
   * Gets the result set as a table representation in the form of:
   *
   * <pre>
   * +-------+-------+-------+
   * |column1|column2|column3|
   * +-------+-------+-------+
   * |value1 |value2 |value3 |
   * +-------+-------+-------+
   * |value1 |value2 |value3 |
   * +-------+-------+-------+
   * </pre>
   *
   * @param resultSet the result set to display as a string
   * @return the string representation of result set as a table
   * @throws IllegalAccessException if the values of the result set cannot be
   *          accessed
   */
  public static String resultSetToString(ResultSet resultSet) throws IllegalAccessException {
    StringBuilder resultSetStringBuilder = new StringBuilder();
    List<String[]> resultSetStringArrayList = resultSetToStringArrayList(resultSet);
    List<Integer> maxColumnSizes = getMaxColumnSizes(resultSetStringArrayList);
    String rowTemplate = createRowTemplate(maxColumnSizes);
    String rowSeparator = createRowSeperator(maxColumnSizes);

    resultSetStringBuilder.append(rowSeparator);
    for (int i = 0; i < resultSetStringArrayList.size(); i++) {
      resultSetStringBuilder.append(
          String.format(rowTemplate, (Object[]) resultSetStringArrayList.get(i))).append(
          rowSeparator);
    }
    return resultSetStringBuilder.toString();
  }

  /**
   * Creates the row template given the maximum size for each column
   *
   * @param maxColumnSizes the maximum size for each column
   * @return the row template to format row data into
   */
  private static String createRowTemplate(List<Integer> maxColumnSizes) {
    List<String> columnFormatSpecifiers = Lists.newArrayList();
    for (int maxColumnSize : maxColumnSizes) {
      columnFormatSpecifiers.add("%-" + maxColumnSize + "s");
    }
    return new StringBuilder("| ").append(Joiner.on(" | ").join(columnFormatSpecifiers)).append(
        " |\n").toString();
  }

  /**
   * Creates the row separator given the maximum size for each column
   *
   * @param maxColumnSizes the maximum size for each column
   * @return the row separator
   */
  private static String createRowSeperator(List<Integer> maxColumnSizes) {
    StringBuilder rowSeparator = new StringBuilder("+");
    for (int maxColumnSize : maxColumnSizes) {
        rowSeparator.append(Strings.repeat("-", maxColumnSize + 2)).append("+");
    }
    return rowSeparator.append("\n").toString();
  }

  /**
   * Gets a list of the maximum size for each column.
   *
   * @param resultSet the result set to process
   * @return a list of the maximum size for each column
   */
  private static List<Integer> getMaxColumnSizes(List<String[]> resultSet) {
    List<Integer> maxColumnSizes = Lists.newArrayList();
    for (int i = 0; i < resultSet.get(0).length; i++) {
      int maxColumnSize = -1;
      for (int j = 0; j < resultSet.size(); j++) {
        if (resultSet.get(j)[i].length() > maxColumnSize) {
          maxColumnSize = resultSet.get(j)[i].length();
        }
      }
      maxColumnSizes.add(maxColumnSize);

    }
    return maxColumnSizes;
  }

  /**
   * Gets the column labels for the result set.
   *
   * @param resultSet the result set to get the column labels for
   * @return the string list of column labels
   */
  public static List<String> getColumnLabels(ResultSet resultSet) {
    return Lists.transform(
        Lists.newArrayList(resultSet.getColumnTypes()), new Function<ColumnType, String>() {
      public String apply(ColumnType input) {
        return input.getLabelName();
      }
    });
  }

  /**
   * Gets the values in a row of the result set in the form of a string
   * list.
   *
   * @param row the row to get the values for
   * @return the string list of the row values
   */
  public static List<String> getRowStringValues(Row row) {
    return Lists.transform(Lists.newArrayList(row.getValues()), new Function<Value, String>() {
      public String apply(Value input) {
        return Pql.toString(input);
      }
    });
  }

  /**
   * Combines the first and second result sets, if and only if, the columns
   * of both result sets match.
   *
   * @throws IllegalArgumentException if the columns of the first result set
   *          don't match the second
   */
  public static ResultSet combineResultSets(ResultSet first, ResultSet second) {
    Function<ColumnType, String> columnTypeToString = new Function<ColumnType, String>() {
      public String apply(ColumnType input) {
        return input.getLabelName();
      }
    };
    List<String> firstColumns =
        Lists.transform(Lists.newArrayList(first.getColumnTypes()), columnTypeToString);
    List<String> secondColumns =
        Lists.transform(Lists.newArrayList(second.getColumnTypes()), columnTypeToString);
    if (!firstColumns.equals(secondColumns)) {
      throw new IllegalArgumentException(String.format(
          "First result set columns [%s] do not match second columns [%s]",
          Joiner.on(",").join(firstColumns), Joiner.on(",").join(secondColumns)));
    }
    List<Row> combinedRows = Lists.newArrayList(first.getRows());
    if (second.getRows() != null) {
      combinedRows.addAll(Lists.newArrayList(second.getRows()));
    }

    ResultSet combinedResultSet = new ResultSet();
    combinedResultSet.getColumnTypes().addAll(first.getColumnTypes());
    combinedResultSet.getRows().addAll(combinedRows);
    return combinedResultSet;
  }
}
