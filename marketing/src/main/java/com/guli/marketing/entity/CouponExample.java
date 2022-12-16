package com.guli.marketing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdIsNull() {
            addCriterion("coupon_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdIsNotNull() {
            addCriterion("coupon_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdEqualTo(String value) {
            addCriterion("coupon_batch_id =", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdNotEqualTo(String value) {
            addCriterion("coupon_batch_id <>", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdGreaterThan(String value) {
            addCriterion("coupon_batch_id >", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_batch_id >=", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdLessThan(String value) {
            addCriterion("coupon_batch_id <", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_batch_id <=", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdLike(String value) {
            addCriterion("coupon_batch_id like", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdNotLike(String value) {
            addCriterion("coupon_batch_id not like", value, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdIn(List<String> values) {
            addCriterion("coupon_batch_id in", values, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdNotIn(List<String> values) {
            addCriterion("coupon_batch_id not in", values, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdBetween(String value1, String value2) {
            addCriterion("coupon_batch_id between", value1, value2, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andCouponBatchIdNotBetween(String value1, String value2) {
            addCriterion("coupon_batch_id not between", value1, value2, "couponBatchId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeIsNull() {
            addCriterion("redemption_code is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeIsNotNull() {
            addCriterion("redemption_code is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeEqualTo(String value) {
            addCriterion("redemption_code =", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeNotEqualTo(String value) {
            addCriterion("redemption_code <>", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeGreaterThan(String value) {
            addCriterion("redemption_code >", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("redemption_code >=", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeLessThan(String value) {
            addCriterion("redemption_code <", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeLessThanOrEqualTo(String value) {
            addCriterion("redemption_code <=", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeLike(String value) {
            addCriterion("redemption_code like", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeNotLike(String value) {
            addCriterion("redemption_code not like", value, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeIn(List<String> values) {
            addCriterion("redemption_code in", values, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeNotIn(List<String> values) {
            addCriterion("redemption_code not in", values, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeBetween(String value1, String value2) {
            addCriterion("redemption_code between", value1, value2, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andRedemptionCodeNotBetween(String value1, String value2) {
            addCriterion("redemption_code not between", value1, value2, "redemptionCode");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeIsNull() {
            addCriterion("available_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeIsNotNull() {
            addCriterion("available_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeEqualTo(Date value) {
            addCriterion("available_start_time =", value, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeNotEqualTo(Date value) {
            addCriterion("available_start_time <>", value, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeGreaterThan(Date value) {
            addCriterion("available_start_time >", value, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("available_start_time >=", value, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeLessThan(Date value) {
            addCriterion("available_start_time <", value, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("available_start_time <=", value, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeIn(List<Date> values) {
            addCriterion("available_start_time in", values, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeNotIn(List<Date> values) {
            addCriterion("available_start_time not in", values, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeBetween(Date value1, Date value2) {
            addCriterion("available_start_time between", value1, value2, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("available_start_time not between", value1, value2, "availableStartTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeIsNull() {
            addCriterion("available_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeIsNotNull() {
            addCriterion("available_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeEqualTo(Date value) {
            addCriterion("available_end_time =", value, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeNotEqualTo(Date value) {
            addCriterion("available_end_time <>", value, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeGreaterThan(Date value) {
            addCriterion("available_end_time >", value, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("available_end_time >=", value, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeLessThan(Date value) {
            addCriterion("available_end_time <", value, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("available_end_time <=", value, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeIn(List<Date> values) {
            addCriterion("available_end_time in", values, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeNotIn(List<Date> values) {
            addCriterion("available_end_time not in", values, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeBetween(Date value1, Date value2) {
            addCriterion("available_end_time between", value1, value2, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andAvailableEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("available_end_time not between", value1, value2, "availableEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}