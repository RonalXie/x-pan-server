package com.ronalxie.xpanserver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNull() {
            addCriterion("file_ext is null");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNotNull() {
            addCriterion("file_ext is not null");
            return (Criteria) this;
        }

        public Criteria andFileExtEqualTo(String value) {
            addCriterion("file_ext =", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotEqualTo(String value) {
            addCriterion("file_ext <>", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThan(String value) {
            addCriterion("file_ext >", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThanOrEqualTo(String value) {
            addCriterion("file_ext >=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThan(String value) {
            addCriterion("file_ext <", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThanOrEqualTo(String value) {
            addCriterion("file_ext <=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLike(String value) {
            addCriterion("file_ext like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotLike(String value) {
            addCriterion("file_ext not like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtIn(List<String> values) {
            addCriterion("file_ext in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotIn(List<String> values) {
            addCriterion("file_ext not in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtBetween(String value1, String value2) {
            addCriterion("file_ext between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotBetween(String value1, String value2) {
            addCriterion("file_ext not between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(Byte value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(Byte value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(Byte value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(Byte value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(Byte value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<Byte> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<Byte> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(Byte value1, Byte value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
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

        public Criteria andDelelteTimeIsNull() {
            addCriterion("delelte_time is null");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeIsNotNull() {
            addCriterion("delelte_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeEqualTo(Date value) {
            addCriterion("delelte_time =", value, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeNotEqualTo(Date value) {
            addCriterion("delelte_time <>", value, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeGreaterThan(Date value) {
            addCriterion("delelte_time >", value, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delelte_time >=", value, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeLessThan(Date value) {
            addCriterion("delelte_time <", value, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delelte_time <=", value, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeIn(List<Date> values) {
            addCriterion("delelte_time in", values, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeNotIn(List<Date> values) {
            addCriterion("delelte_time not in", values, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeBetween(Date value1, Date value2) {
            addCriterion("delelte_time between", value1, value2, "delelteTime");
            return (Criteria) this;
        }

        public Criteria andDelelteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delelte_time not between", value1, value2, "delelteTime");
            return (Criteria) this;
        }
    }

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