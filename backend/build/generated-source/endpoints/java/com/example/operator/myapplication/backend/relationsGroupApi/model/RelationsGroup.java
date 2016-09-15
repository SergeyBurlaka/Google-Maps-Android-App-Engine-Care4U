/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-07-08 17:28:43 UTC)
 * on 2016-09-15 at 15:40:05 UTC 
 * Modify at your own risk.
 */

package com.example.operator.myapplication.backend.relationsGroupApi.model;

/**
 * Model definition for RelationsGroup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the relationsGroupApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RelationsGroup extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonMap employeeEmailKeyMap;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonMap employeeList;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonMap employeeRequestsList;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managerEmail;

  /**
   * @return value or {@code null} for none
   */
  public JsonMap getEmployeeEmailKeyMap() {
    return employeeEmailKeyMap;
  }

  /**
   * @param employeeEmailKeyMap employeeEmailKeyMap or {@code null} for none
   */
  public RelationsGroup setEmployeeEmailKeyMap(JsonMap employeeEmailKeyMap) {
    this.employeeEmailKeyMap = employeeEmailKeyMap;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JsonMap getEmployeeList() {
    return employeeList;
  }

  /**
   * @param employeeList employeeList or {@code null} for none
   */
  public RelationsGroup setEmployeeList(JsonMap employeeList) {
    this.employeeList = employeeList;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JsonMap getEmployeeRequestsList() {
    return employeeRequestsList;
  }

  /**
   * @param employeeRequestsList employeeRequestsList or {@code null} for none
   */
  public RelationsGroup setEmployeeRequestsList(JsonMap employeeRequestsList) {
    this.employeeRequestsList = employeeRequestsList;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getManagerEmail() {
    return managerEmail;
  }

  /**
   * @param managerEmail managerEmail or {@code null} for none
   */
  public RelationsGroup setManagerEmail(java.lang.String managerEmail) {
    this.managerEmail = managerEmail;
    return this;
  }

  @Override
  public RelationsGroup set(String fieldName, Object value) {
    return (RelationsGroup) super.set(fieldName, value);
  }

  @Override
  public RelationsGroup clone() {
    return (RelationsGroup) super.clone();
  }

}
