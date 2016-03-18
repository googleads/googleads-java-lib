
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkMutateJobError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BulkMutateJobError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN_RETURN_RESULT_FOR_ONLY_COMPLETED_JOBS"/>
 *     &lt;enumeration value="CAN_RETURN_RESULT_FOR_ONLY_ONE_JOB"/>
 *     &lt;enumeration value="CANNOT_UPDATE_JOB_ONCE_ALL_REQUEST_PARTS_ARE_RECEIVED"/>
 *     &lt;enumeration value="INVALID_SCOPING_ENTITY_TYPE"/>
 *     &lt;enumeration value="MISSING_SCOPING_ENTITY_FOR_OPERATION_STREAM"/>
 *     &lt;enumeration value="MORE_THAN_ONE_SCOPING_ENTITY_TYPE"/>
 *     &lt;enumeration value="PAYLOAD_STORE_UNAVAILABLE"/>
 *     &lt;enumeration value="REQUEST_PART_IS_OUT_OF_ORDER"/>
 *     &lt;enumeration value="TOO_MANY_OPERATION_STREAMS_IN_REQUEST_PART"/>
 *     &lt;enumeration value="TOO_MANY_OPERATIONS_IN_JOB"/>
 *     &lt;enumeration value="TOO_MANY_OPERATIONS_IN_REQUEST_PART"/>
 *     &lt;enumeration value="TOO_MANY_RESULTS_TO_STORE"/>
 *     &lt;enumeration value="TOO_MANY_SCOPING_ENTITIES"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="LOST_RESULT"/>
 *     &lt;enumeration value="UNPROCESSED_RESULT"/>
 *     &lt;enumeration value="BATCH_FAILURE"/>
 *     &lt;enumeration value="SERVICE_PROVIDED_NO_RESULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BulkMutateJobError.Reason")
@XmlEnum
public enum BulkMutateJobErrorReason {


    /**
     * 
     *                 The job selector must specify a job that has completed when a result
     *                 part is also requested to be returned.
     *               
     * 
     */
    CAN_RETURN_RESULT_FOR_ONLY_COMPLETED_JOBS,

    /**
     * 
     *                 The job selector must specify a single job when a result part is also
     *                 requested to be returned.
     *               
     * 
     */
    CAN_RETURN_RESULT_FOR_ONLY_ONE_JOB,

    /**
     * 
     *                 A bulk mutate job can be updated to add new request parts or to
     *                 set the number of request parts only until all request parts are
     *                 determined to have been received.
     *               
     * 
     */
    CANNOT_UPDATE_JOB_ONCE_ALL_REQUEST_PARTS_ARE_RECEIVED,

    /**
     * 
     *                 An operation stream in the bulk mutate request refers to an unknown or
     *                 unsupported type of scoping entity.
     *               
     * 
     */
    INVALID_SCOPING_ENTITY_TYPE,

    /**
     * 
     *                 An operation stream in the bulk mutate request does not specify a
     *                 scoping entity id.
     *               
     * 
     */
    MISSING_SCOPING_ENTITY_FOR_OPERATION_STREAM,

    /**
     * 
     *                 The operation streams in the bulk mutate request refer to more than one
     *                 type of scoping entity.
     *               
     * 
     */
    MORE_THAN_ONE_SCOPING_ENTITY_TYPE,

    /**
     * 
     *                 The request cannot be processed because the payload store (where the
     *                 request and response parts are saved) is temporarily unavailable.
     *               
     * 
     */
    PAYLOAD_STORE_UNAVAILABLE,

    /**
     * 
     *                 The request part is not the next one expected to be received.
     *               
     * 
     */
    REQUEST_PART_IS_OUT_OF_ORDER,

    /**
     * 
     *                 The number of operation streams in this request part exceeds the maximum
     *                 limit.
     *               
     * 
     */
    TOO_MANY_OPERATION_STREAMS_IN_REQUEST_PART,

    /**
     * 
     *                 The number of operations in this job exceeds the maximum limit.
     *               
     * 
     */
    TOO_MANY_OPERATIONS_IN_JOB,

    /**
     * 
     *                 The number of operations in this request part exceeds the maximum limit.
     *               
     * 
     */
    TOO_MANY_OPERATIONS_IN_REQUEST_PART,

    /**
     * 
     *                 The limit for the number of operation results to store in the bulk
     *                 mutate workflow system has been exceeded for this customer.
     *               
     * 
     */
    TOO_MANY_RESULTS_TO_STORE,

    /**
     * 
     *                 The operation streams in the bulk mutate request refer to more than the
     *                 allowed number of scoping entities.
     *               
     * 
     */
    TOO_MANY_SCOPING_ENTITIES,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A specific operation has been applied but the result was lost.
     *                 This can be returned when getting the result of a completed job.
     *               
     * 
     */
    LOST_RESULT,

    /**
     * 
     *                 A specific operation was not applied because of job failure(s).
     *                 This can be returned when getting the result of a completed job.
     *               
     * 
     */
    UNPROCESSED_RESULT,

    /**
     * 
     *                 A specific operation was not applied because another operation in the same batch failed.
     *                 This can be returned when getting the result of a completed job with other failed operations.
     *               
     * 
     */
    BATCH_FAILURE,

    /**
     * 
     *                 The operation was applied, but we got fewer results than we expected.
     *                 This can be returned when getting the result of a completed job.
     *               
     * 
     */
    SERVICE_PROVIDED_NO_RESULT;

    public String value() {
        return name();
    }

    public static BulkMutateJobErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
