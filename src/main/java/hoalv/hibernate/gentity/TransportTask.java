package hoalv.hibernate.gentity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "TransportTask" database table.
 *
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="\"TransportTask\"")
@NamedQuery(name="TransportTask.findAll", query="SELECT t FROM TransportTask t")
public class TransportTask implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Column(name="\"assignedTo\"")
    private Integer assignedTo;

    @Column(name="\"assigneeType\"")
    private String assigneeType;

    @Column(name="\"batchId\"")
    private Integer batchId;

    private Double cod;

    @Column(name="\"createdBy\"")
    private Integer createdBy;

    @Column(name="\"createdTime\"")
    private Timestamp createdTime;

    @Column(name="\"customerId\"")
    private Integer customerId;

    @Column(name="\"deliverAddressFull\"")
    private String deliverAddressFull;

    @Column(name="\"deliverBefore\"")
    private Timestamp deliverBefore;

    @Column(name="\"deliverContactName\"")
    private String deliverContactName;

    @Column(name="\"deliverContactPhone\"")
    private String deliverContactPhone;

    @Column(name="\"deliverDetail\"")
    private String deliverDetail;

    @Column(name="\"deliverDistrictId\"")
    private Integer deliverDistrictId;

    @Column(name="\"deliverPlaceId\"")
    private Integer deliverPlaceId;

    @Column(name="\"deliverProvinceId\"")
    private Integer deliverProvinceId;

    @Column(name="\"deliverStreetId\"")
    private Integer deliverStreetId;

    @Column(name="\"deliverWardId\"")
    private Integer deliverWardId;

    private String description;

    @Column(name="\"failedTime\"")
    private Timestamp failedTime;

    @Column(name="\"feeType\"")
    private String feeType;

    @Column(name="\"internalReasonFail\"")
    private String internalReasonFail;

    @Column(name="\"isDeleted\"")
    private Integer isDeleted;

    @Column(name="\"jobId\"")
    private String jobId;

    @Column(name="\"modifiedBy\"")
    private Integer modifiedBy;

    @Column(name="\"modifiedTime\"")
    private Timestamp modifiedTime;

    private String note;

    @Column(name="\"objectCode\"")
    private String objectCode;

    @Column(name="\"objectId\"")
    private Integer objectId;

    @Column(name="\"objectType\"")
    private String objectType;

    @Column(name="\"pickupAddressFull\"")
    private String pickupAddressFull;

    @Column(name="\"pickupBefore\"")
    private Timestamp pickupBefore;

    @Column(name="\"pickupContactName\"")
    private String pickupContactName;

    @Column(name="\"pickupContactPhone\"")
    private String pickupContactPhone;

    @Column(name="\"pickupDetail\"")
    private String pickupDetail;

    @Column(name="\"pickupDistrictId\"")
    private Integer pickupDistrictId;

    @Column(name="\"pickupPlaceId\"")
    private Integer pickupPlaceId;

    @Column(name="\"pickupProvinceId\"")
    private Integer pickupProvinceId;

    @Column(name="\"pickupStreetId\"")
    private Integer pickupStreetId;

    @Column(name="\"pickupWardId\"")
    private Integer pickupWardId;

    @Column(name="\"realCod\"")
    private Double realCod;

    private String reason;

    @Column(name="\"reasonCode\"")
    private String reasonCode;

    @Column(name="\"requestId\"")
    private Integer requestId;

    @Column(name="\"startedTime\"")
    private Timestamp startedTime;

    private String status;

    @Column(name="\"successTime\"")
    private Timestamp successTime;

    @Column(name="\"taskDeadline\"")
    private Timestamp taskDeadline;

    @Column(name="\"taskType\"")
    private String taskType;

    private byte[] timeline;

    private String type;

    private Integer version;

    public TransportTask() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssignedTo() {
        return this.assignedTo;
    }

    public void setAssignedTo(Integer assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getAssigneeType() {
        return this.assigneeType;
    }

    public void setAssigneeType(String assigneeType) {
        this.assigneeType = assigneeType;
    }

    public Integer getBatchId() {
        return this.batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Double getCod() {
        return this.cod;
    }

    public void setCod(Double cod) {
        this.cod = cod;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getDeliverAddressFull() {
        return this.deliverAddressFull;
    }

    public void setDeliverAddressFull(String deliverAddressFull) {
        this.deliverAddressFull = deliverAddressFull;
    }

    public Timestamp getDeliverBefore() {
        return this.deliverBefore;
    }

    public void setDeliverBefore(Timestamp deliverBefore) {
        this.deliverBefore = deliverBefore;
    }

    public String getDeliverContactName() {
        return this.deliverContactName;
    }

    public void setDeliverContactName(String deliverContactName) {
        this.deliverContactName = deliverContactName;
    }

    public String getDeliverContactPhone() {
        return this.deliverContactPhone;
    }

    public void setDeliverContactPhone(String deliverContactPhone) {
        this.deliverContactPhone = deliverContactPhone;
    }

    public String getDeliverDetail() {
        return this.deliverDetail;
    }

    public void setDeliverDetail(String deliverDetail) {
        this.deliverDetail = deliverDetail;
    }

    public Integer getDeliverDistrictId() {
        return this.deliverDistrictId;
    }

    public void setDeliverDistrictId(Integer deliverDistrictId) {
        this.deliverDistrictId = deliverDistrictId;
    }

    public Integer getDeliverPlaceId() {
        return this.deliverPlaceId;
    }

    public void setDeliverPlaceId(Integer deliverPlaceId) {
        this.deliverPlaceId = deliverPlaceId;
    }

    public Integer getDeliverProvinceId() {
        return this.deliverProvinceId;
    }

    public void setDeliverProvinceId(Integer deliverProvinceId) {
        this.deliverProvinceId = deliverProvinceId;
    }

    public Integer getDeliverStreetId() {
        return this.deliverStreetId;
    }

    public void setDeliverStreetId(Integer deliverStreetId) {
        this.deliverStreetId = deliverStreetId;
    }

    public Integer getDeliverWardId() {
        return this.deliverWardId;
    }

    public void setDeliverWardId(Integer deliverWardId) {
        this.deliverWardId = deliverWardId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getFailedTime() {
        return this.failedTime;
    }

    public void setFailedTime(Timestamp failedTime) {
        this.failedTime = failedTime;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getInternalReasonFail() {
        return this.internalReasonFail;
    }

    public void setInternalReasonFail(String internalReasonFail) {
        this.internalReasonFail = internalReasonFail;
    }

    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getModifiedBy() {
        return this.modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getObjectCode() {
        return this.objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public Integer getObjectId() {
        return this.objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getPickupAddressFull() {
        return this.pickupAddressFull;
    }

    public void setPickupAddressFull(String pickupAddressFull) {
        this.pickupAddressFull = pickupAddressFull;
    }

    public Timestamp getPickupBefore() {
        return this.pickupBefore;
    }

    public void setPickupBefore(Timestamp pickupBefore) {
        this.pickupBefore = pickupBefore;
    }

    public String getPickupContactName() {
        return this.pickupContactName;
    }

    public void setPickupContactName(String pickupContactName) {
        this.pickupContactName = pickupContactName;
    }

    public String getPickupContactPhone() {
        return this.pickupContactPhone;
    }

    public void setPickupContactPhone(String pickupContactPhone) {
        this.pickupContactPhone = pickupContactPhone;
    }

    public String getPickupDetail() {
        return this.pickupDetail;
    }

    public void setPickupDetail(String pickupDetail) {
        this.pickupDetail = pickupDetail;
    }

    public Integer getPickupDistrictId() {
        return this.pickupDistrictId;
    }

    public void setPickupDistrictId(Integer pickupDistrictId) {
        this.pickupDistrictId = pickupDistrictId;
    }

    public Integer getPickupPlaceId() {
        return this.pickupPlaceId;
    }

    public void setPickupPlaceId(Integer pickupPlaceId) {
        this.pickupPlaceId = pickupPlaceId;
    }

    public Integer getPickupProvinceId() {
        return this.pickupProvinceId;
    }

    public void setPickupProvinceId(Integer pickupProvinceId) {
        this.pickupProvinceId = pickupProvinceId;
    }

    public Integer getPickupStreetId() {
        return this.pickupStreetId;
    }

    public void setPickupStreetId(Integer pickupStreetId) {
        this.pickupStreetId = pickupStreetId;
    }

    public Integer getPickupWardId() {
        return this.pickupWardId;
    }

    public void setPickupWardId(Integer pickupWardId) {
        this.pickupWardId = pickupWardId;
    }

    public Double getRealCod() {
        return this.realCod;
    }

    public void setRealCod(Double realCod) {
        this.realCod = realCod;

    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Integer getRequestId() {
        return this.requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Timestamp getStartedTime() {
        return this.startedTime;
    }

    public void setStartedTime(Timestamp startedTime) {
        this.startedTime = startedTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getSuccessTime() {
        return this.successTime;
    }

    public void setSuccessTime(Timestamp successTime) {
        this.successTime = successTime;
    }

    public Timestamp getTaskDeadline() {
        return this.taskDeadline;
    }

    public void setTaskDeadline(Timestamp taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public String getTaskType() {
        return this.taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public byte[] getTimeline() {
        return this.timeline;
    }

    public void setTimeline(byte[] timeline) {
        this.timeline = timeline;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
